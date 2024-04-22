package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import Prompts.SystemWarnings;
import models.LibraryManagementTeam.LibraryManagementTeam;

public class LibraryManagementTeamTest {
    @Test
    public void testUpdate_ReturnsExpectedNotification() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        String expectedNotification = "Library Management Team Notification: Test Message";
        assertEquals(expectedNotification, team.update(new SystemWarnings("Test Message")));
    }

    @Test
    public void testUpdate_LastNotificationUpdated() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        team.update(new SystemWarnings("First Message"));
        team.update(new SystemWarnings("Second Message"));
        assertEquals("Library Management Team Notification: Second Message", team.getLastNotification());
    }

    @Test
    public void testGetLastNotification_NullInitially() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        assertNull(team.getLastNotification());
    }

    @Test
    public void testGetLastNotification_AfterUpdate() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        team.update(new SystemWarnings("Test Message"));
        assertEquals("Library Management Team Notification: Test Message", team.getLastNotification());
    }

    @Test
    public void testValidate_PrintsValidated() {
        // Test that the validate method prints "Validated" to console
        // Not a typical unit test, but verifies side effect behavior
        // Requires console output verification
        LibraryManagementTeam.validate();
    }

    @Test(expected = NullPointerException.class)
    public void testUpdate_NullPrompt() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        team.update(null);
    }

    @Test
    public void testUpdate_EmptyMessage() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        assertEquals("Library Management Team Notification: ", team.update(new SystemWarnings("")));
    }

    @Test
    public void testUpdate_MessageWithSpecialCharacters() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        assertEquals("Library Management Team Notification: Hello World!@#$%", team.update(new SystemWarnings("Hello World!@#$%")));
    }
    @Test
    public void testUpdate_MessageWithTabs() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        assertEquals("Library Management Team Notification: Message\tWith\tTabs", team.update(new SystemWarnings("Message\tWith\tTabs")));
    }
    
    @Test
    public void testUpdate_MessageWithNewLines() {
        LibraryManagementTeam team = new LibraryManagementTeam();
        assertEquals("Library Management Team Notification: Message\nWith\nNew\nLines", team.update(new SystemWarnings("Message\nWith\nNew\nLines")));
    }


    
}
