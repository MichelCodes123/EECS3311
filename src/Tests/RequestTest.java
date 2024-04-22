package Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import models.Request;
import models.Users.FacultyMember;
import models.Users.User;

public class RequestTest {
    @Test
    public void testGetUserId() {
        Request request = new Request("1", "123", "type");
        assertEquals("123", request.getId());
    }

    @Test
    public void testGetBookId() {
        Request request = new Request("1", "123", "type");
        assertEquals("1", request.getBookId());
    }

    @Test
    public void testSetBookId() {
        Request request = new Request("1", "123", "type");
        request.setBookId("2");
        assertEquals("2", request.getBookId());
    }

    @Test
    public void testGetRequester() {
        Request request = new Request("1", "123", "type");
        User user= new FacultyMember("123", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        request.setRequester(user);
        assertEquals(user, request.getRequester());
    }



    @Test
    public void testGetType() {
        Request request = new Request("1", "123", "type");
        assertEquals("type", request.getType());
    }

    @Test
    public void testSetType() {
        Request request = new Request("1", "123", "type");
        request.setType("otherType");
        assertEquals("otherType", request.getType());
    }

    @Test
    public void testCompareTo() {
        Request request1 = new Request("1", "123", "type");
        request1.setPriority(1);
        Request request2 = new Request("2", "456", "type");
        request2.setPriority(0);
        assertEquals(-1, request1.compareTo(request2));
    }

    @Test
    public void testDefaultPriority() {
        Request request = new Request("1", "123", "type");
        request.setType("type");
        assertEquals(0, request.compareTo(new Request("2", "456", "type")));
    }
    @Test
    public void testInvalidRequestType() {
        Request request = new Request("1", "123", "invalidType");
        assertEquals("invalidType", request.getType());
    }
    @Test
    public void testSetPriority() {
        Request request1 = new Request("1", "123", "type1");
        Request request2 = new Request("2", "456", "type2");

        request1.setPriority(1);
        request2.setPriority(0);

        // Comparing the requests after setting priorities
        assertEquals(-1, request1.compareTo(request2)); // Assuming request1 should have higher priority than request2
    }
    
}
