package softwareengeniering2;


/**
 * Die Klasse Gui_Alarmloeschen modelliert ein Fenster, wo die eingestellen 
 * Weckzeiten gelöscht werden können
 * 
 * @author 
 */
public class Gui_Alarmloeschen extends javax.swing.JFrame {

    /**
     * Creates new form unterGui
     */
    static private Gui_Alarmloeschen instance = null; // Anm.: Implementierung des Singleton-Entwurfsmusters
    
    public static Gui_Alarmloeschen getInstance() { // Anm.: Implementierung des Singleton-Entwurfsmusters
		if (instance == null) {
			// Instanz erzeugen
			instance = new Gui_Alarmloeschen();
		}
		return instance;
    }
    
    private Gui_Alarmloeschen() {
		initComponents();
		setVisible(false);
    }
    
   
    /**
     * Methode, die eine Weckanweisung zu der Klappliste hinzufügt
     * 
     * @param w Weckanweisung
     */
    public void addtoCombox(Weckanweisung w){
        String wecker = String.format("Wecker: am %02d.%02d.%d, um %02d:%02d mit ", 
                w.getTag(), w.getMonat(), w.getJahr(), w.getStunde(), w.getMinute());
        this.combominute.addItem(wecker + w.getWeckkomponente().toString());
        System.out.print(w.getClass());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        combominute = new javax.swing.JComboBox();
        jAnzeigenaechsteAusgabe1 = new javax.swing.JLabel();
        jAnzeigenaechsteAusgabe2 = new javax.swing.JLabel();
        Mussersetztwerdendurchhintergrundanbeimpanel = new javax.swing.JTextArea();
        TextStunde = new javax.swing.JTextArea();
        bestaetigen = new javax.swing.JButton();
        abbrechen = new javax.swing.JButton();
        Hintergrund_unter_Gui = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setLayout(null);
        jPanel1.add(combominute);
        combominute.setBounds(100, 210, 470, 70);

        jAnzeigenaechsteAusgabe1.setBackground(new java.awt.Color(255, 255, 255));
        jAnzeigenaechsteAusgabe1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jAnzeigenaechsteAusgabe1.setForeground(new java.awt.Color(204, 51, 0));
        jAnzeigenaechsteAusgabe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAnzeigenaechsteAusgabe1.setText("löschenden Alarm");
        jAnzeigenaechsteAusgabe1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jPanel1.add(jAnzeigenaechsteAusgabe1);
        jAnzeigenaechsteAusgabe1.setBounds(70, 80, 510, 80);

        jAnzeigenaechsteAusgabe2.setBackground(new java.awt.Color(255, 255, 255));
        jAnzeigenaechsteAusgabe2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jAnzeigenaechsteAusgabe2.setForeground(new java.awt.Color(204, 51, 0));
        jAnzeigenaechsteAusgabe2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAnzeigenaechsteAusgabe2.setText("Bitte wählen Sie den zu");
        jAnzeigenaechsteAusgabe2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jPanel1.add(jAnzeigenaechsteAusgabe2);
        jAnzeigenaechsteAusgabe2.setBounds(70, 20, 510, 90);

        Mussersetztwerdendurchhintergrundanbeimpanel.setEditable(false);
        Mussersetztwerdendurchhintergrundanbeimpanel.setColumns(20);
        Mussersetztwerdendurchhintergrundanbeimpanel.setRows(5);
        jPanel1.add(Mussersetztwerdendurchhintergrundanbeimpanel);
        Mussersetztwerdendurchhintergrundanbeimpanel.setBounds(80, 30, 490, 130);

        TextStunde.setEditable(false);
        TextStunde.setColumns(20);
        TextStunde.setRows(5);
        jPanel1.add(TextStunde);
        TextStunde.setBounds(90, 200, 490, 90);

        bestaetigen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bestaetigen.setForeground(new java.awt.Color(204, 0, 0));
        bestaetigen.setText("Bestätigen");
        bestaetigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bestaetigenMouseClicked(evt);
            }
        });
        jPanel1.add(bestaetigen);
        bestaetigen.setBounds(130, 350, 190, 30);

        abbrechen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        abbrechen.setForeground(new java.awt.Color(204, 0, 0));
        abbrechen.setText("Abbrechen");
        abbrechen.setMaximumSize(new java.awt.Dimension(127, 31));
        abbrechen.setMinimumSize(new java.awt.Dimension(127, 31));
        abbrechen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abbrechenMouseClicked(evt);
            }
        });
        jPanel1.add(abbrechen);
        abbrechen.setBounds(360, 350, 190, 30);

        Hintergrund_unter_Gui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareengeniering2/BlauerHintergrund_1.jpg"))); // NOI18N
        Hintergrund_unter_Gui.setMaximumSize(new java.awt.Dimension(90, 90));
        Hintergrund_unter_Gui.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.add(Hintergrund_unter_Gui);
        Hintergrund_unter_Gui.setBounds(0, 0, 640, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bestaetigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bestaetigenMouseClicked
        int weckerIndex = this.combominute.getSelectedIndex();
        Weckvorgang.deleteWeckvorgang(weckerIndex);
        this.combominute.removeItemAt(weckerIndex);
        System.out.println("Ausgewählter Wecker:" + weckerIndex);
        this.setVisible(false);
    }//GEN-LAST:event_bestaetigenMouseClicked

    private void abbrechenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abbrechenMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_abbrechenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hintergrund_unter_Gui;
    private javax.swing.JTextArea Mussersetztwerdendurchhintergrundanbeimpanel;
    private javax.swing.JTextArea TextStunde;
    private javax.swing.JButton abbrechen;
    private javax.swing.JButton bestaetigen;
    private javax.swing.JComboBox combominute;
    private javax.swing.JLabel jAnzeigenaechsteAusgabe1;
    private javax.swing.JLabel jAnzeigenaechsteAusgabe2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}