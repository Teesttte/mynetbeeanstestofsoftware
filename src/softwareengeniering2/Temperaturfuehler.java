package softwareengeniering2;


/**
 * Die Klasse Temperaturfuehler beschriebt die Funktionweise eines Sensors, der 
 * die Temperatur misst und auswertet
 * 
 * @author
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class Temperaturfuehler {

	private final int maximalTemp = 100;
	private Sensor m_Sensor;

	/**
         * Konstruktor, der den Sensor m_Sensor mit einer Adresse initialisiert
         */
        public Temperaturfuehler(){
		m_Sensor = new Sensor(0);
	}

        /**
         * Methode zum Überprüfen der aus dem Sensor eingelsenen Temperatur
         * 
         * @return ob die ausgelesene Temperatur den Maximalwert übersteigt
         */
	public boolean pruefeTemperatur(){		
		return maximalTemp >= m_Sensor.holeWert();
	}

}