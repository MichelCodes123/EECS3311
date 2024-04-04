package Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import Prompts.SystemWarnings;
import models.TextbookObserver.TextbookObserver;
import models.Users.FacultyMember;

public class TextbookObserverTest {
    @Test
	public void testUpdateWithSimplePrompt() {
	    // Arrange
	    FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
	    TextbookObserver observer = facultyMember;
	    SystemWarnings simplePrompt = new SystemWarnings("This is a simple prompt.");

	    // Act
	    String result = observer.update(simplePrompt);

	    // Assert
	    assertEquals("Faculty Member Notification: This is a simple prompt.", result);
	}


    @Test
    public void testUpdateWithEmptyPrompt() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: ", observer.update(new SystemWarnings("")));
    }
   

    @Test
    public void testUpdateWithValidPrompt() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: Valid prompt", observer.update(new SystemWarnings("Valid prompt")));
    }

    @Test
    public void testUpdateWithDifferentPrompts() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: Prompt 1", observer.update(new SystemWarnings("Prompt 1")));
        assertEquals("Faculty Member Notification: Prompt 2", observer.update(new SystemWarnings("Prompt 2")));
    }

    @Test
    public void testUpdateWithLongPrompt() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        String longPrompt = "This is a long prompt that exceeds the typical length of a prompt.";
        assertEquals("Faculty Member Notification: " + longPrompt, observer.update(new SystemWarnings(longPrompt)));
    }

    @Test
    public void testUpdateWithSpecialCharactersPrompt() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: Special characters: @#$%", observer.update(new SystemWarnings("Special characters: @#$%")));
    }

    @Test
    public void testUpdateWithNumericPrompt() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: 12345", observer.update(new SystemWarnings("12345")));
    }

    @Test
    public void testUpdateWithPromptContainingWhitespace() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: Prompt with whitespace", observer.update(new SystemWarnings("Prompt with whitespace")));
    }

    @Test
    public void testUpdateWithPromptContainingNewline() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: Prompt\nwith\nnewline", observer.update(new SystemWarnings("Prompt\nwith\nnewline")));
    }

    @Test
    public void testUpdateWithPromptContainingEscapeCharacters() {
        FacultyMember facultyMember = new FacultyMember("1", "John Doe", "john@example.com", "password", true, 0.0, true, new ArrayList<>(), new ArrayList<>());
        TextbookObserver observer = facultyMember;
        assertEquals("Faculty Member Notification: Prompt with escape characters: \\t\\n", observer.update(new SystemWarnings("Prompt with escape characters: \\t\\n")));
    }
    
}
