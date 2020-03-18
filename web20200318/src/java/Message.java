

public class Message {
    private String name;
    private String text;
    public Message(String n, String t) {
        name = n;
        text = t;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
