package softwareengeniering2;

import java.util.Calendar;

/**
 * Die Klasse Gui_Weckzeit modelliert ein Fenster, wo die Weckzeit
 * eingestellt werden kann
 * 
 * @author
 */
public class Gui_Weckzeit extends javax.swing.JFrame {

    /**
     * Creates new form unterGui
     */
    static private Gui_Weckzeit instance = null; // Anm.: Implementierung des Singleton-Entwurfsmusters
    
    /**
     * Die Funktion Gui_Weckzeit erstellt eine neue Instanz, wenn
     * noch keine vorhanden ist
     * 
     * @return instance 
     */
    public static Gui_Weckzeit getInstance() { // Anm.: Implementierung des Singleton-Entwurfsmusters
		if (instance == null) {
			// Instanz erzeugen
			instance = new Gui_Weckzeit();
		}
		return instance;
    }
    
    /**
     * Der Konstruktor initialisiert die vorhandenen Komponenten im Fenster
     * und macht sie sichtbar
     */
    private Gui_Weckzeit() {
		initComponents();
		setVisible(true);
    }
    
    private boolean kaffe = false;
    private boolean licht = false;
    private boolean sound = false;
    private boolean montag = false;
    private boolean dienstag = false; 
    private boolean mittwoch = false; 
    private boolean donnerstag = false; 
    private boolean freitag = false; 
    private boolean samstag = false; 
    private boolean sonntag = false; 
        


