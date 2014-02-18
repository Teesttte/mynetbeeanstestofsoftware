package softwareengeniering2;

/**
 * Die Main-Klasse, die die Hauptbenutzeroberfläche startet
 * 
 * @author 
 */
public class SoftwareEngeniering2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		MyGUI g = MyGUI.getInstance();
                g.setVisible(true);
                //Weckvorgang
                // Das hier ist to do :
               // g.zeigeaktulleMinutean();
                g.zeigeaktulleStunde();
                g.setALARMButtonUNActive();
    }    
    
}
