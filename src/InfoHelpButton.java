import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class InfoHelpButton extends DropShadowButton {
    
    public InfoHelpButton(){}
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(74, 144, 226, 100));
        g2.fillRoundRect(0, 0, getWidth()-4, getHeight()-4, getRadius(), getRadius());
        String text = "HELP";
        FontMetrics fm = g2.getFontMetrics();
        int text_width = fm.stringWidth(text);
        int text_height = fm.getAscent();
        int x = ((getWidth()-10)-text_width)/2;
        int y = ((getHeight()-4)+text_height)/2;
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arvo",Font.PLAIN, 16));
        g2.drawString(text, x, y);
    }
}



