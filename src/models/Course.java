package models;

import java.util.ArrayList;

import models.Items.PhysicalItems.Textbook;

public class Course {

	private int code;
	private String name;
	private ArrayList<Textbook> textbooks;

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

}
