import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class DeleteButton2 extends DropShadowButton {
    
    private Image delete_image;
    
    public DeleteButton2(){
        setContentAreaFilled(false);
        setPreferredSize(new Dimension(50,50));
        ImageIcon icon = new ImageIcon("src\\icons\\delete_icon.png");
        delete_image = icon.getImage();
    }
    
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(214,40,40,64)); 
        g2.fillRoundRect(0, 0, getWidth()-4, getHeight()-4, 15, 15);
        int delete_width = delete_image.getHeight(null);
        int delete_height = delete_image.getHeight(null);
        int x = ((getWidth()-1)-delete_width)/2;
        int y = ((getHeight()-1)-delete_height)/2;
        g2.drawImage(delete_image, x, y, this);
    }
}
