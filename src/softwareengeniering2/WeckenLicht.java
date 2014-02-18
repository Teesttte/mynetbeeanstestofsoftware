package softwareengeniering2;


/**
 * Die Klasse WeckenLicht ist zuständig für das Einschalten des Lichtes, wenn der Wecker aktiv wird
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class WeckenLicht extends Weckkomponente {

	public WeckenLicht(){
		super();
	}


        @Override
	public void wecken(){
		MyGUI.getInstance().AddTextToPanel("Licht an");
		if(super.getSensor().holeWert() < super.holeLichteinschaltschwelle()){
			if(Weckvorgang.getistLichtManuellAn() == false){
				MyGUI.getInstance().AddTextToPanel("Licht an");
				Lampe.schalteLichtEin();
			}else{
				MyGUI.getInstance().AddTextToPanel("Das Licht ist an. Der Sound wird abgespielt.\n");
				Sound.spieleSoundAb();
			}
		}else{
			Sound.spieleSoundAb();
			MyGUI.getInstance().AddTextToPanel("Es ist zu hell: Sound statt Licht\n");
		}
	}
        
        @Override
        public String toString() {
            String text = "Licht";
            return text;
        }
        

}