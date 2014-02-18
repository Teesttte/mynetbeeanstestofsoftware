package softwareengeniering2;


/**
 * Die Klasse Weckkomponente ist die Oberklasse von anderen Klassen, die das Wecken 
 * mit verschieden Weckoptionen implementieren.
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:58
 */
public class Weckkomponente {

	private int Lichteinschaltschwelle = 100;
	private Sensor m_Sensor;
	//public Weckanweisung m_Weckanweisung;

	public Weckkomponente(){
		m_Sensor = new Sensor(1);
		//m_Weckanweisung = w;
	}

        public void wecken(){
		MyGUI.getInstance().AddTextToPanel("RING RING ... \n");
	}
	public int holeLichteinschaltschwelle(){
		return Lichteinschaltschwelle;
	}
	
	public Sensor getSensor(){
		return m_Sensor;
	}

}