    /**
     * Methode zum erstellen der Komponenten des Fensters und zu deren
     * Initialisierung
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LichtButton = new javax.swing.JToggleButton();
        KaffeButton = new javax.swing.JToggleButton();
        MusikButton = new javax.swing.JToggleButton();
        JBotMontag = new javax.swing.JToggleButton();
        JBotDienstag = new javax.swing.JToggleButton();
        JBotMittwoch = new javax.swing.JToggleButton();
        JBotDonnerstag = new javax.swing.JToggleButton();
        JBotFreitag = new javax.swing.JToggleButton();
        JBotSamstag = new javax.swing.JToggleButton();
        JBotSonntag = new javax.swing.JToggleButton();
        combostunde = new javax.swing.JComboBox();
        combominute = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jAnzeigenaechsteAusgabe = new javax.swing.JLabel();
        jAnzeigenaechsteAusgabe1 = new javax.swing.JLabel();
        TextStunde = new javax.swing.JTextArea();
        Mussersetztwerdendurchhintergrundanbeimpanel = new javax.swing.JTextArea();
        Mussersetztwerdendurchhintergrundanbeimpanel2 = new javax.swing.JTextArea();
        bestaetigen = new javax.swing.JButton();
        Hintergrund_unter_Gui = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setLayout(null);

        LichtButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareengeniering2/Licht-button-aus.jpg"))); // NOI18N
        LichtButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareengeniering2/Licht-button-an.jpg"))); // NOI18N
        LichtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LichtButtonMouseClicked(evt);
            }
        });
        jPanel1.add(LichtButton);
        LichtButton.setBounds(120, 330, 80, 80);

        KaffeButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        KaffeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareengeniering2/kaffee-button-aus_1.jpg"))); // NOI18N
        KaffeButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareengeniering2/kaffee-button-an.jpg"))); // NOI18N
        KaffeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaffeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(KaffeButton);
        KaffeButton.setBounds(300, 330, 80, 80);

        MusikButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareengeniering2/Musik-button-aus.jpg"))); // NOI18N
        MusikButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareengeniering2/Musik-button-an.jpg"))); // NOI18N
        MusikButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MusikButtonMouseClicked(evt);
            }
        });
        jPanel1.add(MusikButton);
        MusikButton.setBounds(470, 330, 80, 80);

        JBotMontag.setText("Montag");
        JBotMontag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JBotMontagItemStateChanged(evt);
            }
        });
        jPanel1.add(JBotMontag);
        JBotMontag.setBounds(90, 100, 110, 30);

        JBotDienstag.setText("Dienstag");
        JBotDienstag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JBotDienstagItemStateChanged(evt);
            }
        });
        jPanel1.add(JBotDienstag);
        JBotDienstag.setBounds(210, 100, 110, 30);

        JBotMittwoch.setText("Mittwoch");
        JBotMittwoch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JBotMittwochItemStateChanged(evt);
            }
        });
        jPanel1.add(JBotMittwoch);
        JBotMittwoch.setBounds(330, 100, 110, 30);

        JBotDonnerstag.setText("Donnerstag");
        JBotDonnerstag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JBotDonnerstagItemStateChanged(evt);
            }
        });
        jPanel1.add(JBotDonnerstag);
        JBotDonnerstag.setBounds(450, 100, 110, 30);

        JBotFreitag.setText("Freitag");
        JBotFreitag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JBotFreitagItemStateChanged(evt);
            }
        });
        jPanel1.add(JBotFreitag);
        JBotFreitag.setBounds(140, 140, 110, 30);

        JBotSamstag.setText("Samstag");
        JBotSamstag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JBotSamstagItemStateChanged(evt);
            }
        });
        jPanel1.add(JBotSamstag);
        JBotSamstag.setBounds(260, 140, 110, 30);

        JBotSonntag.setText("Sonntag");
        JBotSonntag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JBotSonntagItemStateChanged(evt);
            }
        });
        jPanel1.add(JBotSonntag);
        JBotSonntag.setBounds(380, 140, 110, 30);

        combostunde.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        combostunde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combostundeActionPerformed(evt);
            }
        });
        jPanel1.add(combostunde);
        combostunde.setBounds(230, 210, 70, 30);

        combominute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(combominute);
        combominute.setBounds(420, 210, 70, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Stunde :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 204, 80, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Minute :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 200, 90, 50);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jPanel1.add(jTextArea1);
        jTextArea1.setBounds(330, 200, 180, 50);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jPanel1.add(jTextArea2);
        jTextArea2.setBounds(130, 200, 180, 50);

        jAnzeigenaechsteAusgabe.setBackground(new java.awt.Color(255, 255, 255));
        jAnzeigenaechsteAusgabe.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jAnzeigenaechsteAusgabe.setForeground(new java.awt.Color(204, 51, 0));
        jAnzeigenaechsteAusgabe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAnzeigenaechsteAusgabe.setText("Womit wollen Sie geweckt werden ?");
        jAnzeigenaechsteAusgabe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jPanel1.add(jAnzeigenaechsteAusgabe);
        jAnzeigenaechsteAusgabe.setBounds(10, 260, 620, 60);

        jAnzeigenaechsteAusgabe1.setBackground(new java.awt.Color(255, 255, 255));
        jAnzeigenaechsteAusgabe1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jAnzeigenaechsteAusgabe1.setForeground(new java.awt.Color(204, 51, 0));
        jAnzeigenaechsteAusgabe1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jAnzeigenaechsteAusgabe1.setText("Bitte stellen Sie den Alarm ein");
        jAnzeigenaechsteAusgabe1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jPanel1.add(jAnzeigenaechsteAusgabe1);
        jAnzeigenaechsteAusgabe1.setBounds(70, 20, 500, 60);

        TextStunde.setEditable(false);
        TextStunde.setColumns(20);
        TextStunde.setRows(5);
        jPanel1.add(TextStunde);
        TextStunde.setBounds(80, 90, 490, 90);

        Mussersetztwerdendurchhintergrundanbeimpanel.setEditable(false);
        Mussersetztwerdendurchhintergrundanbeimpanel.setColumns(20);
        Mussersetztwerdendurchhintergrundanbeimpanel.setRows(5);
        jPanel1.add(Mussersetztwerdendurchhintergrundanbeimpanel);
        Mussersetztwerdendurchhintergrundanbeimpanel.setBounds(80, 30, 480, 40);

        Mussersetztwerdendurchhintergrundanbeimpanel2.setEditable(false);
        Mussersetztwerdendurchhintergrundanbeimpanel2.setColumns(20);
        Mussersetztwerdendurchhintergrundanbeimpanel2.setRows(5);
        jPanel1.add(Mussersetztwerdendurchhintergrundanbeimpanel2);
        Mussersetztwerdendurchhintergrundanbeimpanel2.setBounds(20, 270, 600, 40);

        bestaetigen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bestaetigen.setForeground(new java.awt.Color(204, 0, 0));
        bestaetigen.setText("Bestätigen");
        bestaetigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bestaetigenMouseClicked(evt);
            }
        });
        jPanel1.add(bestaetigen);
        bestaetigen.setBounds(240, 420, 190, 30);

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

    /**
     * Methode zum Aktivieren bzw. Deaktivieren der Option "Kaffee kochen" bei
     * der eingestellten Weckzeit
     * @param evt 
     */
    private void KaffeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaffeButtonMouseClicked
        System.out.print(kaffe);
        if (kaffe == false){
            kaffe = true;
        }else{
            kaffe = false;
        }
    }//GEN-LAST:event_KaffeButtonMouseClicked

    /**
     * Methode zum Aktivieren bzw. Deaktivieren der Option "Musik abspielen" bei
     * der eingestellten Weckzeit
     * @param evt 
     */
    private void MusikButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MusikButtonMouseClicked
        System.out.print(sound);
        if (sound == false){
            sound = true;
        }else{
            sound = false;
        }
    }//GEN-LAST:event_MusikButtonMouseClicked

    /**
     * Methode zum Aktivieren bzw. Deaktivieren der Option "Licht einschalten" bei
     * der eingestellten Weckzeit
     * @param evt 
     */
    private void LichtButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LichtButtonMouseClicked
        System.out.print(licht);
        if (licht == false){
            licht = true;
        }else{
            licht = false;
        }
    }//GEN-LAST:event_LichtButtonMouseClicked

    /**
     * Methode, die Weckeinstellungen (Datum, Uhrzeit und Optionen) abspeichert
     * und das Fenster schließt
     * @param evt 
     */
    private void bestaetigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bestaetigenMouseClicked
              
        Weckkomponente komp = null;
        if(kaffe == true && licht == true && sound == true){
            
            komp = new WeckenKaffeeLichtSound();
        }
        if(kaffe == true && licht == true && sound == false){
            komp = new WeckenKaffeeLicht();
        }
        if(kaffe == true && licht == false && sound == true){
            komp = new WeckenKaffeeSound();
        }
        if(kaffe == true && licht == false && sound == false){
            komp = new WeckenKaffee();
        }
        if(kaffe == false && licht == true && sound == true){
            komp = new WeckenLichtSound();
        }
        if(kaffe == false && licht == true && sound == false){
            komp = new WeckenLicht();
        }
        if(kaffe == false && licht == false && sound == true){
            komp = new WeckenSound();
        }
        if(kaffe == false && licht == false && sound == false){
            komp = null;
        }
        
        Calendar aktuell = Calendar.getInstance();
        //combostunde
        String llendeStunde = (String) this.combostunde.getSelectedItem();
        String llendeMinute = (String) this.combominute.getSelectedItem();
        int zustellendeStunde =  Integer.parseInt(llendeStunde) ;
        int zustellendeMinute = Integer.parseInt(llendeMinute) ;
               
                
        // 1 = Sonntag , 7 = Samstag
        int aktuellerWochenTag = Calendar.getInstance().get( Calendar.DAY_OF_WEEK );
                //Calendar.DAY_OF_WEEK;
        
        int aktuellertag = Calendar.getInstance().get( Calendar.DAY_OF_MONTH );
                //Calendar.DAY_OF_MONTH;
        
                
        /*
        // THEROTISCH Müsste ma
        * ACHTUNG HIER MÜSSTE MAN NOCH SCHAUEN, OB MAN SO IN DEN NÄCHSTEN MONAT, BZW. NÄCHSTE JAHR KOMMT. DAS MACH ICH JETZT NICHT .......
        * 
        * ACHTUNG DADURCH KÖNNEN FEHLER ENTSTEHEN !!!!
        */
        int tag = 0;
        if(komp != null){
            System.out.print(komp.toString());
        switch(aktuellerWochenTag){
            case 1:
                // Wenn wir gerade Sonntag haben
                if (montag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 1, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(dienstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 2, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(mittwoch == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 3, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(donnerstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 4, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(freitag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 5, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(samstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 6, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(sonntag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag , Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));   
                }
                break;
            case 2:
                // Wenn wir gerade Montag haben
                if (montag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag , Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));   
                }
                if(dienstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 1, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(mittwoch == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 2, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(donnerstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 3, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(freitag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 4, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(samstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 5, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(sonntag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 6, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                break;
            case 3 :
                // Wenn wir gerade Dienstag haben
                if (montag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 6, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(dienstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag , Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));   
                }
                if(mittwoch == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 1, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(donnerstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 2, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(freitag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 3, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(samstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 4, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(sonntag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 5, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                break;
            case 4 :
                // Wenn wir gerade Mittwoch haben
                if (montag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 5, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(dienstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 6, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(mittwoch == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag , Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));   
                }
                if(donnerstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 1, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(freitag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 2, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(samstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 3, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(sonntag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 4, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                break;
            case 5 :
                // Wenn wir gerade Donnerstag haben
                if (montag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 4, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(dienstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 5, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(mittwoch == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 6, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(donnerstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag , Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));   
                }
                if(freitag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 1, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(samstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 2, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(sonntag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 3, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                break;
            case 6 :
                // Wenn wir gerade Freitag haben
                if (montag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 6, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(dienstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 5, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(mittwoch == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 4, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(donnerstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 3, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(freitag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag , Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));   
                }
                if(samstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 1, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(sonntag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 2, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                break;
            case 7 :
                // Wenn wir gerade Samstag haben
                if (montag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 2, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(dienstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 3, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(mittwoch == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 4, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(donnerstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 5, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(freitag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 6, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                if(samstag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag , Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));   
                }
                if(sonntag == true){
                    Weckvorgang.addWeckvorgang(new Weckanweisung(zustellendeStunde, zustellendeMinute, aktuellertag + 1, Calendar.getInstance().get( Calendar.MONTH) + 1, Calendar.getInstance().get( Calendar.YEAR ), komp));
                }
                break;
        }
        }//end if
        montag = false;
        dienstag = false; 
        mittwoch = false; 
        donnerstag = false; 
        freitag = false; 
        samstag = false; 
        sonntag = false; 
        this.setVisible(false);
        this.instance = null;
    }//GEN-LAST:event_bestaetigenMouseClicked

    
    /**
     * Methode
     * @param evt 
     */
    private void JBotMontagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JBotMontagItemStateChanged
        if (montag == false){
            montag = true;
        }else{
            montag = false;
        }
    }//GEN-LAST:event_JBotMontagItemStateChanged

    private void JBotDienstagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JBotDienstagItemStateChanged
        // TODO add your handling code here:
        if (dienstag == false){
            dienstag = true;
        }else{
            dienstag = false;
        }
    }//GEN-LAST:event_JBotDienstagItemStateChanged

    private void JBotMittwochItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JBotMittwochItemStateChanged
        // TODO add your handling code here:
        if (mittwoch == false){
            mittwoch = true;
        }else{
            mittwoch = false;
        }
    }//GEN-LAST:event_JBotMittwochItemStateChanged

    private void JBotDonnerstagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JBotDonnerstagItemStateChanged
        // TODO add your handling code here:
        if (donnerstag == false){
            donnerstag = true;
        }else{
            donnerstag = false;
        }
    }//GEN-LAST:event_JBotDonnerstagItemStateChanged

    private void JBotFreitagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JBotFreitagItemStateChanged
        // TODO add your handling code here:
        if (freitag == false){
            freitag = true;
        }else{
            freitag = false;
        }
    }//GEN-LAST:event_JBotFreitagItemStateChanged

    private void JBotSamstagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JBotSamstagItemStateChanged
        // TODO add your handling code here:
        if (samstag == false){
            samstag = true;
        }else{
            samstag = false;
        }
    }//GEN-LAST:event_JBotSamstagItemStateChanged

    private void JBotSonntagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JBotSonntagItemStateChanged
        // TODO add your handling code here:
        if (sonntag == false){
            sonntag = true;
        }else{
            sonntag = false;
        }
    }//GEN-LAST:event_JBotSonntagItemStateChanged

    private void combostundeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combostundeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combostundeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hintergrund_unter_Gui;
    private javax.swing.JToggleButton JBotDienstag;
    private javax.swing.JToggleButton JBotDonnerstag;
    private javax.swing.JToggleButton JBotFreitag;
    private javax.swing.JToggleButton JBotMittwoch;
    private javax.swing.JToggleButton JBotMontag;
    private javax.swing.JToggleButton JBotSamstag;
    private javax.swing.JToggleButton JBotSonntag;
    private javax.swing.JToggleButton KaffeButton;
    private javax.swing.JToggleButton LichtButton;
    private javax.swing.JToggleButton MusikButton;
    private javax.swing.JTextArea Mussersetztwerdendurchhintergrundanbeimpanel;
    private javax.swing.JTextArea Mussersetztwerdendurchhintergrundanbeimpanel2;
    private javax.swing.JTextArea TextStunde;
    private javax.swing.JButton bestaetigen;
    private javax.swing.JComboBox combominute;
    private javax.swing.JComboBox combostunde;
    private javax.swing.JLabel jAnzeigenaechsteAusgabe;
    private javax.swing.JLabel jAnzeigenaechsteAusgabe1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
