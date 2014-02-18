package softwareengeniering2;


/**
 * Die Klasse WeckenKaffeeSound ist zuständig für das Kochen des Kaffees 
 * und das Abspielen eines Sounds, wenn der Wecker aktiv wird
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class WeckenKaffeeSound extends Weckkomponente {

	public Sound m_Sound;

	public WeckenKaffeeSound(){
		super();
	}

        @Override
	public void wecken(){
		MyGUI.getInstance().AddTextToPanel("Sound an und Kaffee kochen\n");
		Sound.spieleSoundAb();
		KaffeeKochen.kaffeeKochen();
	}
        
        @Override
        public String toString() {
            String text = "Kaffee und Sound";
            return text;
        }

}