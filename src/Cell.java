import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;


public class Cell extends JButton{
    
    private Date date;
    private boolean title;
    private boolean isToDay;
    private Font font;
    
    public Cell(){
        setBackground(new Color(148,194,222));
        setBorder(null);
    }
    
    public void asTitle(){
        title = true;
    }
    
    public boolean isTitle(){
        return title;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void currentMonth(boolean act){
        if(act){
            setForeground(new Color(0,0,0));
        } else{
            setForeground(new Color(0,0,0,128));
        }
    }
    
    public void setAsToday(){
        isToDay = true;
    }
    
    public void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (!title) {
            if (isSameMonth(CustomCalendar.month_static)) {
                g2.setColor(new Color(217, 217, 217));
            } else {
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
                g2.setColor(new Color(217, 217, 217)); 
            }
            int squareSize = 35;
            int x = getWidth() / 2 - squareSize / 2;
            int y = getHeight() / 2 - squareSize / 2;
            g2.fillRoundRect(x, y, squareSize, squareSize, 0, 0);
            if (hasEvents()) {
                g2.setColor(Color.RED);
                int circleSize = 6;
                int x1 = getWidth() / 2 + squareSize / 4;  
                int y1 = getHeight() / 2 - squareSize/2 + 3;
                g2.fillOval(x1, y1, circleSize, circleSize);
            }
            try {
                File fontStyle = new File("src\\resources\\fonts\\GFSDidot-Regular.ttf");
                font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(20f);
            } catch (Exception e) {
                e.printStackTrace();
            }
            g2.setFont(font);
            FontMetrics fm = g2.getFontMetrics(); 
            if (date!=null){
                DateFormat df = new SimpleDateFormat("d");
                String dateString = df.format(date);
                int textWidth = fm.stringWidth(dateString);
                int textHeight = fm.getAscent() - fm.getDescent();
                int textX = x + (squareSize - textWidth) / 2;
                int textY = y + (squareSize + textHeight) / 2;
                g2.setColor(Color.BLACK);
                g2.drawString(dateString, textX, textY);
            }
            if (isToDay){
                g2.setStroke(new BasicStroke(2));
                g2.drawRect(x, y, 35, 35);
                g2.setStroke(new BasicStroke(1));
            }
        }
    }
    
    protected boolean hasEvents(){
        for (Event e : Main.events){
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            if(dateFormat.format(date).equals(dateFormat.format(e.getEvent_date()))){
                return true;
            }
        }
        return false;
    }
    
    protected boolean isSameMonth(int monthToCompare) {
        int cellMonth=0;
        if (date != null){
            cellMonth = date.getMonth() + 1;
        }
        if (cellMonth == monthToCompare){
            return true;
        }
        return false;
    }
}
    
