import java.util.Date;

public class Event {
    
    private String title;
    private String description;
    private Date event_date;
    
    public Event(){}
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getEvent_date() {
        return event_date;
    }
    
    public Event(String title, String description, Date event_date){
        this.title = title;
        this.description = description;
        this.event_date = event_date;
    }
}
