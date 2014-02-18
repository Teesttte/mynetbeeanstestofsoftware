package softwareengeniering2;


/**
 * Die Klasse Waage beschriebt die Funktionweise eines Sensors, der 
 * ein Gewicht misst und auswertet
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class Waage {

	private Sensor m_Sensor;
	private final int vollgewicht = 200;
	
	/**
         * Konstruktor, der den Sensor m_Sensor mit einer Adresse initialisiert
         */
        public Waage(){
		m_Sensor = new Sensor(2);
	}

        /**
         * Methode zum Überprüfen, ob das Gewicht gleich null ist
         * @return True, wenn das Gewicht gleicht Null ist
         */
	public boolean pruefeLeer(){

		if(0 == m_Sensor.holeWert()){ 
			return true;}
		
		MyGUI.getInstance().AddTextToPanel("Bitte stellen Sie ein leeres Gefäß auf die Waage und drücken Sie Tara \n" );
		return false;
	}

	/**
         * Methode zum Überprüfen, ob das Gwicht das vordefinierte Vollgewicht
         * erreicht hat
         * @return True, wenn das Vollgewicht erreicht worden ist
         */
        public boolean pruefeVoll(){
		return vollgewicht == m_Sensor.holeWert();
	}

}