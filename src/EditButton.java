import com.toedter.calendar.JDateChooser;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class EditButton extends JButton{
    
    private Image edit_image;
    private Main mainframe;
    private CustomPanel c;
    private Event event;
    
    
    public EditButton(){}
    public EditButton(Event event, Main mainframe, CustomPanel c){
        this.event = event;
        this.mainframe = mainframe;
        setContentAreaFilled(false);
        setPreferredSize(new Dimension(50,50));
        ImageIcon icon = new ImageIcon("src\\icons\\edit_icon.png");
        edit_image = icon.getImage();
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JDialog editDialog = mainframe.getEditDialog();
                editDialog.setVisible(true);
                editDialog.setSize(600, 600);
                editDialog.setLocationRelativeTo(null);
                JTextField edit_titleValue = mainframe.getTextField();
                JDateChooser edit_dateChooser = mainframe.getDateChooser();
                JTextArea edit_descValue = mainframe.getTextArea();
                edit_descValue.setLineWrap(true);
                CancelButton editDial_cancelButton = mainframe.getCancelButton();
                edit_titleValue.setText(event.getTitle());
                edit_dateChooser.setDate(event.getEvent_date());
                edit_descValue.setText(event.getDescription());
                mainframe.setEventToEdit(event, c); 
            }
        });
    }
    
    public void setEvent(Event event) {
        this.event = event;
    }
    
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(0,0,0,30)); 
        g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 500, 500);
        g2.setColor(new Color(158,214,218,110)); 
        g2.fillRoundRect(0, 0, getWidth()-4, getHeight()-4, 500, 500);
        int edit_width = edit_image.getHeight(null);
        int edit_height = edit_image.getHeight(null);
        int x = ((getWidth()-1)-edit_width)/2;
        int y = ((getHeight()-1)-edit_height)/2;
        g2.drawImage(edit_image, x, y, this);
    }
}
