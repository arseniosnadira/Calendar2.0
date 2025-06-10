import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;


public class DeleteButton extends JButton{
    private Image delete_image;
    private Event event;
    private Main mainframe;
    private CustomPanel c;
    public DeleteButton(Event event, Main mainframe, CustomPanel c){
        this.event = event; 
        this.mainframe = mainframe;
        this.c = c;
        setContentAreaFilled(false);
        setPreferredSize(new Dimension(50,50));
        ImageIcon icon = new ImageIcon("src\\icons\\delete_icon.png");
        delete_image = icon.getImage();
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JDialog deleteDialog = mainframe.getDeleteDialog();
                deleteDialog.setVisible(true);
                deleteDialog.setSize(400,300);
                deleteDialog.setLocationRelativeTo(null);
                mainframe.setEventToEdit(event, c);
            }
        });
    }
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(0,0,0,30)); 
        g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        g2.setColor(new Color(214,40,40,64)); 
        g2.fillRoundRect(0, 0, getWidth()-4, getHeight()-4, 15, 15);
        int delete_width = delete_image.getHeight(null);
        int delete_height = delete_image.getHeight(null);
        int x = ((getWidth()-1)-delete_width)/2;
        int y = ((getHeight()-1)-delete_height)/2;
        g2.drawImage(delete_image, x, y, this);
    }
}
