package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Prompts.SystemPrompts;
import Prompts.SystemWarnings;
import models.LibraryManagementTeam.LibraryManagementTeamObserver;

public class LibraryManagementTeamObserverTest {
    @Test
    public void testUpdate_ReturnsExpectedMessage() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with a sample SystemPrompts object
        SystemPrompts prompt = new SystemWarnings("Test Message");
        assertEquals("Received: Test Message", observer.update(prompt));
    }

    @Test
    public void testUpdate_NullPrompt() {
        LibraryManagementTeamObserver observer = prompt -> {
            if (prompt == null) {
                return "Received: null";
            } else {
                return "Received: " + prompt.getMessage();
            }
        };

        // Test with null SystemPrompts object
        assertEquals("Received: null", observer.update(null));
    }
    @Test
    public void testUpdate_MessageWithNullMessage() {
        LibraryManagementTeamObserver observer = prompt -> {
            if (prompt == null) {
                return "Received: null";
            } else if (prompt.getMessage() == null) {
                return "Received: Message is null";
            } else {
                return "Received: " + prompt.getMessage();
            }
        };

        // Test with a message containing a null message
        SystemPrompts prompt = new SystemWarnings(null);
        assertEquals("Received: Message is null", observer.update(prompt));
    }



    @Test
    public void testUpdate_EmptyMessage() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with an empty message
        SystemPrompts prompt = new SystemWarnings("");
        assertEquals("Received: ", observer.update(prompt));
    }

    @Test
    public void testUpdate_MessageWithSpecialCharacters() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with a message containing special characters
        SystemPrompts prompt = new SystemWarnings("Hello World!@#$%");
        assertEquals("Received: Hello World!@#$%", observer.update(prompt));
    }

    @Test
    public void testUpdate_MessageWithLeadingTrailingSpaces() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with a message containing leading and trailing spaces
        SystemPrompts prompt = new SystemWarnings("   Message With Spaces   ");
        assertEquals("Received:    Message With Spaces   ", observer.update(prompt)); // Leading and trailing spaces not trimmed
    }

    @Test
    public void testUpdate_MessageWithNewLines() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with a message containing new lines
        SystemPrompts prompt = new SystemWarnings("Message\nWith\nNew\nLines");
        assertEquals("Received: Message\nWith\nNew\nLines", observer.update(prompt));
    }

    @Test
    public void testUpdate_MessageWithTabs() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with a message containing tabs
        SystemPrompts prompt = new SystemWarnings("Message\tWith\tTabs");
        assertEquals("Received: Message\tWith\tTabs", observer.update(prompt));
    }

    @Test
    public void testUpdate_MessageWithMixedSpaces() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with a message containing mixed spaces
        SystemPrompts prompt = new SystemWarnings("Message   With   Mixed   Spaces");
        assertEquals("Received: Message   With   Mixed   Spaces", observer.update(prompt));
    }

    @Test
    public void testUpdate_MessageWithSingleSpace() {
        LibraryManagementTeamObserver observer = prompt -> "Received: " + prompt.getMessage();

        // Test with a message containing a single space
        SystemPrompts prompt = new SystemWarnings(" Message With Single Space ");
        assertEquals("Received:  Message With Single Space ", observer.update(prompt));
    }

    
}
