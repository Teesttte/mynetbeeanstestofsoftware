package softwareengeniering2;

import java.awt.AWTEvent;
import static java.awt.AWTEvent.KEY_EVENT_MASK;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

//import Projekt.gui.firstaid.Clock;
//import Projekt.gui.firstaid.WeckanweisungsStorage;


/**
 * Die Klasse Weckvorgang ist zuständig für das manuelle Einschalten des Lichtes und das Verwalten der 
 * Weckanweisungen
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:58
 */
public class Weckvorgang /*implements PropertyChangeListener*/ {
    
        // Das kommentierte brauch man glaub ich alles nicht mehr.

	private static boolean istLichtManuellAn = false;
        private static ArrayList<Weckanweisung> weckanweisungen = new ArrayList<Weckanweisung>();
	
         
	public static void setLichtManuellAn(){
            MyGUI.getInstance().AddTextToPanel("Das Licht geht an und leuchtet nun\n");
		istLichtManuellAn = true;
	}

	public static void setLichtManuellAus(){
            MyGUI.getInstance().AddTextToPanel("Das Licht geht aus, es ist nun dunkel\n");
		istLichtManuellAn = false;
        }
        
	public static boolean getistLichtManuellAn(){
		return istLichtManuellAn;
	}
        
        public static boolean isWeckanweisungenEmpty(){
            return weckanweisungen.isEmpty();
        }
        
        public static void deleteWeckvorgang(int index) {
            weckanweisungen.remove(index);
        }
        
        public static void addWeckvorgang(Weckanweisung w){
            
            if(weckanweisungen.isEmpty()){ //Falls die Liste leer ist muss die neue Weckanweisung nicht einsortiert werden
                MyGUI.getInstance().setALARMButtonActive();
                Gui_Alarmloeschen.getInstance().addtoCombox(w);
                weckanweisungen.add(w);
               // System.out.println("Empty wurde einsortiert an Stelle: " + 0 + "Listengröße: " + weckanweisungen.size());
                ueberpruefungStarten();
            }else{ //Die Liste hat mindestens ein Element, also muss der Wert einsortiert werden.
                for(int i = 0; i < weckanweisungen.size(); i++){ //Die Schleife geht die Weckanweisungen durch um einzusortieren
                    //Hier werden die Daten der Weckanweisungen abgeglichen. Wenn w ein frueheres Datum als eine der in der Liste gespeicherten
                    //Weckanweisungen besitzt wird sie an der Stelle eingespeichert und die Liste die Schleife wird abgebrochen.
                    if(w.getJahr() < weckanweisungen.get(i).getJahr()){
                      //  System.out.println("wurde einsortiert an Stelle: " + i + "Listengröße: " + weckanweisungen.size());
                        Gui_Alarmloeschen.getInstance().addtoCombox(w);
                        MyGUI.getInstance().setALARMButtonActive();
                        weckanweisungen.add(i, w);
                        break;
                    }else if(w.getMonat() < weckanweisungen.get(i).getMonat()){
                     //   System.out.println("wurde einsortiert an Stelle: " + i + "Listengröße: " + weckanweisungen.size());
                        MyGUI.getInstance().setALARMButtonActive();
                        Gui_Alarmloeschen.getInstance().addtoCombox(w);
                        weckanweisungen.add(i, w);
                        break;                    
                    }else if(w.getTag() < weckanweisungen.get(i).getTag()){
                     //   System.out.println("wurde einsortiert an Stelle: " + i + "Listengröße: " + weckanweisungen.size());
                        MyGUI.getInstance().setALARMButtonActive();
                        Gui_Alarmloeschen.getInstance().addtoCombox(w);
                        weckanweisungen.add(i, w);
                        break;                         
                    }else if(w.getStunde() <= weckanweisungen.get(i).getStunde()){
                      //  System.out.println("wurde einsortiert an Stelle: " + i + " Listengröße: " + weckanweisungen.size());
                        MyGUI.getInstance().setALARMButtonActive();
                        Gui_Alarmloeschen.getInstance().addtoCombox(w);
                        weckanweisungen.add(i, w);
                        break;                         
                    }else if(w.getMinute() <= weckanweisungen.get(i).getMinute()){
                        //System.out.println("wurde einsortiert an Stelle: " + i + "Listengröße: " + weckanweisungen.size());
                        MyGUI.getInstance().setALARMButtonActive();
                        Gui_Alarmloeschen.getInstance().addtoCombox(w);
                        weckanweisungen.add(i, w);
                        break;                          
                    }
                    
                    //Dieser Fall tritt nur in Kraft falls das Datum von w das spaeteste ist.
                    if(i == weckanweisungen.size()){
                        MyGUI.getInstance().setALARMButtonActive();
                        Gui_Alarmloeschen.getInstance().addtoCombox(w);
                        weckanweisungen.add(i, w);
                     //   System.out.println("Letztes IF wurde einsortiert an Stelle: " + i + "Listengröße: " + weckanweisungen.size());
                    }
                }
            }
            // DAS HIER MUSS GETAN WERDEN !!!!
        //    System.out.println("BIN HIER !!!!" );
       //     System.out.println("Das Jahr ist : " + w.getJahr() + " Der Monat ist : " + w.getMonat() + " Der Tag ist : " + w.getTag());
       //     System.out.println("Die Stunde ist : " + w.getStunde() + " Die Minute ist : " + w.getMinute() );
       //     System.out.println(w.getWeckkomponente().getClass());      
        }
        
