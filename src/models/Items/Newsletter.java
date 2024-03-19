package models.Items;

public class Newsletter extends Item {

    String link;

    public Newsletter(String id, String name, String link) {
        super(id, name);
        this.link = link;
    }

    public String getLink() {
        return link;
    }
}
