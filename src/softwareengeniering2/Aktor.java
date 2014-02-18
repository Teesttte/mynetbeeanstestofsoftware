package softwareengeniering2;


/**
 * Die Klasse Aktor modelliert ein einfaches Gerät mit einer aus- und ein-Funktionen
 * 
 * @author
 * @version 1.0
 * @created 16-Dez-2013 19:40:55
 */
public class Aktor {

	private final String Name;
	
	public Aktor(String name){
		Name = name;
	}
	
        /**
         * Methode zum Auschalten des Gerätes
         */
	public void aus() {
            MyGUI.getInstance().AddTextToPanel("Das Geraet " + Name + " schaltet sich aus.\n");
	}

        /**
         * Methode zum Einschalten des Gerätes
         */
	public void ein() {
            MyGUI.getInstance().AddTextToPanel("Das Geraet " + Name + " schaltet sich ein.\n");
	}

}