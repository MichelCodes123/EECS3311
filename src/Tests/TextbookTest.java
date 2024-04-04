package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import models.Items.PhysicalItems.Textbook;
import models.LibraryManagementTeam.LibraryManagementTeam;
import models.Users.FacultyMember;

public class TextbookTest {
    private Textbook textbook;
    @Before
    public void setUp() {
        textbook = new Textbook("1", "Textbook 1", "Library", true, System.currentTimeMillis(), 10.0);
        new ArrayList<>();
        new ArrayList<>();
        textbook.addObserver(new FacultyMember("101", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>()));
        textbook.addLibraryObserver(new LibraryManagementTeam());
    }

    @Test
    public void testInitialization() {
        assertEquals("1", textbook.getId());
        assertEquals("Textbook 1", textbook.getName());
        assertEquals("Library", textbook.getLocation());
        assertTrue(textbook.isAvailable());
    }

    @Test
    public void testAddObserver() {
        assertEquals(1, textbook.getFacultyObservers().size());
    }

    @Test
    public void testAddLibraryObserver() {
        assertEquals(1, textbook.getLibraryObservers().size());
    }

    @Test
    public void testSetAvailability() {
        textbook.setAvailability(false);
        assertFalse(textbook.isAvailable());
    }

    @Test
    public void testLastNotificationFacultyObserver() {
        textbook.setAvailability(false);
        String lastNotification = ((FacultyMember) textbook.getFacultyObservers().get(0)).getLastNotification();
        assertEquals("Faculty Member Notification: Textbook 'Textbook 1' is not available.", lastNotification);
    }

    @Test
    public void testLastNotificationLibraryObserver() {
        textbook.setAvailability(false);
        String lastNotification = ((LibraryManagementTeam) textbook.getLibraryObservers().get(0)).getLastNotification();
        assertEquals("Library Management Team Notification: Textbook 'Textbook 1' is not available.", lastNotification);
    }

    @Test
    public void testIsAvailableAfterSetAvailability() {
        textbook.setAvailability(false);
        assertFalse(textbook.isAvailable());
    }

    @Test
    public void testIsAvailableInitially() {
        assertTrue(textbook.isAvailable());
    }

    @Test
    public void testLastNotificationWhenAvailable() {
        textbook.setAvailability(true);
        String lastNotification = ((LibraryManagementTeam) textbook.getLibraryObservers().get(0)).getLastNotification();
        assertEquals("Library Management Team Notification: New edition of textbook 'Textbook 1' is available.", lastNotification);
    }
    @Test
    public void testSetAvailabilityTextbookAvailable() {
        Textbook textbook = new Textbook("1", "Mathematics", "Library", true, System.currentTimeMillis(), 10.0);
        FacultyMember facultyMember = new FacultyMember("101", "John Doe", "john.doe@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        LibraryManagementTeam libraryManagementTeam = new LibraryManagementTeam();
        textbook.addObserver(facultyMember);
        textbook.addLibraryObserver(libraryManagementTeam);

        textbook.setAvailability(true);
        
        assertTrue(textbook.isAvailable());
        assertEquals("Faculty Member Notification: New edition of textbook 'Mathematics' is available.", facultyMember.getLastNotification());
        assertEquals("Library Management Team Notification: New edition of textbook 'Mathematics' is available.", libraryManagementTeam.getLastNotification());
    }    
}
