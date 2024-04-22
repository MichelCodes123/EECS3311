package logic;

import java.util.ArrayList;
import java.util.Iterator;

import database_access.DigitalTBAccess;
import database_access.StudentAccess;
import models.Course;
import models.Items.Item;
import models.Items.DigitalTB.DigitalTB;
import models.Items.PhysicalItems.Textbook;
import models.Users.Student;
import models.Users.User;

public class DigitalTBUtilities {

	public static DigitalTB digitize(Textbook b, String courseName) {
		
		if (b == null || courseName.equals("")) {
			return null;
		}
		

		return new DigitalTB(b.getId(),b.getName(),courseName);

	}

	public static void addAllDigitalTB(User s) {
		DigitalTBAccess acc = DigitalTBAccess.getInstance();
		StudentAccess studentdb = StudentAccess.getInstance();
		try {
			studentdb.load();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		if (s instanceof Student) {
			ArrayList<Course> coo = ((Student) s).getCourses();

			for (Course courses : coo) {
				for (Textbook tb : courses.getTextbooks()) {

					DigitalTB newTb = DigitalTBUtilities.digitize(tb, courses.getName());
					((Student) s).addDigitalTB(newTb.getName());
					studentdb.users.add(s);
					try {
						studentdb.update();
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
					
					((Student) s).addDigitalTB(newTb.getName());
					int i = 0;
					try {
						studentdb.load();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for (User student : studentdb.users) {
						if (student.getId().equals(s.getId())) {
							studentdb.users.set(i, s);
							try {
								studentdb.update();
								break;
							} catch (Exception e) {
								throw new RuntimeException(e);
							}
						}
						i++;
					}

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

	public static void removeDigitalTB(Course c, ArrayList<String> d) {
		DigitalTBAccess acc = DigitalTBAccess.getInstance();
		
		ArrayList<String > stringTbs = new ArrayList<String>();
		for (Textbook arr: c.getTextbooks()) {
			stringTbs.add(arr.getName());
				
		}
		//acc.items.removeAll(stringTbs);
		d.removeAll(stringTbs);
				
		try {
			acc.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<Item> b = acc.items.iterator();
		while (b.hasNext()) {
			Item t = b.next();
			if (((DigitalTB) t).getCourseName().equals(c.getName())) {
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
