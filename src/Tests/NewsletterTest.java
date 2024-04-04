package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import models.Items.Newsletter;

public class NewsletterTest {

    private Newsletter newsletter;

    @Before
    public void setUp() {
        newsletter = new Newsletter("1", "Weekly Digest", "https://example.com/weekly");
    }

    @Test
    public void testGetId() {
        assertEquals("1", newsletter.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Weekly Digest", newsletter.getName());
    }

    @Test
    public void testGetLink() {
        assertEquals("https://example.com/weekly", newsletter.getLink());
    }

    @Test
    public void testEqualsDifferentName() {
        Newsletter otherNewsletter = new Newsletter("1", "Monthly Update", "https://example.com/weekly");
        assertFalse(newsletter.equals(otherNewsletter));
    }

    @Test
    public void testSetName() {
        newsletter.setName("Monthly Update");
        assertEquals("Monthly Update", newsletter.getName());
    }

    @Test
    public void testEqualsDifferentLink() {
        Newsletter otherNewsletter = new Newsletter("1", "Weekly Digest", "https://example.com/monthly");
        assertFalse(newsletter.equals(otherNewsletter));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(newsletter.equals(newsletter));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(newsletter.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(newsletter.equals("Weekly Digest"));
    }

    @Test
    public void testEqualsDifferentId() {
        Newsletter otherNewsletter = new Newsletter("2", "Weekly Digest", "https://example.com/weekly");
        assertFalse(newsletter.equals(otherNewsletter));
    }
    
}
