package softwareengeniering2;


/**
 * Die Klasse WeckenKaffeeLicht ist zuständig das Kochen des Kaffees und 
 * Einschalten des Lichtes, wenn der Wecker aktiv wird
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class WeckenKaffeeLicht extends Weckkomponente {

	public Lampe m_Lampe;

	public WeckenKaffeeLicht(){
		super();
	}


        @Override
	public void wecken(){
		MyGUI.getInstance().AddTextToPanel("Licht an und Kaffee kochen\n");
		if(super.getSensor().holeWert() < super.holeLichteinschaltschwelle()){
			if(Weckvorgang.getistLichtManuellAn() == false){
				MyGUI.getInstance().AddTextToPanel("Licht und Sound an\n");
				Lampe.schalteLichtEin();
			}else{
				MyGUI.getInstance().AddTextToPanel("Das Licht ist an. Der Sound wird abgespielt.\n");
			}
		}else{
			Sound.spieleSoundAb();
			MyGUI.getInstance().AddTextToPanel("Es ist zu hell: Sound statt Licht\n");
		}
		KaffeeKochen.kaffeeKochen();
	}
        
        @Override
        public String toString() {
            String text = "Kaffee und Licht";
            return text;
        }

}