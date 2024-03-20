package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import database_access.NewsletterAccess;
import database_access.StudentAccess;
import models.Items.Newsletter;
import models.Users.Student;
import services.newsletterstrategy.NewsletterCancellation;
import services.newsletterstrategy.NewsletterStrategy;
import services.newsletterstrategy.NewsletterSubscription;

public class NewsletterSubscriptionTest {

	@Test
	@DisplayName("Newsletter Subscription")
	void subscribe() throws Exception {
		Student student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null);
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
	}

	@Test
	@DisplayName("Newsletter Cancellation")
	void cancel() throws Exception {
		Student student = new Student("1", "Jimmy", "email", "1234", true, 0.0, true, null, null, null);
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

	}
}
