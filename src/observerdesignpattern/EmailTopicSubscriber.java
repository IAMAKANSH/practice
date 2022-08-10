package observerdesignpattern;

public class EmailTopicSubscriber implements Observer{

    private String name;
    private Subject subject;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg= (String) subject.getUpdate(this);
        if (msg==null)
            System.out.println(name+ " No new message to this topic");
        else
            System.out.println(name+" Retrieving message "+msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject=subject;
    }
}
