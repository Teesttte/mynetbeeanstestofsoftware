package softwareengeniering2;

/**
 * Die Klasse KaffeeKochen´ist für den Kochvorgang des Kaffees zuständig
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:56
 */
public class KaffeeKochen{


	public static Dosierung m_Dosierung;
	public static Waage m_Waage = new Waage();
	public static Motor KaffeeFoerderschnecke = new Motor("KaffeeFoerderschnecke");
	public static Temperaturfuehler temperaturfuehler = new Temperaturfuehler();
	public static Aktor Wasserkocher = new Aktor("Wasserkocher");
	public static Aktor Wasserpumpe = new Aktor("Wasserpumpe");


	/**
         * Die statische Klasse KaffeThread sorgt dafür, dass der Kochvorgang abgearbeitet kann,
         * ohne dass die GUI einfriert.
         * Hier werden die Sensoren abgefragt und die Werte ausgewertet und dementsprechend
         * die zuständigen Aktoren und Motoren gesteuert
         */
        private static class KaffeeThread extends Thread{
		
                @Override
		public void run(){
			//public void run(){
			

			if(!m_Waage.pruefeLeer()  ){
				MyGUI.getInstance().AddTextToPanel("Kann keinen Kaffee kochen, die Tasse ist noch voll.\n");
				MyGUI.getInstance().setKaffeButtonActive();
				return;
			}
			
			Wasserkocher.ein();
			while(!temperaturfuehler.pruefeTemperatur()){
				MyGUI.getInstance().AddTextToPanel("Warte, bis es heiß ist.\n");
				//GUI.getInstance().repaint();

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {			}
			}
			Wasserkocher.aus();
			KaffeeFoerderschnecke.links();
			//Warte auf Dosierung. Später einfügen.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {			}
			KaffeeFoerderschnecke.aus();
			Wasserpumpe.ein();
			while(!m_Waage.pruefeVoll()){
				MyGUI.getInstance().AddTextToPanel("Warte, bis es voll ist\n");
				//GUI.getInstance().repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {			}
			}
			Wasserpumpe.aus();
			MyGUI.getInstance().setKaffeButtonActive();
			MyGUI.getInstance().AddTextToPanel("Kaffee im Becher - Mit viel Liebe\n");
						
		}
	}

	/**
         * Konstruktor, der ein neues Thread erstellt und den Kochvorgang startet
         */
        static public void kaffeeKochen(){
                MyGUI.getInstance().setKaffeButtonUnactive();
		KaffeeThread k = new KaffeeThread();
		k.start();
	}
}