        static private void ueberpruefungStarten(){
	//	System.out.println("Überprüfung starten");
                WeckenThread t = new WeckenThread();
		t.start();
	}
        
        
        /**
         * Die statische Klasse WeckenThread sorgt dafür, dass ein Mal die Sekunde,
         * in einem neuen Thread überprüft wird, ob Die Weckzeit erreicht wurde.
         * Wenn das der Fall, wird der Weckvorgang eingeleitet
         */
        private static class WeckenThread extends Thread{
		
            Timer timer = new Timer();
            int aktuellerWochenTag;
            int aktuellertag;
            int aktuelleStunde;
            int aktuelleMinute;
                //Calendar.DAY_OF_MONTH;
            @Override
            public void run(){
             //   System.out.println("Thread startet");
                timer.scheduleAtFixedRate(new TimerTask() {
                    
                    public void run() {
                  //      System.out.print("Timer Startet");
                                // 1 = Sonntag , 7 = Samstag
                        aktuellerWochenTag = Calendar.getInstance().get( Calendar.DAY_OF_WEEK );
                        //Calendar.DAY_OF_WEEK;
                        aktuellertag = Calendar.getInstance().get( Calendar.DAY_OF_MONTH );
                        aktuelleStunde = Calendar.getInstance().get( Calendar.HOUR_OF_DAY );
                        aktuelleMinute = Calendar.getInstance().get( Calendar.MINUTE);
                   //     System.out.println("timerrun");
                        if(!weckanweisungen.isEmpty()){
                            if(weckanweisungen.get(0).getTag() == aktuellertag && weckanweisungen.get(0).getStunde() == aktuelleStunde
                                     && weckanweisungen.get(0).getMinute() == aktuelleMinute){
                               weckanweisungen.get(0).getWeckkomponente().wecken();
                               weckanweisungen.remove(0);
                            }
                        
                        }else{
                            MyGUI.getInstance().setALARMButtonUNActive();
                        }
                        //Calendar.DAY_OF_MONTH;
                        // Your database code here
                        
                    }
                }, 1000, 1000); //Timer laeuft einmal die Sekunde
            }
        
        
        }    
        
        /*

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		System.out.println("peng");
		if (arg0.getSource().equals(Clock.getInstance())) {
			System.out.println("sources are equal");
			if (WeckanweisungsStorage.getInstance().getListSize() > 0) {
				System.out.println("Liste nicht leer");
				Weckanweisung w = WeckanweisungsStorage.getInstance().getWeckanweisungAt(0);
				if (w.getJahr() != Clock.getInstance().getFrCal(Calendar.YEAR)) {
					System.out.println("Jahr");
					return;
				}
				if (w.getMonat() != Clock.getInstance().getFrCal(Calendar.MONTH) + 1) {
					System.out.println("Monat");
					return;
				}
				if (w.getTag() != Clock.getInstance().getFrCal(Calendar.DAY_OF_MONTH)) {
					System.out.println("Tag");
					return;
				}
				if (w.getStunde() != Clock.getInstance().getFrCal(Calendar.HOUR_OF_DAY)) {
					System.out.println("h");
					return;
				}
				if (w.getMinute() != Clock.getInstance().getFrCal(Calendar.MINUTE)) {
					System.out.println("m");
					return;
				}
				System.out.println("bamm");
				w.getWeckkomponente().wecken();
			}
		}
	}*/


	
}