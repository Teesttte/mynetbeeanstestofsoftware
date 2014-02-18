package softwareengeniering2;


/**
 * Die Klasse modelliert eine Weckanweisung
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:57
 */
public class Weckanweisung {

	private int jahr;
	private Weckkomponente konkreteWeckkomponente;
	private int minute;
	private int monat;
	private int stunde;
	private int tag;

	/**
         * Konstruktor, der alle Eigenschaften des Objektes initialisiert
         * 
         * @param Stunde
         * @param Minute
         * @param Tag
         * @param Monat
         * @param Jahr
         * @param w 
         */
        public Weckanweisung(int Stunde,int Minute,int Tag, int Monat, int Jahr, Weckkomponente w){
		minute = Minute;
		stunde = Stunde;
		tag = Tag;
		monat = Monat;
		jahr = Jahr;
		konkreteWeckkomponente = w;
	}
	
	public int getMinute(){
		return minute;
	}
	public int getStunde(){
		return stunde;
	}
	public int getTag(){
		return tag;
	}
	public int getMonat(){
		return monat;
	}
	public int getJahr(){
		return jahr;
	}
	public Weckkomponente getWeckkomponente(){
		return konkreteWeckkomponente;
	}
	
}