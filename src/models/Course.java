package models;

import java.util.ArrayList;

import models.Items.PhysicalItems.Textbook;

public class Course {

	private int code;
	private String name;
	private ArrayList<Textbook> textbooks;

	public Course(String name, ArrayList<Textbook> tb) {
		this.name = name;
		textbooks = tb;

	}

	public Course(String string) {
		this.name = string;
		textbooks = new ArrayList<Textbook>();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Textbook> getTextbooks() {
		return this.textbooks;
	}

	public void setTextbook(ArrayList<Textbook> textbook) {
		this.textbooks = textbook;
	}

	public void addTextbook(Textbook b) {
		textbooks.add(b);

	}

}
