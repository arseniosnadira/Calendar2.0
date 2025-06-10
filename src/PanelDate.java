import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class PanelDate extends javax.swing.JPanel {
    
    private int month;
    private int year;
    private Font font;
    
    public PanelDate(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }

    private void init(){
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        sun.asTitle();
        setDate();
        try {
            File fontStyle = new File("src\\resources\\fonts\\GFSDidot-Regular.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(20f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mon.setFont(font);
        tue.setFont(font);
        wed.setFont(font);
        thu.setFont(font);
        fri.setFont(font);
        sat.setFont(font);
        sun.setFont(font);
    }
    
    private void setDate(){
        Calendar calendar = Calendar.getInstance(); 
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, 1);
        int startDay = (calendar.get(Calendar.DAY_OF_WEEK) + 5) % 7; // 0=Δευτέρα, 6=Κυριακή
        calendar.add(Calendar.DATE, -startDay);
        ToDay t = getToday();
        for (Component comp : this.getComponents()){
            Cell cell = (Cell) comp;
            if (!cell.isTitle()) {
                cell.setDate(calendar.getTime());
                if (t.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.YEAR)))){
                    cell.setAsToday();
                }        
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                calendar.add(Calendar.DATE, 1);
            }
        }
    }
    
    private ToDay getToday(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.YEAR));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mon = new Cell();
        tue = new Cell();
        wed = new Cell();
        thu = new Cell();
        fri = new Cell();
        sat = new Cell();
        sun = new Cell();
        cell8 = new Cell();
        cell9 = new Cell();
        cell10 = new Cell();
        cell14 = new Cell();
        cell11 = new Cell();
        cell12 = new Cell();
        cell13 = new Cell();
        cell15 = new Cell();
        cell16 = new Cell();
        cell17 = new Cell();
        cell18 = new Cell();
        cell19 = new Cell();
        cell20 = new Cell();
        cell21 = new Cell();
        cell22 = new Cell();
        cell23 = new Cell();
        cell24 = new Cell();
        cell25 = new Cell();
        cell26 = new Cell();
        cell27 = new Cell();
        cell28 = new Cell();
        cell29 = new Cell();
        cell30 = new Cell();
        cell31 = new Cell();
        cell32 = new Cell();
        cell33 = new Cell();
        cell34 = new Cell();
        cell35 = new Cell();
        cell36 = new Cell();
        cell37 = new Cell();
        cell38 = new Cell();
        cell39 = new Cell();
        cell40 = new Cell();
        cell41 = new Cell();
        cell42 = new Cell();
        cell43 = new Cell();
        cell44 = new Cell();
        cell45 = new Cell();
        cell46 = new Cell();
        cell47 = new Cell();
        cell48 = new Cell();
        cell49 = new Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        mon.setForeground(new java.awt.Color(0, 0, 0));
        mon.setText("Δε");
        add(mon);

        tue.setForeground(new java.awt.Color(0, 0, 0));
        tue.setText("Τρ");
        add(tue);

        wed.setForeground(new java.awt.Color(0, 0, 0));
        wed.setText("Τε");
        add(wed);

        thu.setForeground(new java.awt.Color(0, 0, 0));
        thu.setText("Πε");
        add(thu);

        fri.setForeground(new java.awt.Color(0, 0, 0));
        fri.setText("Πα");
        add(fri);

        sat.setForeground(new java.awt.Color(0, 0, 0));
        sat.setText("Σα");
        add(sat);

        sun.setForeground(new java.awt.Color(0, 0, 0));
        sun.setText("Κυ");
        add(sun);
        add(cell8);
        add(cell9);
        add(cell10);
        add(cell14);
        add(cell11);
        add(cell12);
        add(cell13);
        add(cell15);
        add(cell16);
        add(cell17);
        add(cell18);
        add(cell19);
        add(cell20);
        add(cell21);
        add(cell22);
        add(cell23);
        add(cell24);
        add(cell25);
        add(cell26);
        add(cell27);
        add(cell28);
        add(cell29);
        add(cell30);
        add(cell31);
        add(cell32);
        add(cell33);
        add(cell34);
        add(cell35);
        add(cell36);
        add(cell37);
        add(cell38);
        add(cell39);
        add(cell40);
        add(cell41);
        add(cell42);
        add(cell43);
        add(cell44);
        add(cell45);
        add(cell46);
        add(cell47);
        add(cell48);
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Cell cell10;
    private Cell cell11;
    private Cell cell12;
    private Cell cell13;
    private Cell cell14;
    private Cell cell15;
    private Cell cell16;
    private Cell cell17;
    private Cell cell18;
    private Cell cell19;
    private Cell cell20;
    private Cell cell21;
    private Cell cell22;
    private Cell cell23;
    private Cell cell24;
    private Cell cell25;
    private Cell cell26;
    private Cell cell27;
    private Cell cell28;
    private Cell cell29;
    private Cell cell30;
    private Cell cell31;
    private Cell cell32;
    private Cell cell33;
    private Cell cell34;
    private Cell cell35;
    private Cell cell36;
    private Cell cell37;
    private Cell cell38;
    private Cell cell39;
    private Cell cell40;
    private Cell cell41;
    private Cell cell42;
    private Cell cell43;
    private Cell cell44;
    private Cell cell45;
    private Cell cell46;
    private Cell cell47;
    private Cell cell48;
    private Cell cell49;
    private Cell cell8;
    private Cell cell9;
    private Cell fri;
    private Cell mon;
    private Cell sat;
    private Cell sun;
    private Cell thu;
    private Cell tue;
    private Cell wed;
    // End of variables declaration//GEN-END:variables
}
