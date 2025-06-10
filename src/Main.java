import com.formdev.flatlaf.FlatLightLaf;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.player.Player;

public class Main extends javax.swing.JFrame {

    public Main() {
        calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        initComponents();
        this.setLocationRelativeTo(null);
        init_date_labels();
        showPanels();
        scroll.getVerticalScrollBar().setUnitIncrement(30);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create_event_dialog = new javax.swing.JDialog();
        title_label = new javax.swing.JLabel();
        title_of_event = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        event_date_choοser = new com.toedter.calendar.JDateChooser();
        desc_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc_of_event = new javax.swing.JTextArea();
        saveButton1 = new SaveButton();
        cancelButton1 = new CancelButton();
        confirmation_dialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        error_dialog = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        edit_dialog = new javax.swing.JDialog();
        cancelButton2 = new CancelButton();
        title_label1 = new javax.swing.JLabel();
        title_of_event1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        event_date_choοser1 = new com.toedter.calendar.JDateChooser();
        desc_label1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        desc_of_event1 = new javax.swing.JTextArea();
        saveButton2 = new SaveButton();
        save_edit_dialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        delete_dialog = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yes_Button1 = new Yes_Button();
        no_Button1 = new No_Button();
        deleted_event_dialog = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        todays_events_notification = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        confirmation_dialog1 = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        friends_delete = new javax.swing.JDialog();
        deleteButton22 = new DeleteButton2();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        surnamefield = new javax.swing.JTextField();
        deleted_person = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        fail_del = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        adeios = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        delete2_dialog = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        yes_Button2 = new Yes_Button();
        no_Button2 = new No_Button();
        happy_birthday = new javax.swing.JDialog();
        confetti_label = new javax.swing.JLabel();
        xronia = new javax.swing.JLabel();
        gen = new javax.swing.JLabel();
        euxes = new javax.swing.JLabel();
        happy_nameday = new javax.swing.JDialog();
        confetti_label1 = new javax.swing.JLabel();
        xronia1 = new javax.swing.JLabel();
        gio = new javax.swing.JLabel();
        euxes1 = new javax.swing.JLabel();
        info = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        arxikh_panel = new javax.swing.JPanel();
        customCalendar = new CustomCalendar();
        day_label = new javax.swing.JLabel();
        date_num_label = new javax.swing.JLabel();
        month_label = new javax.swing.JLabel();
        year_label = new javax.swing.JLabel();
        addButton1 = new AddButton();
        infoHelpButton1 = new InfoHelpButton();
        scroll = new javax.swing.JScrollPane();
        outerPanel = new javax.swing.JPanel();
        form_panel = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        surname_label = new javax.swing.JLabel();
        genethlia_label = new javax.swing.JLabel();
        giorth_label = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        name_info = new javax.swing.JLabel();
        surname_info = new javax.swing.JLabel();
        genethlia_info = new javax.swing.JLabel();
        giorth_info = new javax.swing.JLabel();
        insertButton1 = new InsertButton();
        MonthChooserGen = new com.toedter.calendar.JMonthChooser();
        MonthChooserGio = new com.toedter.calendar.JMonthChooser();
        spinGen = new com.toedter.components.JSpinField();
        spinGio = new com.toedter.components.JSpinField();
        friends_panel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        friends_table = new javax.swing.JTable();
        deleteButton21 = new DeleteButton2();
        about_panel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        create_event_dialog.setTitle("Προσθήκη γεγονότος");
        create_event_dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                create_event_dialogWindowClosing(evt);
            }
        });

        title_label.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        title_label.setForeground(new java.awt.Color(0, 0, 0));
        title_label.setText("Τίτλος:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ημερομηνία:");

        desc_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        desc_label.setForeground(new java.awt.Color(0, 0, 0));
        desc_label.setText("Λεπτομέρειες:");

        desc_of_event.setColumns(20);
        desc_of_event.setLineWrap(true);
        desc_of_event.setRows(5);
        desc_of_event.setWrapStyleWord(true);
        jScrollPane1.setViewportView(desc_of_event);

        saveButton1.setRadius(13);
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        cancelButton1.setRadius(13);
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout create_event_dialogLayout = new javax.swing.GroupLayout(create_event_dialog.getContentPane());
        create_event_dialog.getContentPane().setLayout(create_event_dialogLayout);
        create_event_dialogLayout.setHorizontalGroup(
            create_event_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_event_dialogLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(create_event_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(event_date_choοser, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title_of_event, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_label)
                    .addComponent(jLabel3)
                    .addComponent(title_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(create_event_dialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        create_event_dialogLayout.setVerticalGroup(
            create_event_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_event_dialogLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(title_label)
                .addGroup(create_event_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_event_dialogLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(title_of_event, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(event_date_choοser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(desc_label)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_event_dialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        confirmation_dialog.setTitle("Επιτυχής προσθήκη γεγονότος");
        confirmation_dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                confirmation_dialogWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(115,219,146));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Το γεγονός προστέθηκε με επιτυχία!");

        javax.swing.GroupLayout confirmation_dialogLayout = new javax.swing.GroupLayout(confirmation_dialog.getContentPane());
        confirmation_dialog.getContentPane().setLayout(confirmation_dialogLayout);
        confirmation_dialogLayout.setHorizontalGroup(
            confirmation_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmation_dialogLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34))
        );
        confirmation_dialogLayout.setVerticalGroup(
            confirmation_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmation_dialogLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        error_dialog.setTitle("Σφάλμα");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Συμπληρώστε όλα τα απαραίτητα πεδία!");

        javax.swing.GroupLayout error_dialogLayout = new javax.swing.GroupLayout(error_dialog.getContentPane());
        error_dialog.getContentPane().setLayout(error_dialogLayout);
        error_dialogLayout.setHorizontalGroup(
            error_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(error_dialogLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        error_dialogLayout.setVerticalGroup(
            error_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(error_dialogLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        edit_dialog.setTitle("Επεξεργασία γεγονότος");

        cancelButton2.setRadius(13);
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        title_label1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        title_label1.setForeground(new java.awt.Color(0, 0, 0));
        title_label1.setText("Τίτλος:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ημερομηνία:");

        desc_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        desc_label1.setForeground(new java.awt.Color(0, 0, 0));
        desc_label1.setText("Λεπτομέρειες:");

        desc_of_event1.setColumns(20);
        desc_of_event1.setRows(5);
        jScrollPane3.setViewportView(desc_of_event1);

        saveButton2.setRadius(13);
        saveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_dialogLayout = new javax.swing.GroupLayout(edit_dialog.getContentPane());
        edit_dialog.getContentPane().setLayout(edit_dialogLayout);
        edit_dialogLayout.setHorizontalGroup(
            edit_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_dialogLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(edit_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(event_date_choοser1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title_of_event1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_label1)
                    .addComponent(jLabel5)
                    .addComponent(title_label1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(edit_dialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(cancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        edit_dialogLayout.setVerticalGroup(
            edit_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_dialogLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(title_label1)
                .addGroup(edit_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_dialogLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(title_of_event1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(event_date_choοser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(desc_label1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(cancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edit_dialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        save_edit_dialog.setTitle("Επιτυχής επεξεργασία γεγονότος");
        save_edit_dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                save_edit_dialogWindowClosing(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new Color(115,219,146));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Οι αλλαγές σας αποθηκεύτηκαν επιτυχώς!");

        javax.swing.GroupLayout save_edit_dialogLayout = new javax.swing.GroupLayout(save_edit_dialog.getContentPane());
        save_edit_dialog.getContentPane().setLayout(save_edit_dialogLayout);
        save_edit_dialogLayout.setHorizontalGroup(
            save_edit_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_edit_dialogLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        save_edit_dialogLayout.setVerticalGroup(
            save_edit_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_edit_dialogLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel6)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        delete_dialog.setTitle("ΔΙΑΓΡΑΦΗ ΓΕΓΟΝΟΤΟΣ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Θέλετε να διαγράψετε το γεγονός;");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/error_icon.png"))); // NOI18N

        yes_Button1.setRadius(11);
        yes_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_Button1ActionPerformed(evt);
            }
        });

        no_Button1.setRadius(11);
        no_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_dialogLayout = new javax.swing.GroupLayout(delete_dialog.getContentPane());
        delete_dialog.getContentPane().setLayout(delete_dialogLayout);
        delete_dialogLayout.setHorizontalGroup(
            delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_dialogLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_dialogLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_dialogLayout.createSequentialGroup()
                        .addComponent(yes_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(no_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        delete_dialogLayout.setVerticalGroup(
            delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_dialogLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yes_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        deleted_event_dialog.setTitle("Διαγραφή γεγονότος");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Το γεγονός διαγράφηκε.");

        javax.swing.GroupLayout deleted_event_dialogLayout = new javax.swing.GroupLayout(deleted_event_dialog.getContentPane());
        deleted_event_dialog.getContentPane().setLayout(deleted_event_dialogLayout);
        deleted_event_dialogLayout.setHorizontalGroup(
            deleted_event_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleted_event_dialogLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(91, 91, 91))
        );
        deleted_event_dialogLayout.setVerticalGroup(
            deleted_event_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleted_event_dialogLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        todays_events_notification.setTitle("ΕΙΔΟΠΟΙΗΣΗ ΓΕΓΟΝΟΤΩΝ");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ringing_bell.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Υπάρχουν νέα γεγονότα για σήμερα! ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Πηγαίντε στην καρτέλα των γεγονότων για να τα δείτε.");

        javax.swing.GroupLayout todays_events_notificationLayout = new javax.swing.GroupLayout(todays_events_notification.getContentPane());
        todays_events_notification.getContentPane().setLayout(todays_events_notificationLayout);
        todays_events_notificationLayout.setHorizontalGroup(
            todays_events_notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, todays_events_notificationLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(todays_events_notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        todays_events_notificationLayout.setVerticalGroup(
            todays_events_notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todays_events_notificationLayout.createSequentialGroup()
                .addGroup(todays_events_notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(todays_events_notificationLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(todays_events_notificationLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        confirmation_dialog1.setTitle("Επιτυχής προσθήκη στοιχείων");
        confirmation_dialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                confirmation_dialog1WindowClosing(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new Color(115,219,146));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Τα στοιχεία προστέθηκαν με επιτυχία!");

        javax.swing.GroupLayout confirmation_dialog1Layout = new javax.swing.GroupLayout(confirmation_dialog1.getContentPane());
        confirmation_dialog1.getContentPane().setLayout(confirmation_dialog1Layout);
        confirmation_dialog1Layout.setHorizontalGroup(
            confirmation_dialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmation_dialog1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(38, 38, 38))
        );
        confirmation_dialog1Layout.setVerticalGroup(
            confirmation_dialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmation_dialog1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        friends_delete.setTitle("Διαγραφή στοιχείων");

        deleteButton22.setRadius(13);
        deleteButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton22ActionPerformed(evt);
            }
        });

        nameLabel.setFont(new Font("Arvo", Font.PLAIN, 14));
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Όνομα:");

        surnameLabel.setFont(new Font("Arvo", Font.PLAIN, 14));
        surnameLabel.setForeground(new java.awt.Color(0, 0, 0));
        surnameLabel.setText("Επίθετο:");

        javax.swing.GroupLayout friends_deleteLayout = new javax.swing.GroupLayout(friends_delete.getContentPane());
        friends_delete.getContentPane().setLayout(friends_deleteLayout);
        friends_deleteLayout.setHorizontalGroup(
            friends_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friends_deleteLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(friends_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surnameLabel)
                    .addComponent(nameLabel))
                .addGap(54, 54, 54)
                .addGroup(friends_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friends_deleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        friends_deleteLayout.setVerticalGroup(
            friends_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friends_deleteLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(friends_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(35, 35, 35)
                .addGroup(friends_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameLabel))
                .addGap(37, 37, 37)
                .addComponent(deleteButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        deleted_person.setTitle("Επιτυχής διαγραφή ατόμου");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Το άτομο διαγράφηκε.");

        javax.swing.GroupLayout deleted_personLayout = new javax.swing.GroupLayout(deleted_person.getContentPane());
        deleted_person.getContentPane().setLayout(deleted_personLayout);
        deleted_personLayout.setHorizontalGroup(
            deleted_personLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleted_personLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        deleted_personLayout.setVerticalGroup(
            deleted_personLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleted_personLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        fail_del.setTitle("Αποτυχία διαγραφής");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Δεν βρέθηκε άτομο με τα συγκεκριμένα στοιχεία.");

        javax.swing.GroupLayout fail_delLayout = new javax.swing.GroupLayout(fail_del.getContentPane());
        fail_del.getContentPane().setLayout(fail_delLayout);
        fail_delLayout.setHorizontalGroup(
            fail_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fail_delLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        fail_delLayout.setVerticalGroup(
            fail_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fail_delLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        adeios.setTitle("ΑΔΕΙΟΣ ΠΙΝΑΚΑΣ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Ο πίνακας είναι άδειος!");

        javax.swing.GroupLayout adeiosLayout = new javax.swing.GroupLayout(adeios.getContentPane());
        adeios.getContentPane().setLayout(adeiosLayout);
        adeiosLayout.setHorizontalGroup(
            adeiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adeiosLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel17)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        adeiosLayout.setVerticalGroup(
            adeiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adeiosLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        delete2_dialog.setTitle("ΔΙΑΓΡΑΦΗ ΑΤΟΜΟΥ");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/error_icon.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Θέλετε να διαγράψετε το συγκεκριμένο άτομο;");

        yes_Button2.setRadius(13);
        yes_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_Button2ActionPerformed(evt);
            }
        });

        no_Button2.setRadius(13);
        no_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_Button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete2_dialogLayout = new javax.swing.GroupLayout(delete2_dialog.getContentPane());
        delete2_dialog.getContentPane().setLayout(delete2_dialogLayout);
        delete2_dialogLayout.setHorizontalGroup(
            delete2_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete2_dialogLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(yes_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(no_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete2_dialogLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(34, 34, 34))
        );
        delete2_dialogLayout.setVerticalGroup(
            delete2_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete2_dialogLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(delete2_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(delete2_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yes_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        happy_birthday.setTitle("ΕΙΔΟΠΟΙΗΣΗ ΓΕΝΕΘΛΙΩΝ");

        confetti_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confetti.png"))); // NOI18N

        xronia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xronia.setForeground(new java.awt.Color(0, 153, 255));
        xronia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xronia.setText("Χρόνια πολλά!");

        gen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gen.setForeground(new java.awt.Color(0, 0, 0));

        euxes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euxes.setForeground(new java.awt.Color(0, 0, 0));
        euxes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        euxes.setText("Είναι η τέλεια ευκαιρία να στείλεις τις ευχές σου!");

        javax.swing.GroupLayout happy_birthdayLayout = new javax.swing.GroupLayout(happy_birthday.getContentPane());
        happy_birthday.getContentPane().setLayout(happy_birthdayLayout);
        happy_birthdayLayout.setHorizontalGroup(
            happy_birthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(happy_birthdayLayout.createSequentialGroup()
                .addGroup(happy_birthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(happy_birthdayLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(confetti_label)
                        .addGap(18, 18, 18)
                        .addGroup(happy_birthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(euxes, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(happy_birthdayLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(xronia)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        happy_birthdayLayout.setVerticalGroup(
            happy_birthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(happy_birthdayLayout.createSequentialGroup()
                .addGroup(happy_birthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(happy_birthdayLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(xronia)
                        .addGap(51, 51, 51)
                        .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euxes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(happy_birthdayLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(confetti_label)))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        happy_nameday.setTitle("ΕΙΔΟΠΟΙΗΣΗ ΟΝΟΜΑΣΤΙΚΗΣ ΕΟΡΤΗΣ");

        confetti_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confetti.png"))); // NOI18N

        xronia1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xronia1.setForeground(new java.awt.Color(0, 153, 255));
        xronia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xronia1.setText("Χρόνια πολλά!");

        gio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gio.setForeground(new java.awt.Color(0, 0, 0));

        euxes1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euxes1.setForeground(new java.awt.Color(0, 0, 0));
        euxes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        euxes1.setText("Είναι η τέλεια ευκαιρία να στείλεις τις ευχές σου!");

        javax.swing.GroupLayout happy_namedayLayout = new javax.swing.GroupLayout(happy_nameday.getContentPane());
        happy_nameday.getContentPane().setLayout(happy_namedayLayout);
        happy_namedayLayout.setHorizontalGroup(
            happy_namedayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(happy_namedayLayout.createSequentialGroup()
                .addGroup(happy_namedayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(happy_namedayLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(confetti_label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(happy_namedayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(euxes1)
                            .addComponent(gio, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(happy_namedayLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(xronia1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        happy_namedayLayout.setVerticalGroup(
            happy_namedayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(happy_namedayLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(xronia1)
                .addGroup(happy_namedayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(happy_namedayLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(gio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euxes1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(happy_namedayLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(confetti_label1)))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        info.setTitle("Πληροφορίες για την εφαρμογή");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(getBackground());
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Καλώς ήρθατε στο ΗΜΕΡΟΛΟΓΙΟΝ 2.0!\n\nΑυτό το ηλεκτρονικό ημερολόγιο σας επιτρέπει να οργανώσετε και να παρακολουθήσετε τα γεγονότα σας με εύκολο και γρήγορο τρόπο.\n\nΓια να προσθέσετε ένα νέο γεγονός, απλώς πατήστε το κουμπί \"+\" και επιλέξτε την ημερομηνία για την οποία θέλετε να καταχωρίσετε το γεγονός. Μόλις το γεγονός προστεθεί, θα εμφανίζεται στην καρτέλα \"ΓΕΓΟΝΟΤΑ\", όπου μπορείτε να δείτε όλα τα γεγονότα που έχετε καταχωρίσει.\n\nΓια να τροποποιήσετε τις πληροφορίες ενός γεγονότος, μπορείτε να χρησιμοποιήσετε το \"μολυβάκι\" που βρίσκεται μέσα στο πλαίσιο κάθε γεγονότος. Αν θέλετε να διαγράψετε ένα γεγονός, χρησιμοποιήστε το κόκκινο καλάθι που βρίσκεται επίσης μέσα στο ίδιο πλαίσιο.\n\nΗ εφαρμογή μπορεί επίσης να σας ειδοποιήσει για τα γεγονότα που είναι προγραμματισμένα για την τρέχουσα ημέρα. Έτσι, δεν θα χάσετε καμία σημαντική ημερομηνία!\n\nΕπιπλέον, μπορείτε να προσθέσετε τους φίλους σας μέσω της καρτέλας \"ΦΟΡΜΑ\". Κάθε νέος φίλος που προστίθεται εμφανίζεται στην καρτέλα \"ΟΙ ΦΙΛΟΙ ΜΟΥ\". Η εφαρμογή θα σας στείλει ειδοποιήσεις αν κάποιος από τους φίλους σας έχει γενέθλια ή ονομαστική γιορτή την τρέχουσα ημέρα. Μπορείτε να διαγράφετε φίλους από τη λίστα πατώντας το κόκκινο καλάθι και γράφοντας τα στοιχεία του φίλου που θέλετε να διαγράψετε.\n\nΑπολαύστε την εμπειρία χρήσης του ΗΜΕΡΟΛΟΓΙΟΝ 2.0 και οργανώστε τη μέρα σας με ευκολία!");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCaretColor(getBackground());
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info.getContentPane());
        info.getContentPane().setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ΗΜΕΡΟΛΟΓΙΟΝ 2.0");

        day_label.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        day_label.setForeground(new java.awt.Color(0, 0, 0));
        day_label.setText("jLabel1");

        date_num_label.setFont(new java.awt.Font("Segoe UI", 0, 124)); // NOI18N
        date_num_label.setForeground(new java.awt.Color(0, 0, 0));
        date_num_label.setText("jLabel2");

        month_label.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        month_label.setForeground(new java.awt.Color(0, 0, 0));
        month_label.setText("jLabel3");

        year_label.setFont(new java.awt.Font("Segoe UI", 0, 78)); // NOI18N
        year_label.setForeground(new java.awt.Color(0, 0, 0));
        year_label.setText("jLabel4");

        addButton1.setToolTipText("Προσθέστε ένα νέο γεγονός.");
        addButton1.setRadius(500);
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        infoHelpButton1.setToolTipText("Δείτε πληροφορίες για τις βασικές λειτουργίες και την πλοήγηση στην εφαρμογή.");
        infoHelpButton1.setRadius(13);
        infoHelpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoHelpButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout arxikh_panelLayout = new javax.swing.GroupLayout(arxikh_panel);
        arxikh_panel.setLayout(arxikh_panelLayout);
        arxikh_panelLayout.setHorizontalGroup(
            arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arxikh_panelLayout.createSequentialGroup()
                .addGroup(arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arxikh_panelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(arxikh_panelLayout.createSequentialGroup()
                                .addComponent(month_label)
                                .addGap(84, 84, 84)
                                .addComponent(year_label))
                            .addComponent(day_label)
                            .addComponent(infoHelpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arxikh_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date_num_label, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)))
                .addGroup(arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customCalendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        arxikh_panelLayout.setVerticalGroup(
            arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arxikh_panelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arxikh_panelLayout.createSequentialGroup()
                        .addComponent(day_label)
                        .addGap(35, 35, 35)
                        .addComponent(date_num_label)
                        .addGap(48, 48, 48)
                        .addGroup(arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(year_label)
                            .addComponent(month_label)))
                    .addGroup(arxikh_panelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(customCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(arxikh_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoHelpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("ΑΡΧΙΚΗ ΣΕΛΙΔΑ", arxikh_panel);

        scroll.setColumnHeaderView(null);

        outerPanel.setLayout(new javax.swing.BoxLayout(outerPanel, javax.swing.BoxLayout.Y_AXIS));
        scroll.setViewportView(outerPanel);

        jTabbedPane1.addTab("ΓΕΓΟΝΟΤΑ", scroll);

        name_label.setDisplayedMnemonic('\u039f');
        name_label.setFont(new Font("Αrvo", Font.PLAIN, 20));
        name_label.setLabelFor(name);
        name_label.setText("Όνομα:");
        name_label.setDisplayedMnemonicIndex(0);

        surname_label.setDisplayedMnemonic('\u0395');
        surname_label.setFont(new Font("Αrvo", Font.PLAIN, 20));
        surname_label.setLabelFor(surname);
        surname_label.setText("Επίθετο:");

        genethlia_label.setFont(new Font("Αrvo", Font.PLAIN, 20));
        genethlia_label.setText("Ημερομηνία γενεθλίων:");

        giorth_label.setFont(new Font("Αrvo", Font.PLAIN, 20));
        giorth_label.setText("Ημερομηνία ονομαστικής εορτής:");

        name_info.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name_info.setForeground(new java.awt.Color(0, 0, 0));
        name_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_info.setText("?");
        name_info.setToolTipText("Συμπληρώστε το όνομα του ατόμου για την καρτέλα \"ΟΙ ΦΙΛΟΙ ΜΟΥ\".");

        surname_info.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        surname_info.setForeground(new java.awt.Color(0, 0, 0));
        surname_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        surname_info.setText("?");
        surname_info.setToolTipText("Συμπληρώστε το επίθετο του ατόμου για την καρτέλα \"ΟΙ ΦΙΛΟΙ ΜΟΥ\".");

        genethlia_info.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genethlia_info.setForeground(new java.awt.Color(0, 0, 0));
        genethlia_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genethlia_info.setText("?");
        genethlia_info.setToolTipText("Συμπληρώστε την ημερομηνία των γενεθλίων του ατόμου για την καρτέλα \"ΟΙ ΦΙΛΟΙ ΜΟΥ\".");

        giorth_info.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        giorth_info.setForeground(new java.awt.Color(0, 0, 0));
        giorth_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        giorth_info.setText("?");
        giorth_info.setToolTipText("Συμπληρώστε την ημερομηνία της ονομαστικής εορτής του ατόμου για την καρτέλα \"ΟΙ ΦΙΛΟΙ ΜΟΥ\".");

        insertButton1.setRadius(13);
        insertButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButton1ActionPerformed(evt);
            }
        });

        spinGen.setMaximum(31);
        spinGen.setMinimum(1);
        spinGen.setValue(calendar.get(Calendar.DAY_OF_MONTH)
        );

        spinGio.setMaximum(31);
        spinGio.setMinimum(1);
        spinGio.setValue(calendar.get(Calendar.DAY_OF_MONTH)
        );

        javax.swing.GroupLayout form_panelLayout = new javax.swing.GroupLayout(form_panel);
        form_panel.setLayout(form_panelLayout);
        form_panelLayout.setHorizontalGroup(
            form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, form_panelLayout.createSequentialGroup()
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(form_panelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(giorth_label)
                            .addComponent(genethlia_label))
                        .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(form_panelLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(form_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                                .addComponent(MonthChooserGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(form_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surname_label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name_label, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(207, 207, 207)
                        .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinGen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(form_panelLayout.createSequentialGroup()
                                .addComponent(spinGio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MonthChooserGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(82, 82, 82)
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surname_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genethlia_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giorth_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(283, 283, 283))
        );
        form_panelLayout.setVerticalGroup(
            form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, form_panelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_label))
                .addGap(78, 78, 78)
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname_label))
                .addGap(84, 84, 84)
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form_panelLayout.createSequentialGroup()
                        .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(form_panelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(genethlia_label))
                            .addComponent(genethlia_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addComponent(giorth_info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_panelLayout.createSequentialGroup()
                        .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MonthChooserGen, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(spinGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(form_panelLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinGio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(giorth_label)))
                            .addGroup(form_panelLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(MonthChooserGio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(106, 106, 106)
                .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        jTabbedPane1.addTab("ΦΟΡΜΑ", form_panel);

        friends_panel.setPreferredSize(new java.awt.Dimension(1280, 768));

        friends_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΟΝΟΜΑ", "ΕΠΙΘΕΤΟ", "ΓΕΝΕΘΛΙΑ", "ΓΙΟΡΤΗ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        friends_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(friends_table);

        deleteButton21.setToolTipText("Διαγράψτε έναν φίλο.");
        deleteButton21.setRadius(13);
        deleteButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout friends_panelLayout = new javax.swing.GroupLayout(friends_panel);
        friends_panel.setLayout(friends_panelLayout);
        friends_panelLayout.setHorizontalGroup(
            friends_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friends_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        friends_panelLayout.setVerticalGroup(
            friends_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friends_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(deleteButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("ΟΙ ΦΙΛΟΙ ΜΟΥ", friends_panel);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/me.jpg"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(261, 233));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new Color(0,0,0,0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new Font("Arvo", Font.PLAIN, 24));
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Καλωσορίσατε στο “ΗΜΕΡΟΛΟΓΙΟΝ 2.0”, μια εφαρμογή ημερολογίου που δημιουργήθηκε από τον Αρσένιο Ναντιρασβίλι, φοιτητή του Τμήματος Μηχανικών Πληροφορικής και Ηλεκτρονικών Συστημάτων του ΔΙ.ΠΑ.Ε. Η εφαρμογή αυτή αναπτύχθηκε στο πλαίσιο του μαθήματος “Αλληλεπίδραση Ανθρώπου-Μηχανής” και διαθέτει δυνατότητα προσθήκης γεγονότων για συγκεκριμένες μέρες καθώς και ειδοποιήσεις για σημαντικές ημερομηνίες.\n\nΕλπίζω η εφαρμογή αυτή να με βοηθήσει να περάσω το μάθημα και να αποτελέσει τη βάση για κάτι μεγαλύτερο στο μέλλον!");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jScrollPane5.setViewportView(jTextArea2);

        javax.swing.GroupLayout about_panelLayout = new javax.swing.GroupLayout(about_panel);
        about_panel.setLayout(about_panelLayout);
        about_panelLayout.setHorizontalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_panelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        about_panelLayout.setVerticalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_panelLayout.createSequentialGroup()
                .addGroup(about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(about_panelLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(about_panelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ABOUT", about_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        create_event_dialog.setVisible(true);
        create_event_dialog.setSize(600, 600);
        create_event_dialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_addButton1ActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        create_event_dialog.setVisible(false);
        title_of_event.setText("");
        desc_of_event.setText("");
        event_date_choοser.setDate(null);
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        if (title_of_event.getText()==null || title_of_event.getText().isEmpty() || desc_of_event.getText()==null|| desc_of_event.getText().isEmpty() ||  event_date_choοser.getDate() == null){
            error_dialog.setVisible(true);
            error_dialog.setSize(400, 300);
            error_dialog.setLocationRelativeTo(null);
        } else {
            Event event = new Event(title_of_event.getText(), desc_of_event.getText(), event_date_choοser.getDate());
            events.add(event);
            currentEvent = event;
            create_event_dialog.setVisible(false);
            confirmation_dialog.setVisible(true);
            confirmation_dialog.setSize(400, 300);
            confirmation_dialog.setLocationRelativeTo(null);
            CustomPanel event_panel = new CustomPanel(event, this);
            eventPanels.add(event_panel);
            index_panel++;
            index_event++;
            showPanels();
            for (Component comp : CustomCalendar.p.getComponents()){
                Cell cell = (Cell) comp;
                cell.repaint();
            }
        }
        title_of_event.setText("");
        desc_of_event.setText("");
        event_date_choοser.setDate(null);
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        edit_dialog.setVisible(false);
    }//GEN-LAST:event_cancelButton2ActionPerformed

    private void saveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton2ActionPerformed
        if (title_of_event1.getText()==null || title_of_event1.getText().isEmpty() || desc_of_event1.getText()==null|| desc_of_event1.getText().isEmpty() ||  event_date_choοser1.getDate() == null){
            error_dialog.setVisible(true);
            error_dialog.setSize(400, 300);
            error_dialog.setLocationRelativeTo(null);

        } else {
            eventToEdit.setTitle(title_of_event1.getText());
            eventToEdit.setDescription(desc_of_event1.getText());
            eventToEdit.setEvent_date(event_date_choοser1.getDate());
            edit_dialog.setVisible(false);
            currentEvent = eventToEdit;
            save_edit_dialog.setVisible(true);
            save_edit_dialog.setSize(400, 300);
            save_edit_dialog.setLocationRelativeTo(null);
            int index = eventPanels.indexOf(c);
            CustomPanel updatedPanel = new CustomPanel(eventToEdit, this);
            eventPanels.set(index, updatedPanel);
            showPanels();
        }
    }//GEN-LAST:event_saveButton2ActionPerformed

    private void yes_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_Button1ActionPerformed
        eventPanels.remove(c);
        events.remove(eventToEdit);
        delete_dialog.setVisible(false);
        deleted_event_dialog.setVisible(true);
        deleted_event_dialog.setSize(400, 300);
        deleted_event_dialog.setLocationRelativeTo(null);
        showPanels();
    }//GEN-LAST:event_yes_Button1ActionPerformed

    private void no_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_Button1ActionPerformed
        delete_dialog.setVisible(false);
    }//GEN-LAST:event_no_Button1ActionPerformed

    private void confirmation_dialogWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_confirmation_dialogWindowClosing
        showNotification(currentEvent);
    }//GEN-LAST:event_confirmation_dialogWindowClosing

    private void save_edit_dialogWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_save_edit_dialogWindowClosing
        showNotification(currentEvent);
    }//GEN-LAST:event_save_edit_dialogWindowClosing

    private void insertButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButton1ActionPerformed
        if (name.getText()==null || name.getText().isEmpty() || surname.getText()==null|| surname.getText().isEmpty()){
            error_dialog.setVisible(true);
            error_dialog.setSize(400, 300);
            error_dialog.setLocationRelativeTo(null);
        } else {
            namefieldI = name.getText();
            surnamefieldI = surname.getText();
            dayMonthGen = spinGen.getValue();
            monthGen = MonthChooserGen.getMonth()+1;
            dayMonthGio = spinGio.getValue();
            monthGio = MonthChooserGio.getMonth()+1;
            String genString = dayMonthGen+"/"+monthGen;
            String gioString = dayMonthGio+"/"+monthGio;
            Object [] row = {namefieldI, surnamefieldI, genString, gioString};
            DefaultTableModel model = (DefaultTableModel) friends_table.getModel();
            model.insertRow(r++, row);
            name.setText("");
            surname.setText("");
            spinGen.setValue(calendar.get(Calendar.DAY_OF_MONTH));
            spinGio.setValue(calendar.get(Calendar.DAY_OF_MONTH));
            MonthChooserGen.setMonth(calendar.get(Calendar.MONTH));
            MonthChooserGio.setMonth(calendar.get(Calendar.MONTH));
            confirmation_dialog1.setVisible(true);
            confirmation_dialog1.setSize(400, 300);
            confirmation_dialog1.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_insertButton1ActionPerformed

    private void deleteButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton22ActionPerformed
        if (namefield.getText()==null || namefield.getText().isEmpty() || surnamefield.getText()==null || surnamefield.getText().isEmpty()){
            error_dialog.setVisible(true);
            error_dialog.setSize(400, 300);
            error_dialog.setLocationRelativeTo(null);
        } else {
            onoma = namefield.getText();
            epitheto = surnamefield.getText();
            friends_delete.setVisible(false);
            delete2_dialog.setVisible(true);
            delete2_dialog.setSize(520, 330);
            delete2_dialog.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_deleteButton22ActionPerformed

    private void deleteButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton21ActionPerformed
        DefaultTableModel model = (DefaultTableModel) friends_table.getModel();
        if (model.getRowCount() == 0){
            adeios.setVisible(true);
            adeios.setSize(400, 300);
            adeios.setLocationRelativeTo(null);
        } else{
            friends_delete.setVisible(true);
            friends_delete.setSize(424, 348);
            friends_delete.setLocationRelativeTo(null);
        }
        namefield.setText("");
        surnamefield.setText("");
    }//GEN-LAST:event_deleteButton21ActionPerformed

    private void yes_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_Button2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) friends_table.getModel();
        boolean rowFound = false;
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (onoma.equals(friends_table.getValueAt(i, 0)) && epitheto.equals(friends_table.getValueAt(i, 1))) {
                model.removeRow(i);
                rowFound = true;
                break;
            }
        }
        if (rowFound){
            delete2_dialog.setVisible(false);
            deleted_person.setVisible(true);
            deleted_person.setSize(400, 300);
            deleted_person.setLocationRelativeTo(null);
            r--;
        } else{
            delete2_dialog.setVisible(false);
            fail_del.setVisible(true);
            fail_del.setSize(500, 300);
            fail_del.setLocationRelativeTo(null);
        }
        onoma="";
        epitheto="";
    }//GEN-LAST:event_yes_Button2ActionPerformed

    private void no_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_Button2ActionPerformed
        delete2_dialog.setVisible(false);
    }//GEN-LAST:event_no_Button2ActionPerformed

    private void confirmation_dialog1WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_confirmation_dialog1WindowClosing
        if (dayMonthGen == calendar.get(Calendar.DAY_OF_MONTH) && monthGen == (calendar.get(Calendar.MONTH)+1)){
            gen.setText("Σήμερα έχει γενέθλια ο/η "+namefieldI+" "+surnamefieldI+"!");
            happy_birthday.setVisible(true);
            happy_birthday.setSize(550,400);
            happy_birthday.setLocationRelativeTo(null);
            playGenGioSound();
        }
        if (dayMonthGio == calendar.get(Calendar.DAY_OF_MONTH) && (monthGio == calendar.get(Calendar.MONTH)+1)){
            gio.setText("Σήμερα έχει γιορτάζει ο/η "+namefieldI+" "+surnamefieldI+"!");
            happy_nameday.setVisible(true);
            happy_nameday.setSize(550,400);
            happy_nameday.setLocationRelativeTo(null);
            playGenGioSound();
        }
    }//GEN-LAST:event_confirmation_dialog1WindowClosing

    private void infoHelpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoHelpButton1ActionPerformed
        info.setVisible(true);
        info.setSize(560,400);
        info.setLocationRelativeTo(null);
    }//GEN-LAST:event_infoHelpButton1ActionPerformed

    private void create_event_dialogWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_create_event_dialogWindowClosing
        title_of_event.setText("");
        desc_of_event.setText("");
        event_date_choοser.setDate(null);
    }//GEN-LAST:event_create_event_dialogWindowClosing

    public static void main(String args[]) {
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void init_date_labels(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        switch(calendar.get(Calendar.DAY_OF_WEEK)){
            case 1: day_label.setText("Κυριακή");
                    break;
            case 2: day_label.setText("Δευτέρα");
                    break;
            case 3: day_label.setText("Τρίτη");
                    break;
            case 4: day_label.setText("Τετάρτη");
                    break;
            case 5: day_label.setText("Πέμπτη");
                    break;
            case 6: day_label.setText("Παρασκευή");
                    break;
            case 7: day_label.setText("Σάββατο");
                    break;
        }
        date_num_label.setText(calendar.get(Calendar.DATE)+"");
        switch(calendar.get(Calendar.MONTH)){
            case 0: month_label.setText("Ιανουαρίου");
                    break;
            case 1: month_label.setText("Φεβρουαρίου");
                    break;
            case 2: month_label.setText("Μαρτίου");
                    break;
            case 3: month_label.setText("Απριλίου");
                    break;
            case 4: month_label.setText("Μαίου");
                    break;
            case 5: month_label.setText("Ιουνίου");
                    break;
            case 6: month_label.setText("Ιουλίου");
                    break;
            case 7: month_label.setText("Αυγούστου");
                    break;
            case 8: month_label.setText("Σεπττεμβρίου");
                    break;
            case 9: month_label.setText("Οκτωβρίου");
                    break;
            case 10: month_label.setText("Νοεμβρίου");
                    break;
            case 11: month_label.setText("Δεκεμβρίου");
                    break;
        }
        year_label.setText(calendar.get(Calendar.YEAR)+"");
    }

    private void showNotification(Event e){
        LocalDate today = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate eventDate = e.getEvent_date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean notificationShown = false;
        int comp = eventDate.compareTo(today);
        if (comp == 0 && !notificationShown){
            todays_events_notification.setVisible(true);
            todays_events_notification.setSize(500, 300);
            todays_events_notification.setLocationRelativeTo(null);
            playNotificationSound();
            notificationShown = true;
        }
    }
    
    private void playGenGioSound() {
        try {
            File soundFile = new File("src\\resources\\gen_gio.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private void showPanels(){
        outerPanel.removeAll();
        eventPanels.sort(Comparator.comparing(CustomPanel::getDate));
        if (eventPanels.isEmpty()){
            no_panels = new JLabel("Δεν υπάρχουν διαθέσιμα γεγονότα!");
            no_panels.setFont(new Font("Αrvo", Font.BOLD, 20));
            no_panels.setForeground(Color.red);
            no_panels.setAlignmentX(Component.CENTER_ALIGNMENT);
            outerPanel.add(Box.createRigidArea(new Dimension(0, 30)));
            outerPanel.add(no_panels);
        }
        int j=1;
        LocalDate today = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        for (CustomPanel panel : eventPanels) {
            LocalDate panelDate = panel.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int comp = panelDate.compareTo(today);
            if (comp<0){
                panel.setForeground(new Color(217,217,217,10));
                panel.getTitlos_label().setForeground(new Color(0,0,0,100));
                panel.getDesc_area().setForeground(new Color(0,0,0,100));
            }
            if (j==1){
                outerPanel.add(Box.createRigidArea(new Dimension(0, 30)));
                panel.revalidate();
                panel.repaint();
                outerPanel.add(panel);
                j++;
            } else if(j==2) {
                outerPanel.add(Box.createRigidArea(new Dimension(0, 30)));
                panel.revalidate();
                panel.repaint();
                outerPanel.add(panel);
                outerPanel.add(Box.createRigidArea(new Dimension(0, 30)));
                j++;
            } else {
                panel.revalidate();
                panel.repaint();
                outerPanel.add(panel);
                outerPanel.add(Box.createRigidArea(new Dimension(0, 30)));
            }
        }
        outerPanel.revalidate();
        outerPanel.repaint();
    }

    public void setEventToEdit(Event event, CustomPanel c) {
        this.c = c;
        this.eventToEdit = event;
    }

    public static void playNotificationSound() {
        try {
            File soundFile = new File("src\\resources\\notification.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public JDialog getDeleteDialog(){
        return delete_dialog;
    }

    public JDialog getEditDialog(){
        return edit_dialog;
    }

    public JDateChooser getDateChooser(){
        return event_date_choοser1;
    }

    public JTextArea getTextArea(){
        return desc_of_event1;
    }

    public JTextField getTextField(){
        return title_of_event1;
    }

    public CancelButton getCancelButton(){
        return cancelButton2;
    }

    public JTextArea getDesc_of_event1() {
        return desc_of_event1;
    }

    public JLabel getTitle_label1() {
        return title_label1;
    }

    public JTextField getTitle_of_event1() {
        return title_of_event1;
    }

    public JPanel getOuterPanel() {
        return outerPanel;
    }

    protected static ArrayList<Event> events = new ArrayList<>();
    protected static ArrayList<CustomPanel> eventPanels = new ArrayList<>();
    private Event eventToEdit;
    private Event currentEvent;
    private CustomPanel c;
    private int i = 1;
    private int index_event = 0;
    private int index_panel = 0;
    private JLabel no_panels;
    private Calendar calendar;
    private int r = 0;
    private String onoma;
    private String epitheto;
    private int dayMonthGio;
    private int monthGio;
    private int dayMonthGen;
    private int monthGen;
    private String namefieldI;
    private String surnamefieldI;
    private Player player;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser MonthChooserGen;
    private com.toedter.calendar.JMonthChooser MonthChooserGio;
    private javax.swing.JPanel about_panel;
    private AddButton addButton1;
    private javax.swing.JDialog adeios;
    private javax.swing.JPanel arxikh_panel;
    private CancelButton cancelButton1;
    private CancelButton cancelButton2;
    private javax.swing.JLabel confetti_label;
    private javax.swing.JLabel confetti_label1;
    private javax.swing.JDialog confirmation_dialog;
    private javax.swing.JDialog confirmation_dialog1;
    private javax.swing.JDialog create_event_dialog;
    private CustomCalendar customCalendar;
    private javax.swing.JLabel date_num_label;
    private javax.swing.JLabel day_label;
    private javax.swing.JDialog delete2_dialog;
    private DeleteButton2 deleteButton21;
    private DeleteButton2 deleteButton22;
    private javax.swing.JDialog delete_dialog;
    private javax.swing.JDialog deleted_event_dialog;
    private javax.swing.JDialog deleted_person;
    private javax.swing.JLabel desc_label;
    private javax.swing.JLabel desc_label1;
    private javax.swing.JTextArea desc_of_event;
    private javax.swing.JTextArea desc_of_event1;
    private javax.swing.JDialog edit_dialog;
    private javax.swing.JDialog error_dialog;
    private javax.swing.JLabel euxes;
    private javax.swing.JLabel euxes1;
    private com.toedter.calendar.JDateChooser event_date_choοser;
    private com.toedter.calendar.JDateChooser event_date_choοser1;
    private javax.swing.JDialog fail_del;
    private javax.swing.JPanel form_panel;
    private javax.swing.JDialog friends_delete;
    private javax.swing.JPanel friends_panel;
    private javax.swing.JTable friends_table;
    private javax.swing.JLabel gen;
    private javax.swing.JLabel genethlia_info;
    private javax.swing.JLabel genethlia_label;
    private javax.swing.JLabel gio;
    private javax.swing.JLabel giorth_info;
    private javax.swing.JLabel giorth_label;
    private javax.swing.JDialog happy_birthday;
    private javax.swing.JDialog happy_nameday;
    private javax.swing.JDialog info;
    private InfoHelpButton infoHelpButton1;
    private InsertButton insertButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel month_label;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel name_info;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField namefield;
    private No_Button no_Button1;
    private No_Button no_Button2;
    protected static javax.swing.JPanel outerPanel;
    private SaveButton saveButton1;
    private SaveButton saveButton2;
    private javax.swing.JDialog save_edit_dialog;
    private javax.swing.JScrollPane scroll;
    private com.toedter.components.JSpinField spinGen;
    private com.toedter.components.JSpinField spinGio;
    private javax.swing.JTextField surname;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel surname_info;
    private javax.swing.JLabel surname_label;
    private javax.swing.JTextField surnamefield;
    private javax.swing.JLabel title_label;
    private javax.swing.JLabel title_label1;
    private javax.swing.JTextField title_of_event;
    private javax.swing.JTextField title_of_event1;
    private javax.swing.JDialog todays_events_notification;
    private javax.swing.JLabel xronia;
    private javax.swing.JLabel xronia1;
    private javax.swing.JLabel year_label;
    private Yes_Button yes_Button1;
    private Yes_Button yes_Button2;
    // End of variables declaration//GEN-END:variables
}