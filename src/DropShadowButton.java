import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class DropShadowButton extends JButton {
    
    private boolean over;
    private Color color;
    private Color colorOver;
    private int radius = 0;
    
    public DropShadowButton(){
        color = getBackground();
        colorOver = new Color(179, 250, 160); 
        setContentAreaFilled(false);
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(0,0,0,30)); 
        g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
    }
}

