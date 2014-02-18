package softwareengeniering2;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 * Die Klasse Sound ist für das Abspielen uns Stoppen eines Sounds zuständig
 * 
 * @author 
 * @version 1.0
 * @created 16-Dez-2013 19:40:56
 */
public class Sound{ 

	private static Clip clip;
	//private static AePlayWave aw = new AePlayWave("C:\\Users\\s782659\\workspace\\Softwareeng2\\src\\Projekt\\batman.wav");

	//private  static URL url = System.class.getClass().getResource("batman.wav");
	//private  static URL url = new URL("batman.wav");
	//private static AudioClip clip = Applet.newAudioClip(url);

        /**
         * Statische Methode zum Abspielen des Sounds
         */
	public static void spieleSoundAb(){


		try {
		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;

		    stream = AudioSystem.getAudioInputStream(new File("src/softwareengeniering2/starwars.wav"));
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		}
		catch (Exception e) {
			System.out.println("sound geht net " + e);
			
		}
		
	}

	/**
         * Statische Methode zum Stoppen des Sounds
         */
        public static void StoppeSound(){
		try {
		clip.stop();
		System.out.println("Sound geht aus");
		}
		catch (Exception e) {
			System.out.println("sound geht nicht " + e);
			
		}

	}

}