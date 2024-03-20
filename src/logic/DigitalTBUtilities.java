package logic;
import java.util.ArrayList;

import models.Course;
import models.Items.DigitalTB.DigitalTB;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;
import models.Users.User;

public class DigitalTBUtilities {

	public static DigitalTB digitize(Textbook b, String courseName) {

		return new DigitalTB(b.getName(), b.getId(), courseName);

	}

	public void addAllDigitalTB(User s) {
		if (s instanceof Student) {
			ArrayList<Course> coo = ((Student) s).getCourses();

			for (Course courses : coo) {
				for (Textbook tb : courses.getTextbooks()) {
					((Student) s).addDigitalTB(DigitalTBUtilities.digitize(tb, courses.getName()));
				}
			}
		}
	}

	public void removeDigitalTB(String courseName, User s) {
		if (s instanceof Student) {

			for (DigitalTB d : ((Student) s).getDigital_textbooks()) {
				if (d.getCourseName().equals(courseName)) {
					((Student) s).getDigital_textbooks().remove(d);
				}

			}

		}

	}

}
