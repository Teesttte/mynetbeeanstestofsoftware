package softwareengeniering2;


/**
 * Die Klasse Motor ist für die Steuerung eins Motors zuständig
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:56
 */
public class Motor {
	
	private final String name; 
	
	/**
         * Konstruktor, der den instanziierten Motor mit einem Namen initialisiert
         * @param Name Name des Motors
         */
        public Motor(String Name){
		name = Name;

	}

	/**
         * Methode zum Auschalten des Motors
         */
        public void aus(){
            MyGUI.getInstance().AddTextToPanel("Motor geht aus. " + name + "\n");
	}
	
	/**
         * Methode zum Einschalten des Motors mit einer Linksdrehung
         */
        public void links(){
            MyGUI.getInstance().AddTextToPanel("Motor dreht links. " + name + "\n");
	}

	/**
         * Methode zum Einschalten des Motors mit einer Rechtsdrehung
         */
        public void rechts(){
            MyGUI.getInstance().AddTextToPanel("Motor dreht rechts. " + name + "\n");
	}

}