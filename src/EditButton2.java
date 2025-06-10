import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;


public class EditButton2 extends DropShadowButton{
    
    private Image edit_image;
    
    public EditButton2(){
        setContentAreaFilled(false);
        setPreferredSize(new Dimension(50,50));
        ImageIcon icon = new ImageIcon("src\\icons\\edit_icon.png");
        edit_image = icon.getImage();
    }
    
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(158,214,218,110)); 
        g2.fillRoundRect(0, 0, getWidth()-4, getHeight()-4, 500, 500);
        int edit_width = edit_image.getHeight(null);
        int edit_height = edit_image.getHeight(null);
        int x = ((getWidth()-1)-edit_width)/2;
        int y = ((getHeight()-1)-edit_height)/2;
        g2.drawImage(edit_image, x, y, this);
    }
}
