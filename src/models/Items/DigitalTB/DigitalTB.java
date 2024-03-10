package models.Items.DigitalTB;

import models.Items.Item;

public class DigitalTB implements Item {

    String name;
    String id;

    public  DigitalTB(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
