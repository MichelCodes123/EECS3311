package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import database_access.*;
import models.Users.FacultyMember;
import models.Users.NonFacultyStaff;
import models.Users.Visitor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Items.Newsletter;
import models.Users.Student;
import services.newsletterstrategy.NewsletterCancellation;
import services.newsletterstrategy.NewsletterStrategy;
import services.newsletterstrategy.NewsletterSubscription;

import java.util.ArrayList;

public class NewsletterSubscriptionTest {

	@Test
	@DisplayName("Newsletter Subscription")
	void subscribe() throws Exception {
		Student student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null, new ArrayList<>());
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.users.add(student);
		studentdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), student.getId());
		studentdb.load();

		assertEquals(1, studentdb.users.get(0).getSubscribed_newsletters().size());

		studentdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		studentdb.update();
		newsdb.update();
	}

	@Test
	@DisplayName("Newsletter Cancellation")
	void cancel() throws Exception {
		Student student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null,  new ArrayList<>());
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		StudentAccess studentdb = StudentAccess.getInstance();
		studentdb.users.add(student);
		studentdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), student.getId());
		studentdb.load();

		assertEquals(1, studentdb.users.get(0).getSubscribed_newsletters().size());

		strat = new NewsletterCancellation();
		strat.execute(newsletter.getLink(), student.getId());
		studentdb.load();

		assertEquals(0, studentdb.users.get(0).getSubscribed_newsletters().size());

		studentdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		studentdb.update();
		newsdb.update();

	}

	@Test
	@DisplayName("Newsletter Subscription Visitor")
	void subscribeVisitor() throws Exception {
		Visitor visitor = new Visitor("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		VisitorAccess userdb = VisitorAccess.getInstance();
		userdb.users.add(visitor);
		userdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), visitor.getId());
		userdb.load();

		assertEquals(1, userdb.users.get(0).getSubscribed_newsletters().size());

		userdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		userdb.update();
		newsdb.update();
	}

	@Test
	@DisplayName("Newsletter Cancellation Visitor")
	void cancelVisitor() throws Exception {
		Visitor visitor = new Visitor("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		VisitorAccess userdb = VisitorAccess.getInstance();
		userdb.users.add(visitor);
		userdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), visitor.getId());
		userdb.load();

		assertEquals(1, userdb.users.get(0).getSubscribed_newsletters().size());

		strat = new NewsletterCancellation();
		strat.execute(newsletter.getLink(), visitor.getId());
		userdb.load();

		assertEquals(0, userdb.users.get(0).getSubscribed_newsletters().size());

		userdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		userdb.update();
		newsdb.update();
	}


	@Test
	@DisplayName("Newsletter Subscription Staff")
	void subscribeStaff() throws Exception {
		NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		NonFacultyStaffAccess userdb = NonFacultyStaffAccess.getInstance();
		userdb.users.add(staff);
		userdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), staff.getId());
		userdb.load();

		assertEquals(1, userdb.users.get(0).getSubscribed_newsletters().size());

		userdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		userdb.update();
		newsdb.update();
	}

	@Test
	@DisplayName("Newsletter Cancellation Staff")
	void cancelStaff() throws Exception {
		NonFacultyStaff staff = new NonFacultyStaff("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		NonFacultyStaffAccess userdb = NonFacultyStaffAccess.getInstance();
		userdb.users.add(staff);
		userdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), staff.getId());
		userdb.load();

		assertEquals(1, userdb.users.get(0).getSubscribed_newsletters().size());

		strat = new NewsletterCancellation();
		strat.execute(newsletter.getLink(), staff.getId());
		userdb.load();

		assertEquals(0, userdb.users.get(0).getSubscribed_newsletters().size());

		userdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		userdb.update();
		newsdb.update();
	}

	@Test
	@DisplayName("Newsletter Subscription Prof")
	void subscribeProf() throws Exception {
		FacultyMember staff = new FacultyMember("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		FacultyMemberAccess userdb = FacultyMemberAccess.getInstance();
		userdb.users.add(staff);
		userdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), staff.getId());
		userdb.load();

		assertEquals(1, userdb.users.get(0).getSubscribed_newsletters().size());

		userdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		userdb.update();
		newsdb.update();
	}

	@Test
	@DisplayName("Newsletter Cancellation Prof")
	void cancelProf() throws Exception {
		FacultyMember staff = new FacultyMember("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		FacultyMemberAccess userdb = FacultyMemberAccess.getInstance();
		userdb.users.add(staff);
		userdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		strat.execute(newsletter.getLink(), staff.getId());
		userdb.load();

		assertEquals(1, userdb.users.get(0).getSubscribed_newsletters().size());

		strat = new NewsletterCancellation();
		strat.execute(newsletter.getLink(), staff.getId());
		userdb.load();

		assertEquals(0, userdb.users.get(0).getSubscribed_newsletters().size());

		userdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		userdb.update();
		newsdb.update();
	}


	@Test
	void noUserFound() throws Exception {
		FacultyMember staff = new FacultyMember("1", "Jimmy", "email", "1234", true, 0.0, true, null, null);
		Newsletter newsletter = new Newsletter("0", "NY Times", "mylink");

		FacultyMemberAccess userdb = FacultyMemberAccess.getInstance();
		userdb.users.add(staff);
		userdb.update();

		NewsletterAccess newsdb = NewsletterAccess.getInstance();
		newsdb.items.add(newsletter);
		newsdb.update();

		NewsletterStrategy strat = new NewsletterSubscription();
		assertThrows(Exception.class, () -> {
			strat.execute(newsletter.getLink(), "xyz");
		});

		userdb.users = new ArrayList<>();
		newsdb.items = new ArrayList<>();

		userdb.update();
		newsdb.update();
	}
}
