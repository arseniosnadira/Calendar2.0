import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import swing.PanelSlide;

public class CustomCalendar extends javax.swing.JPanel {
    
    private Font font;
    protected static PanelDate p;

    public CustomCalendar() {
        initComponents();
        thisMonth();
        p = new PanelDate(month, year);
        slide.show(p, PanelSlide.AnimateType.TO_RIGHT);
        showMonthYear();
        month_static=month;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        slide = new swing.PanelSlide();
        back_button = new javax.swing.JButton();
        month_label = new javax.swing.JLabel();
        forward_button = new javax.swing.JButton();

        setBackground(new Color(148,194,222));
        setPreferredSize(new java.awt.Dimension(371, 380));

        jSeparator2.setBackground(new Color(129, 181, 214, 171));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left_arrow.png"))); // NOI18N
        back_button.setContentAreaFilled(false);
        back_button.setFocusable(false);
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        month_label.setBackground(new java.awt.Color(255, 255, 255));
        month_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        month_label.setForeground(new java.awt.Color(0, 0, 0));
        month_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        month_label.setText("Month Year");

        forward_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arow_right.png"))); // NOI18N
        forward_button.setContentAreaFilled(false);
        forward_button.setFocusable(false);
        forward_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forward_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back_button)
                .addGap(18, 18, 18)
                .addComponent(month_label, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(forward_button)
                .addGap(20, 20, 20))
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back_button)
                    .addComponent(month_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forward_button))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        if(month==1){
            month=12;
            year--;
        } else{
            month--;
        }
        slide.removeAll();
        slide.show(new PanelDate(month, year), PanelSlide.AnimateType.TO_RIGHT);
        showMonthYear();
        month_static=month;
    }//GEN-LAST:event_back_buttonActionPerformed

    private void forward_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward_buttonActionPerformed
        if(month==12){
            month=1;
            year++;
        } else{
            month++;
        }
        slide.removeAll();
        slide.show(new PanelDate(month, year), PanelSlide.AnimateType.TO_RIGHT);
        showMonthYear();
        month_static=month;
    }//GEN-LAST:event_forward_buttonActionPerformed
    
    private void thisMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        month = calendar.get(Calendar.MONTH)+1;
        year = calendar.get(Calendar.YEAR);
    }
    private void showMonthYear(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DATE, 1);
        String month_String = "";
        switch(month){
            case 1: month_String = "Ιανουάριος ";
                    break;
            case 2: month_String = "Φεβρουάριος ";
                    break;
            case 3: month_String = "Μάρτιος ";
                    break;        
            case 4: month_String = "Απρίλιος ";
                    break;
            case 5: month_String = "Μάιος ";
                    break;
            case 6: month_String = "Ιούνιος ";
                    break;
            case 7: month_String = "Ιούλιος ";
                    break;
            case 8: month_String = "Αύγουστος ";
                    break;
            case 9: month_String = "Σεπτέμβριος ";
                    break;
            case 10: month_String = "Οκτώβριος ";
                    break;
            case 11: month_String = "Νοέμβριος ";
                    break;
            case 12: month_String = "Δεκέμβριος ";
                    break;
        }
        try {
            File fontStyle = new File("src\\resources\\fonts\\GFSDidot-Regular.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(20f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        month_label.setText(month_String+calendar.get(Calendar.YEAR));
        month_label.setFont(font);
    }
    
    protected static int month_static;
    private int month;
    private int year;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton forward_button;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel month_label;
    private swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
