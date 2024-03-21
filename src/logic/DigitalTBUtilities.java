package logic;

import java.util.ArrayList;
import java.util.Iterator;

import database_access.DigitalTBAccess;
import models.Course;
import models.Items.Item;
import models.Items.DigitalTB.DigitalTB;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;
import models.Users.User;

public class DigitalTBUtilities {

	public static DigitalTB digitize(Textbook b, String courseName) {

		return new DigitalTB(b.getName(), b.getId(), courseName);

	}

	public static void addAllDigitalTB(User s) {
		DigitalTBAccess acc = DigitalTBAccess.getInstance();

		if (s instanceof Student) {
			ArrayList<Course> coo = ((Student) s).getCourses();

			for (Course courses : coo) {
				for (Textbook tb : courses.getTextbooks()) {

					DigitalTB newTb = DigitalTBUtilities.digitize(tb, courses.getName());
					((Student) s).addDigitalTB(newTb.getName());
					acc.items.add(newTb);
				}
			}
		}
		try {
			acc.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void removeDigitalTB(String courseName, ArrayList<String> d) {
		DigitalTBAccess acc = DigitalTBAccess.getInstance();
		
		d.remove(courseName);
		
		
		Iterator<Item> b = acc.items.iterator();
		while (b.hasNext()) {
			Item t = b.next();
			if (((DigitalTB) t).getCourseName().equals(courseName)) {
				b.remove();
				
			}
		}
		
		try {
			acc.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
