package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import database_access.NonFacultyStaffAccess;
import database_access.QueryUtilities;
import models.Course;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Textbook;
import models.Users.FacultyMember;
import models.Users.NonFacultyStaff;

public class NonFacultyStaffAccessTest {
  private NonFacultyStaffAccess nonFacultyStaffAccess;
  private QueryUtilities queryUtilities = new QueryUtilities();

  @BeforeEach
  public void setUp() {

    nonFacultyStaffAccess = NonFacultyStaffAccess.getInstance();
    nonFacultyStaffAccess.users.clear(); // Clear the list to ensure a clean state for each test

  }

  @AfterEach
  public void tearDown() throws Exception {
    nonFacultyStaffAccess.users.clear();
    nonFacultyStaffAccess.update();
  }

  @Test
  public void testSingletonInstance() {
    NonFacultyStaffAccess instance1 = NonFacultyStaffAccess.getInstance();
    NonFacultyStaffAccess instance2 = NonFacultyStaffAccess.getInstance();
    assertSame(instance1, instance2);
  }

  @Test
  public void testAddUser() throws Exception {
    NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
        new ArrayList<>(), new ArrayList<>());
    nonFacultyStaffAccess.users.add(staff);
    assertEquals(1, nonFacultyStaffAccess.users.size());
  }

  @Test
  public void testLoad() throws Exception {
    nonFacultyStaffAccess.load();
    assertEquals(0, nonFacultyStaffAccess.users.size());
  }

  @Test
  public void testUpdate() throws Exception {
    nonFacultyStaffAccess.update();
    assertEquals(0, nonFacultyStaffAccess.users.size());
  }

  @Test
  public void testUpdate2() throws Exception {
    NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
        new ArrayList<>(), new ArrayList<>());
    nonFacultyStaffAccess.users.add(staff);
    nonFacultyStaffAccess.update();
    assertEquals(0, nonFacultyStaffAccess.users.size());
  }

  @Test
  public void testLoad2() throws Exception {
    NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
        new ArrayList<>(), new ArrayList<>());
    nonFacultyStaffAccess.users.add(staff);
    nonFacultyStaffAccess.update();
    nonFacultyStaffAccess.load();
    assertEquals(1, nonFacultyStaffAccess.users.size());
  }

  @Test
  public void testLoad3() throws Exception {
    NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
        new ArrayList<>(), new ArrayList<>());
    nonFacultyStaffAccess.users.add(staff);
    nonFacultyStaffAccess.update();
    nonFacultyStaffAccess.load();
    assertEquals("id", nonFacultyStaffAccess.users.get(0).getId());
  }

  @Test
  public void testLoad4() throws Exception {
    NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
        new ArrayList<>(), new ArrayList<>());
    nonFacultyStaffAccess.users.add(staff);
    nonFacultyStaffAccess.update();
    nonFacultyStaffAccess.load();
    assertEquals("Name", nonFacultyStaffAccess.users.get(0).getName());
  }

  @Test
  public void testLoad5() throws Exception {
    NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
        new ArrayList<>(), new ArrayList<>());
    nonFacultyStaffAccess.users.add(staff);
    nonFacultyStaffAccess.update();
    nonFacultyStaffAccess.load();
    assertEquals("location", nonFacultyStaffAccess.users.get(0).getEmail());
  }

  @Test
  public void testUserinDB() throws Exception {
    NonFacultyStaff staff = new NonFacultyStaff("id", "Name", "location", "password", true, 0.0, true,
        new ArrayList<>(), new ArrayList<>());
    nonFacultyStaffAccess.users.add(staff);
    nonFacultyStaffAccess.update();
    nonFacultyStaffAccess.load();
    assertNotNull(queryUtilities.allUsers());

  }

}
