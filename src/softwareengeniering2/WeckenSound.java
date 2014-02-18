package softwareengeniering2;


/**
 * Die Klasse WeckenSound ist zuständig für das Abspielen eines Soundes, 
 * wenn der Wecker aktiv wird
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class WeckenSound extends Weckkomponente {

	public Sound m_Sound;

	public WeckenSound(){
		super();
	}


        @Override
	public void wecken(){
		MyGUI.getInstance().AddTextToPanel("Sound an\n");
		Sound.spieleSoundAb();
	}
        
        @Override
        public String toString() {
            String text = "Sound";
            return text;
        }

}