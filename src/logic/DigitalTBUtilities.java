package logic;

import java.util.ArrayList;
import java.util.Iterator;

import models.Course;
import models.Items.DigitalTB.DigitalTB;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;
import models.Users.User;

public class DigitalTBUtilities {

	public static DigitalTB digitize(Textbook b, String courseName) {

		return new DigitalTB(b.getName(), b.getId(), courseName);

	}

	public static void addAllDigitalTB(User s) {
		if (s instanceof Student) {
			ArrayList<Course> coo = ((Student) s).getCourses();

			for (Course courses : coo) {
				for (Textbook tb : courses.getTextbooks()) {
					((Student) s).addDigitalTB(DigitalTBUtilities.digitize(tb, courses.getName()));
				}
			}
		}
	}

	public static void removeDigitalTB(String courseName, ArrayList<DigitalTB> d) {

		Iterator<DigitalTB> a = d.iterator();
		while (a.hasNext()) {
			DigitalTB t = a.next();
			if (t.getCourseName().equals(courseName)) {
				a.remove();
			}
		}

	}

}
