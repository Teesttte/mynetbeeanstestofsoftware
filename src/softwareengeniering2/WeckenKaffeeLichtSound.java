package softwareengeniering2;


/**
 * Die Klasse WeckenKaffeeLichtSound ist zuständig für das Kochen des Kaffees, 
 * das Einschalten des Lichtes und das Abspielen eines Sounds, wenn der Wecker aktiv wird
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class WeckenKaffeeLichtSound extends Weckkomponente {

	public Lampe m_Lampe;
	public Sound m_Sound;

	public WeckenKaffeeLichtSound(){
		super();
	}


        @Override
	public void wecken(){
		MyGUI.getInstance().AddTextToPanel("Licht an, Sound an und Kaffee kochen\n");
		if(super.getSensor().holeWert() < super.holeLichteinschaltschwelle()){
			if(Weckvorgang.getistLichtManuellAn() == false){
				MyGUI.getInstance().AddTextToPanel("Licht und Sound an\n");
				Lampe.schalteLichtEin();
			}else{
				MyGUI.getInstance().AddTextToPanel("Das Licht ist an. Der Sound wird abgespielt.\n");
			}
		}else{
			MyGUI.getInstance().AddTextToPanel("Es ist zu hell: Sound statt Licht\n");
		}
		KaffeeKochen.kaffeeKochen();
		Sound.spieleSoundAb();
	}
        
        @Override
        public String toString() {
            String text = "Kaffee, Licht und Sound";
            return text;
        }

}