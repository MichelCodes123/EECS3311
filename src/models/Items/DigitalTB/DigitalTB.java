package models.Items.DigitalTB;

import models.Items.Item;

public class DigitalTB extends Item {

	public String courseName;

	public DigitalTB(String id, String name) {
		super(id, name);
	}

	public DigitalTB(String id, String name, String courseName) {
		super(id, name);
		this.courseName = courseName;

	}
}
