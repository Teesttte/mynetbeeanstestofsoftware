package softwareengeniering2;


/**
 * Die Klasse WeckenLichtSound ist zuständig für das Einschalten des Lichtes und 
 * das Abspielen eines Soundes, wenn der Wecker aktiv wird
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class WeckenLichtSound extends Weckkomponente {

	public Lampe m_Lampe;
	public Sound m_Sound;

	public WeckenLichtSound(){
		super();
	}


        @Override
	public void wecken(){
		
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
		Sound.spieleSoundAb();
	}
        
        @Override
        public String toString() {
            String text = "Licht und Sound";
            return text;
        }

}