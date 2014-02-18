package softwareengeniering2;


/**
 * Die Klasse WeckenKaffee ist zuständig für das Kochen des Kaffees, wenn 
 * der Wecker aktiv wird
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class WeckenKaffee extends Weckkomponente {

	public WeckenKaffee(){
		super();
	}

        @Override
	public void wecken(){
		MyGUI.getInstance().AddTextToPanel("Kaffee kochen\n");
		KaffeeKochen.kaffeeKochen();
	}
        
        @Override
        public String toString() {
            String text = "Kaffee";
            return text;
        }

}