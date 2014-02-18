package softwareengeniering2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/**
 * Die Klasse Sensor ist für das Auslesen eines Sensors zuständig
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:56
 */
public class Sensor {

	private final int Adresse;
	//private int Maske;

	/**
         * Konstruktor, der den instanziierten Sensor mit einer Adresse initialisiert
         * @param adresse Adresse des Sensors
         */
        public Sensor(int adresse){
		Adresse = adresse;
	}

        /**
         * Methode zum auslesen des Sensors
         * 
         * @return der ausgelesener Wert
         */
	public double holeWert(){
		int temp = 0; 
		try {
                        
			FileReader fr = new  FileReader("src/softwareengeniering2/Werte.txt");
			Scanner sc = new Scanner(fr);
			for(int i = 0; i <= Adresse ; ){
				//System.out.println("Das ist i : " + i);
				if(sc.hasNextInt()){
					temp = sc.nextInt();
					i++;
				}else{
					sc.next();
				}	
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Die Datei ist nicht da ....");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		return temp;
	}

}