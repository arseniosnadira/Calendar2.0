import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class CustomPanel extends JPanel{
    
    private JLabel titlos_label;
    private JTextArea desc_area;
    private Date date;
    private int radius = 14;
    private int x = 0;
    private int y =0;
    private EditButton editButton;
    private DeleteButton deleteButton;
    private Main mainframe;
    private Event event;

    
    private int index;
    
    public CustomPanel(){}
    
    public CustomPanel(Event event, Main mainframe){
        this.revalidate();
        this.repaint();
        this.index = index;
        titlos_label = new JLabel(event.getTitle());
        desc_area = new JTextArea(event.getDescription());
        desc_area.setLineWrap(true);
        desc_area.setWrapStyleWord(true);
        desc_area.setEditable(false);
        desc_area.setBorder(null);
        desc_area.setBackground(new Color(217,217,217,0));
        desc_area.setCaretColor(new Color(217,217,217,130));
        date = event.getEvent_date();
        this.event = event;
        this.setMaximumSize(new Dimension(1020,200));
        this.mainframe = mainframe;
        display_panel();
    }
    
    protected void display_panel() {
        setLayout(new GridBagLayout());  
        GridBagConstraints constraints1 = new GridBagConstraints();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        titlos_label.setText(titlos_label.getText()+"  -  "+dateFormat.format(date));
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.anchor = GridBagConstraints.SOUTHWEST;
        constraints1.insets = new Insets(10, 10, 10, 10);
        constraints1.fill = GridBagConstraints.HORIZONTAL;
        titlos_label.setFont(new Font("Arvo",Font.PLAIN, 22));
        this.add(titlos_label, constraints1);
        
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.weightx = 1;//1
        constraints2.weighty = 2;//1
        constraints2.anchor = GridBagConstraints.NORTHWEST;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        desc_area.setPreferredSize(new Dimension(800, 100));
        constraints2.insets = new Insets(10, 10, 10, 10);
        desc_area.setFont(new Font("Arvo",Font.PLAIN, 14));
        this.add(desc_area, constraints2);
        
        editButton = new EditButton(event, mainframe, this);
        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.gridx = 1;//1
        constraints3.gridy = 1;//1
        constraints3.weightx = 0;
        constraints3.weighty = 0;
        constraints3.anchor = GridBagConstraints.SOUTHEAST;
        editButton.setPreferredSize(new Dimension(50,50));
        constraints3.fill = GridBagConstraints.NONE;
        constraints3.insets = new Insets(10,10,10,10);
        this.add(editButton, constraints3);

        deleteButton = new DeleteButton(event, mainframe, this);
        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.gridx = 2;//2
        constraints4.gridy = 1;//1
        constraints4.weightx = 0;
        constraints4.weighty = 0;
        constraints4.anchor = GridBagConstraints.SOUTHEAST;
        deleteButton.setPreferredSize(new Dimension(50, 50));
        constraints4.insets = new Insets(10,10,10,10);
        this.add(deleteButton, constraints4);
        
        this.revalidate();
        this.repaint();  
    }

    public JTextArea getDesc_area() {
        return desc_area;
    }

    public EditButton getEditButton() {
        return editButton;
    }

    public DeleteButton getDeleteButton() {
        return deleteButton;
    }
    
    public JLabel getTitlos_label() {
        return titlos_label;
    }

    public void setTitlos_label(JLabel titlos_label) {
        this.titlos_label = titlos_label;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Event getEvent() {
        return event;
    }
    
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(217,217,217,130));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
    }
}
