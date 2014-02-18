package softwareengeniering2;


/**
 * Die Klasse Lampe ist für das Ein- und Ausschalten der Lampe zuständig
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:56
 */
public class Lampe {

        /**
         * Methode zum Auschalten des Lichtes
         */
	public static void schalteLichtAus(){
            MyGUI.getInstance().AddTextToPanel("Das Licht geht aus.\n");
        }

	/**
         * Methode zum Einschalten des Lichtes
         */
        public static void schalteLichtEin(){
            MyGUI.getInstance().AddTextToPanel("Das Licht geht an.\n");
	}

}