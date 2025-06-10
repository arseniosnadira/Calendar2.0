import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class AddButton extends DropShadowButton{
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(242,120,75,140));
        g2.fillRoundRect(0, 0, getWidth()-4, getHeight()-4, getRadius(), getRadius());
        g2.setColor(Color.BLACK);
        int thickness = 3; 
        int size = getWidth() / 3; 
        g2.fillRect((getWidth() - thickness) / 2, (getHeight() - size) / 2, thickness, size);
        g2.fillRect((getWidth() - size) / 2, (getHeight() - thickness) / 2, size, thickness);
    }
}
