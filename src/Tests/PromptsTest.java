package Tests;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.lang.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import Prompts.SystemNotifications;
import Prompts.SystemPrompts;
import Prompts.SystemWarnings;
import database_access.BookAccess;
import database_access.CdAccess;
import database_access.FacultyMemberAccess;
import database_access.MagazineAccess;
import database_access.NonFacultyStaffAccess;
import database_access.QueryUtilities;
import database_access.StudentAccess;
import database_access.VisitorAccess;
import models.Course;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import models.Items.PhysicalItems.Magazine;
import models.Items.PhysicalItems.PhysicalItem;
import models.Items.PhysicalItems.Textbook;
import models.Users.FacultyMember;
import models.Users.NonFacultyStaff;
import models.Users.Student;
import models.Users.Visitor;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

import java.util.ArrayList;
import java.util.Date;


public class PromptsTest {


    @Test
    void MultiWordPromptTest() {
        SystemPrompts prompt = new SystemNotifications("This is my prompt");
        assertEquals("This is my prompt", prompt.getMessage() );
    }

    @Test
    void MultiWordWarningTest() {
        SystemWarnings prompt = new SystemWarnings("This is my prompt");
        assertEquals("This is my prompt", prompt.getMessage() );
    }


    @Test
    void SingleWordPromptTest() {
        SystemPrompts prompt = new SystemNotifications("This");
        assertEquals("This", prompt.getMessage() );
    }

    @Test
    void SingleWordWarningTest() {
        SystemWarnings prompt = new SystemWarnings("This");
        assertEquals("This", prompt.getMessage() );
    }

    @Test
    void SingleSpacePromptTest() {
        SystemPrompts prompt = new SystemNotifications(" ");
        assertEquals(" ", prompt.getMessage() );
    }

    @Test
    void SingleSpaceWarningTest() {
        SystemWarnings prompt = new SystemWarnings(" ");
        assertEquals(" ", prompt.getMessage() );
    }


    @Test
    void SingleSymbolPromptTest() {
        SystemPrompts prompt = new SystemNotifications("$");
        assertEquals("$", prompt.getMessage() );
    }

    @Test
    void SingleSymbolWarningTest() {
        SystemWarnings prompt = new SystemWarnings("$");
        assertEquals("$", prompt.getMessage() );
    }

    @Test
    void EmptyPromptTest() {
        SystemPrompts prompt = new SystemNotifications("");
        assertEquals("", prompt.getMessage() );
    }

    @Test
    void EmptyWarningTest() {
        SystemWarnings prompt = new SystemWarnings("");
        assertEquals("", prompt.getMessage() );
    }

    @Test
    void MultiSymbolPromptTest() {
        SystemPrompts prompt = new SystemNotifications("$%^&*");
        assertEquals("$%^&*", prompt.getMessage() );
    }

    @Test
    void MultiSymbolWarningTest() {
        SystemWarnings prompt = new SystemWarnings("$%^&*");
        assertEquals("$%^&*", prompt.getMessage() );
    }

    @Test
    void NumericPromptTest() {
        SystemPrompts prompt = new SystemNotifications("101");
        assertEquals("101", prompt.getMessage() );
    }

    @Test
    void NumericWarningTest() {
        SystemWarnings prompt = new SystemWarnings("101");
        assertEquals("101", prompt.getMessage() );
    }

    @Test
    void AlphaNumericPromptTest() {
        SystemPrompts prompt = new SystemNotifications("101 Dalmatians");
        assertEquals("101 Dalmatians", prompt.getMessage() );
    }

    @Test
    void AlphaNumericWarningTest() {
        SystemWarnings prompt = new SystemWarnings("101 Dalmatians");
        assertEquals("101 Dalmatians", prompt.getMessage() );
    }


    @Test
    void MixedSymbolPromptTest() {
        SystemPrompts prompt = new SystemNotifications("$$101 Dalmatians%%");
        assertEquals("$$101 Dalmatians%%", prompt.getMessage() );
    }

    @Test
    void MixedSymbolWarningTest() {
        SystemWarnings prompt = new SystemWarnings("$$101 Dalmatians%%");
        assertEquals("$$101 Dalmatians%%", prompt.getMessage() );
    }

    @Test
    void PromptInheritanceTest() {
        SystemPrompts prompt = new SystemNotifications("$$101 Dalmatians%%");
        assertEquals(SystemPrompts.class, prompt.getClass().getSuperclass() );
    }

    @Test
    void WarningInheritanceTest() {
        SystemWarnings prompt = new SystemWarnings("$$101 Dalmatians%%");
        assertEquals(SystemPrompts.class, prompt.getClass().getSuperclass() );
    }
}
