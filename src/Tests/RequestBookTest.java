package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;

import models.Request;
import services.RequestBook;
import services.RequestService;

class RequestBookTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	// @Test
	void testNumRequests() {

		RequestBook.execute("120-11", "1", "Course");
		RequestBook.execute("120-11", "2", "Self improvement");

		RequestService rs = RequestService.getInstance();

		assertEquals(2, rs.requestQueue.size());

	}

	// @Test
	void testProperOrdering() {

		// RequestBook.execute("120-11", "2", "Self-improvement");
		RequestBook.execute("120-11", "1", "Course");
		RequestBook.execute("120-11", "2", "Self-improvement");

		RequestService rs = RequestService.getInstance();

		Request r = rs.requestQueue.peek();
		assertEquals("Course", r.getType());

	}

}
