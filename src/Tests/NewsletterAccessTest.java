package Tests;

import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import database_access.BookAccess;
import database_access.NewsletterAccess;
import database_access.QueryUtilities;
import models.Items.Newsletter;
import models.Users.FacultyMember;

public class NewsletterAccessTest {
    private NewsletterAccess newsletterAccess;
    

    @BeforeEach
    void setUp() {
        // Assuming BookAccess.items can be reset or cleared for testing purposes
        newsletterAccess = NewsletterAccess.getInstance();
        newsletterAccess.items.clear(); // Clear the list to ensure a clean state for each test
    }
    @AfterEach
    void tearDown() {
        newsletterAccess.items.clear(); // Clear the list to ensure a clean state for each test
        try {
            newsletterAccess.update();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    void testSingletonInstance() {
        NewsletterAccess instance1 = NewsletterAccess.getInstance();
        NewsletterAccess instance2 = NewsletterAccess.getInstance();
        assertSame(instance1, instance2, "getInstance() should return the same instance.");
    }
     @Test
    public void testAddNewsletter() throws Exception {
        Newsletter news = new Newsletter("5", "New York Times", "https://www.nytimes.com/");
        newsletterAccess.items.add(news);
        assertEquals(1, newsletterAccess.items.size());
    }
  
    @Test
    public void testLoad() throws Exception {
        newsletterAccess.load();
        assertEquals(0, newsletterAccess.items.size());
    }
    
    @Test
    public void testUpdate() throws Exception {
        newsletterAccess.update();
        assertEquals(0, newsletterAccess.items.size());
    }
    @Test
    public void testUpdate2() throws Exception {
        Newsletter news = new Newsletter("5", "New York Times", "https://www.nytimes.com/");
        newsletterAccess.items.add(news);
        newsletterAccess.update();
        assertEquals(0, newsletterAccess.items.size());
    }
    @Test
    public void testLoad2() throws Exception {
        Newsletter news = new Newsletter("5", "New York Times", "https://www.nytimes.com/");
        newsletterAccess.items.add(news);
        newsletterAccess.update();
        newsletterAccess.load();
        assertEquals(1, newsletterAccess.items.size());
    }
    @Test
    public void testLoad3() throws Exception {
        Newsletter news = new Newsletter("5", "New York Times", "https://www.nytimes.com/");
        newsletterAccess.items.add(news);
        newsletterAccess.update();
        newsletterAccess.load();
        assertEquals("5", newsletterAccess.items.get(0).getId());
    }
    @Test
    public void testLoad4() throws Exception {
        Newsletter news = new Newsletter("5", "New York Times", "https://www.nytimes.com/");
        newsletterAccess.items.add(news);
        newsletterAccess.update();
        newsletterAccess.load();
        assertEquals("New York Times", newsletterAccess.items.get(0).getName());

    }
    @Test
    public void testLoad5() throws Exception {
        Newsletter news = new Newsletter("5", "New York Times", "https://www.nytimes.com/");
        newsletterAccess.items.add(news);
        newsletterAccess.update();
        newsletterAccess.load();
        assertEquals("https://www.nytimes.com/", newsletterAccess.items.get(0).getLink());
    }
    @Test
    public void testAdditionOfDuplicateNewsletters() throws Exception {
        Newsletter newsletter1 = new Newsletter("1", "New York Times", "https://www.nytimes.com/");
        Newsletter newsletter2 = new Newsletter("1", "The Guardian", "https://www.theguardian.com/international");

        newsletterAccess.items.add(newsletter1);
        newsletterAccess.items.add(newsletter2);
        newsletterAccess.update(); 

        newsletterAccess.load(); 
       
        assertEquals( 2, newsletterAccess.items.size());
    }

    
}
