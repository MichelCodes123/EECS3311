package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Request;
import services.RequestBook;
import services.RequestService;

class RequestBookTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterEach
	 void tearDown() {
		RequestService rs = RequestService.getInstance();
		rs.requestQueue.clear();
	}

	@Test
	void testNumRequests() {

		RequestBook.execute("120-11", "1", "Course");
		RequestBook.execute("120-11", "2", "Self improvement");

		RequestService rs = RequestService.getInstance();

		assertEquals(2, rs.requestQueue.size());

	}

	@Test
	void testProperOrdering() {

		// RequestBook.execute("120-11", "2", "Self-improvement");
		RequestBook.execute("120-11", "1", "Course");
		RequestBook.execute("120-11", "2", "Self-improvement");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("Course", r.getType());

	}

	@Test
	@DisplayName("Anything other than Course gets low priority")
	void testLowPriority() {
		RequestBook.execute("120-11", "1", "Turtles");
		RequestBook.execute("120-12", "2", "Course");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("Course", r.getType());
	}

	@Test
	@DisplayName("Oldest entry takes precedence for high priority")
	void testPriorityOrdering() {
		RequestBook.execute("120-11", "1", "Course");
		RequestBook.execute("120-12", "2", "Course");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("120-11", r.getBookId());
	}

	@Test
	@DisplayName("Oldest entry takes precedence for low priority")
	void testPriorityOrdering1() {
		RequestBook.execute("120-11", "1", "Blah");
		RequestBook.execute("120-12", "2", "Blah");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("120-11", r.getBookId());
	}


	@Test
	void testNumRequestsDiffIDFormat() {

		RequestBook.execute("120", "1", "Course");
		RequestBook.execute("120", "2", "Self improvement");

		RequestService rs = RequestService.getInstance();

		assertEquals(2, rs.requestQueue.size());

	}

	@Test
	void testProperOrderingDiffIDFormat() {

		// RequestBook.execute("120-11", "2", "Self-improvement");
		RequestBook.execute("120", "1", "Course");
		RequestBook.execute("120", "2", "Self-improvement");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("Course", r.getType());

	}

	@Test
	@DisplayName("Anything other than Course gets low priority")
	void testLowPriorityDiffIDFormat() {
		RequestBook.execute("120", "1", "Turtles");
		RequestBook.execute("12", "2", "Course");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("Course", r.getType());
	}

	@Test
	@DisplayName("Oldest entry takes precedence for high priority")
	void testPriorityOrderingDiffIDFormat() {
		RequestBook.execute("120", "1", "Course");
		RequestBook.execute("12", "2", "Course");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("120", r.getBookId());
	}

	@Test
	@DisplayName("Oldest entry takes precedence for low priority")
	void testPriorityOrdering1DiffIDFormat() {
		RequestBook.execute("120", "1", "Blah");
		RequestBook.execute("12", "2", "Blah");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("120", r.getBookId());
	}

}