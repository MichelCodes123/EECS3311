package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import models.Items.PhysicalItems.Textbook;
import models.LibraryManagementTeam.LibraryManagementTeam;
import models.Users.FacultyMember;

public class TestObserver {
	@Test
	public void testTextbookAvailabilityNotification1() {
		// Create a textbook
		Textbook textbook = new Textbook("1", "Computer Science: An Overview", "Library", true,
				System.currentTimeMillis(), 50.0);

		// Create a faculty member
		FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0,
				true, new ArrayList<>(), new ArrayList<>());
		// Subscribe faculty member to receive notifications
		textbook.addObserver(facultyMember);

		// Set textbook availability to true to simulate a new edition
		textbook.setAvailability(true);

		// Check if the notification is as expected
		assertEquals(
				"Faculty Member Notification: New edition of textbook 'Computer Science: An Overview' is available.",
				facultyMember.getLastNotification());

	}

	@Test
	public void testTextbookAvailabilityNotification2() {
		// Create a textbook
		Textbook textbook = new Textbook("1", "Introduction to Java", "Library A", true, System.currentTimeMillis(),
				50.0);

		// Create a faculty member
		FacultyMember facultyMember = new FacultyMember("101", "John Doe", "john@example.com", "password", true, 0.0,
				true, new ArrayList<>(), new ArrayList<>());

		// Subscribe faculty member to textbook notifications
		textbook.addObserver(facultyMember);

		// Set textbook availability and check if faculty member is notified
		textbook.setAvailability(true);
		assertEquals("Faculty Member Notification: New edition of textbook 'Introduction to Java' is available.",
				facultyMember.getLastNotification());
	}

	@Test
	public void testAddObserver() {
		Textbook textbook = new Textbook("1", "Chemistry", "Library", true, null, null);
		FacultyMember facultyMember = new FacultyMember("1", "Jane Smith", "jane@example.com", "password", true, 0.0,
				true, new ArrayList<>(), new ArrayList<>());

		textbook.addObserver(facultyMember);

		assertTrue(textbook.getFacultyObservers().contains(facultyMember));
	}

	@Test
	public void testAddLibraryObserver() {
		Textbook textbook = new Textbook("1", "Biology", "Library", true, null, null);
		LibraryManagementTeam libraryManagementTeam = new LibraryManagementTeam();

		textbook.addLibraryObserver(libraryManagementTeam);

		assertTrue(textbook.getLibraryObservers().contains(libraryManagementTeam));
	}

	@Test
	public void testTextbookUnavailableNotification() {
		// Create a textbook
		Textbook textbook = new Textbook("2", "Data Structures and Algorithms", "Library B", true,
				System.currentTimeMillis(), 60.0);

		LibraryManagementTeam libraryManagementTeam = new LibraryManagementTeam();

		// Subscribe library management team to textbook notifications
		textbook.addLibraryObserver(libraryManagementTeam);
		// Set textbook availability to false and check if library management team is
		// notified
		textbook.setAvailability(false);
		assertEquals(
				"Library Management Team Notification: Textbook 'Data Structures and Algorithms' is not available.",
				libraryManagementTeam.getLastNotification());
	}

	@Test
	public void testTextbookUnavailableNotification1() {
		Textbook textbook = new Textbook("1", "Java Programming", "Library", true, System.currentTimeMillis(), 50.0);

		LibraryManagementTeam libraryManagementTeam = new LibraryManagementTeam();
		textbook.addLibraryObserver(libraryManagementTeam);
		textbook.setAvailability(false);
		assertEquals("Library Management Team Notification: Textbook 'Java Programming' is not available.",
				libraryManagementTeam.getLastNotification());
	}

	@Test
	public void testTextbookAvailabilityExclusive() {
		// Create a textbook
		Textbook textbook = new Textbook("1", "Computer Science: An Overview", "Library", true,
				System.currentTimeMillis(), 50.0);

		// Set textbook availability to true
		textbook.setAvailability(true);

		// Check that the textbook is available
		assertTrue(textbook.isAvailable());

		// Set textbook availability to false
		textbook.setAvailability(false);

		// Check that the textbook is no longer available
		assertFalse(textbook.isAvailable());
	}

	@Test
	public void testTextbookNotifications() {
		// Create faculty members
		FacultyMember facultyMember1 = new FacultyMember("1", "John", "john@example.com", "password", true, 0.0, true,
				new ArrayList<>(), new ArrayList<>());
		// FacultyMember facultyMember2 = new FacultyMember("2", "Jane Smith",
		// "jane@example.com", "password", true, 0.0, true, new ArrayList<>());

		// Create a library management team
		LibraryManagementTeam libraryManagementTeam = new LibraryManagementTeam();

		// Create textbooks
		Textbook textbook1 = new Textbook("1", "Computer Science: An Overview", "Library", true,
				System.currentTimeMillis(), 50.0);
		Textbook textbook2 = new Textbook("2", "Data Structures and Algorithms", "Library", true,
				System.currentTimeMillis(), 60.0);

		// Subscribe faculty members and library management team to receive
		// notifications
		textbook1.addObserver(facultyMember1);
		textbook1.addLibraryObserver(libraryManagementTeam);
		// textbook2.addObserver(facultyMember2);
		textbook2.addLibraryObserver(libraryManagementTeam);

		// Notify library management team about textbook availability
		textbook1.setAvailability(true);
		textbook2.setAvailability(false);
		System.out.println("Notification for faculty member 1: " + facultyMember1.getLastNotification());
		System.out.println("Notification for faculty member 1: " + libraryManagementTeam.getLastNotification());

		// System.out.println("Notification for faculty member 2: " +
		// facultyMember2.getLastNotification());

		// Check if notifications are as expected
		assertEquals(
				"Faculty Member Notification: New edition of textbook 'Computer Science: An Overview' is available.",
				facultyMember1.getLastNotification());
		assertEquals(
				"Library Management Team Notification: Textbook 'Data Structures and Algorithms' is not available.",
				libraryManagementTeam.getLastNotification());
	}
}
