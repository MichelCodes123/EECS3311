package Randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.Payments.Debit debit0 = new models.Payments.Debit();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        controllers.LoginController loginController0 = new controllers.LoginController();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        services.newsletterstrategy.NewsletterSubscription newsletterSubscription0 = new services.newsletterstrategy.NewsletterSubscription();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        services.RequestServiceProxy requestServiceProxy0 = new services.RequestServiceProxy();
        models.Request request1 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestServiceProxy0.addRequest(request1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("hi!", "", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 1.0d);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.setDueDate(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        database_access.QueryUtilities queryUtilities0 = new database_access.QueryUtilities();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        logic.LoginUtilities loginUtilities0 = new logic.LoginUtilities();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        services.newsletterstrategy.NewsletterCancellation newsletterCancellation0 = new services.newsletterstrategy.NewsletterCancellation();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        models.Payments.Credit.pay((java.lang.Double) (-1.0d));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        models.Items.PhysicalItems.Textbook textbook0 = null;
        models.Items.DigitalTB.DigitalTB digitalTB2 = logic.DigitalTBUtilities.digitize(textbook0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(digitalTB2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        Prompts.SystemPrompts systemPrompts44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = facultyMember43.update(systemPrompts44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("");
        // The following exception was thrown during execution in test generation
        try {
            libraryManager1.removeItem("src/database/students.csv", "src/database/students.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.Payments.Debit.pay((java.lang.Double) 0.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        java.lang.String str45 = facultyMember43.getName();
        Prompts.SystemPrompts systemPrompts46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = facultyMember43.update(systemPrompts46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("hi!", "", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 1.0d);
        magazine6.setPurchasability((java.lang.Boolean) true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        services.itemstrategy.RentItem rentItem0 = new services.itemstrategy.RentItem();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str1 = logic.LoginUtilities.verifyStrongPass("src/database/students.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Password must contain at least one uppercase letter" + "'", str1.equals("Password must contain at least one uppercase letter"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("");
        // The following exception was thrown during execution in test generation
        try {
            libraryManager1.disableItem("hi!", "Password must contain at least one uppercase letter");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.increaseOverdue_charge((java.lang.Double) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        models.Payments.Credit.pay((java.lang.Double) 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        logic.UserFactory userFactory0 = new logic.UserFactory();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand9 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager8);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager8.disableItem("src/database/students.csv", "Password must contain at least one uppercase letter");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        course1.setCode((int) (byte) 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        services.SearchingService searchingService0 = new services.SearchingService();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        models.Payments.MobileWallet.pay((java.lang.Double) 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("hi!", "hi!", "hi!");
        digitalTB3.setName("");
        java.lang.String str6 = digitalTB3.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        models.Course course1 = new models.Course("");
        models.Items.PhysicalItems.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        int int4 = course1.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        models.Payments.Credit credit0 = new models.Payments.Credit();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.List<java.lang.String> strList46 = facultyMember43.getPreviousTextbooksUsed();
        facultyMember43.add_item("src/database/digital_tb.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("", "", "src/database/digital_tb.csv", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) (-1.0d));
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.setDueDate(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        models.Payments.MobileWallet mobileWallet0 = new models.Payments.MobileWallet();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.Items.PhysicalItems.Cd cd10 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager12 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand13 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd10, libraryManager12);
        models.LibraryItem.DisableItemCommand disableItemCommand14 = new models.LibraryItem.DisableItemCommand("hi!", "src/database/students.csv", libraryManager12);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager1.executeCommand((models.LibraryItem.Command) disableItemCommand14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.LoginUtilities.verifyRegistration("src/database/students.csv", "src/database/digital_tb.csv", "src/database/digital_tb.csv", "src/database/students.csv", strConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        database_access.DigitalTBAccess digitalTBAccess0 = database_access.DigitalTBAccess.getInstance();
        database_access.DigitalTBAccess digitalTBAccess1 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList2 = digitalTBAccess1.items;
        java.lang.String str3 = digitalTBAccess1.path;
        java.util.ArrayList<models.Items.Item> itemList4 = digitalTBAccess1.items;
        digitalTBAccess0.items = itemList4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "src/database/digital_tb.csv" + "'", str3.equals("src/database/digital_tb.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("", "", "src/database/digital_tb.csv", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) (-1.0d));
        java.lang.String str7 = magazine6.getName();
        java.lang.String str8 = magazine6.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.LoginUtilities.verifyRegistration("src/database/digital_tb.csv", "hi!", "Password must contain at least one uppercase letter", "hi!", strConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        logic.DigitalTBUtilities digitalTBUtilities0 = new logic.DigitalTBUtilities();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("hi!", "hi!", "", (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Double) 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("");
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList4 = libraryManager3.getItems();
        models.LibraryItem.DisableItemCommand disableItemCommand5 = new models.LibraryItem.DisableItemCommand("hi!", "", libraryManager3);
        models.LibraryItem.LibraryManager libraryManager7 = new models.LibraryItem.LibraryManager("");
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList8 = libraryManager7.getItems();
        models.Items.PhysicalItems.Cd cd16 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager18 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand19 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd16, libraryManager18);
        // The following exception was thrown during execution in test generation
        try {
            disableItemCommand5.execute(physicalItemList8, "src/database/students.csv", libraryManager18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        models.Payments.Debit.pay((java.lang.Double) 1.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        facultyMember43.add_subscription("src/database/students.csv");
        facultyMember43.setOverdue_charge((java.lang.Double) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        textbook6.setAvailability(false);
        java.lang.Double double9 = textbook6.getDollarAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9.equals(100.0d));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.removeItem("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        facultyMember43.setOverdue_charge((java.lang.Double) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        java.lang.String str5 = request3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Password must contain at least one uppercase letter" + "'", str5.equals("Password must contain at least one uppercase letter"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        models.LibraryItem.ItemIdGenerator itemIdGenerator0 = models.LibraryItem.ItemIdGenerator.getInstance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemIdGenerator0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        models.Users.Visitor visitor17 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList11, strList15);
        java.lang.Boolean boolean18 = visitor17.getCan_borrow();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18.equals(false));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        models.Payments.Debit.pay((java.lang.Double) 10.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        controllers.PaymentController paymentController0 = new controllers.PaymentController();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        models.Users.Visitor visitor49 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList43, strList47);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        models.Users.Visitor visitor67 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList61, strList65);
        models.Users.FacultyMember facultyMember68 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList47, strList61);
        facultyMember68.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList71 = facultyMember68.getRented_item_list();
        models.Users.FacultyMember facultyMember72 = new models.Users.FacultyMember("", "src/database/books.csv", "src/database/students.csv", "hi!", (java.lang.Boolean) false, (java.lang.Double) 0.0d, (java.lang.Boolean) true, strList22, strList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Prompts.SystemNotifications systemNotifications1 = new Prompts.SystemNotifications("src/database/books.csv");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cd6.setDueDate(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        models.LibraryManagementTeam.LibraryManagementTeam.validate();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("hi!", "hi!", "hi!");
        digitalTB3.courseName = "Password must contain at least one uppercase letter";
        java.lang.String str6 = digitalTB3.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Password must contain at least one uppercase letter" + "'", str6.equals("Password must contain at least one uppercase letter"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        services.OverdueService overdueService0 = new services.OverdueService();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        // The following exception was thrown during execution in test generation
        try {
            libraryManager1.enableItem("src/database/digital_tb.csv", "src/database/students.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand9 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager8);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager8.enableItem("Password must contain at least one uppercase letter", "src/database/students.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setBookId("");
        request3.setBookId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("src/database/books.csv", "src/database/books.csv", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) (-1.0d));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        models.Users.Visitor visitor23 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList17, strList21);
        request3.setRequester((models.Users.User) visitor23);
        java.lang.String str25 = request3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Password must contain at least one uppercase letter" + "'", str25.equals("Password must contain at least one uppercase letter"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        models.Course course1 = new models.Course("src/database/students.csv");
        java.lang.String str2 = course1.getName();
        int int3 = course1.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/students.csv" + "'", str2.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.lang.String str46 = facultyMember43.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setBookId("src/database/digital_tb.csv");
        java.lang.Class<?> wildcardClass8 = request3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        facultyMember43.add_subscription("src/database/books.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        models.Items.Newsletter newsletter3 = new models.Items.Newsletter("", "src/database/students.csv", "");
        java.lang.String str4 = newsletter3.getLink();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand9 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager8);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager8.removeItem("Password must contain at least one uppercase letter", "src/database/books.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        java.lang.String str47 = facultyMember43.getPassword();
        facultyMember43.setCan_borrow((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        models.Items.DigitalTB.DigitalTB digitalTB2 = new models.Items.DigitalTB.DigitalTB("src/database/digital_tb.csv", "src/database/books.csv");
        java.lang.String str3 = digitalTB2.courseName;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        models.Items.DigitalTB.DigitalTB digitalTB59 = logic.DigitalTBUtilities.digitize(textbook8, "src/database/students.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTB59);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand9 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager8);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager8.removeItem("src/database/books.csv", "src/database/digital_tb.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        services.Payments.PaymentService paymentService0 = new services.Payments.PaymentService();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        models.Users.Visitor visitor27 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList21, strList25);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        models.Users.Visitor visitor45 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList39, strList43);
        models.Users.FacultyMember facultyMember46 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList25, strList39);
        java.lang.String str47 = facultyMember46.getName();
        facultyMember46.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember46.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        models.Users.Visitor visitor69 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList63, strList67);
        facultyMember46.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList63);
        java.lang.String str71 = facultyMember46.getEmail();
        facultyMember46.setOverdue_charge((java.lang.Double) 100.0d);
        paymentService0.overduePay((java.lang.Double) (-1.0d), "src/database/books.csv", (models.Users.User) facultyMember46);
        java.lang.String str75 = facultyMember46.getPassword();
        java.lang.String str76 = facultyMember46.getLastNotification();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        database_access.DigitalTBAccess digitalTBAccess0 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList1 = digitalTBAccess0.items;
        java.util.ArrayList<models.Items.Item> itemList2 = digitalTBAccess0.items;
        java.util.ArrayList<models.Items.Item> itemList3 = digitalTBAccess0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        java.lang.Boolean boolean58 = textbook8.getPurchasability();
        java.lang.Class<?> wildcardClass59 = textbook8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("src/database/digital_tb.csv", "src/database/students.csv", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 10.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        models.Users.Visitor visitor66 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList60, strList64);
        facultyMember43.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList60);
        facultyMember43.add_subscription("src/database/books.csv");
        facultyMember43.addCourse("src/database/books.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        database_access.StudentAccess studentAccess0 = database_access.StudentAccess.getInstance();
        java.lang.String str1 = studentAccess0.path;
        java.util.ArrayList<models.Users.User> userList2 = studentAccess0.users;
        java.lang.String str3 = studentAccess0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        database_access.DigitalTBAccess digitalTBAccess0 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList1 = digitalTBAccess0.items;
        java.lang.String str2 = digitalTBAccess0.path;
        java.util.ArrayList<models.Items.Item> itemList3 = digitalTBAccess0.items;
        digitalTBAccess0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/books.csv" + "'", str2.equals("src/database/books.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand9 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager8);
        java.lang.Double double10 = cd6.getDollarAmount();
        models.LibraryItem.LibraryManager libraryManager14 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand15 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager14);
        models.LibraryItem.AddItemCommand addItemCommand16 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager14);
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cd6.setDueDate(date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10.equals(0.0d));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        Prompts.SystemWarnings systemWarnings46 = new Prompts.SystemWarnings("hi!");
        java.lang.String str47 = facultyMember43.update((Prompts.SystemPrompts) systemWarnings46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Faculty Member Notification: hi!" + "'", str47.equals("Faculty Member Notification: hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.removeItem("hi!");
        java.lang.String str3 = bookAccess0.path;
        bookAccess0.path = "src/database/students.csv";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "src/database/students.csv" + "'", str3.equals("src/database/students.csv"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("src/database/students.csv", "", "");
        java.lang.String str4 = digitalTB3.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("hi!", "hi!", "hi!");
        java.lang.String str4 = digitalTB3.courseName;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        models.Items.PhysicalItems.Cd cd64 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager66 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand67 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd64, libraryManager66);
        models.LibraryItem.UpdateCommand updateCommand68 = new models.LibraryItem.UpdateCommand((models.Items.PhysicalItems.PhysicalItem) textbook8, libraryManager66);
        models.Items.PhysicalItems.PhysicalItem physicalItem69 = updateCommand68.getUpdatedItem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem69);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        models.Users.Visitor visitor66 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList60, strList64);
        facultyMember43.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList60);
        java.lang.Class<?> wildcardClass68 = facultyMember43.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        models.Items.PhysicalItems.Cd cd8 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager10 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand11 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd8, libraryManager10);
        models.LibraryItem.DisableItemCommand disableItemCommand12 = new models.LibraryItem.DisableItemCommand("hi!", "src/database/students.csv", libraryManager10);
        database_access.BookAccess bookAccess13 = database_access.BookAccess.getInstance();
        bookAccess13.removeItem("hi!");
        java.lang.String str16 = bookAccess13.path;
        models.Items.PhysicalItems.Textbook textbook23 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        models.Course course25 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook32 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course25.addTextbook(textbook32);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        models.Users.Visitor visitor58 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList52, strList56);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        models.Users.Visitor visitor76 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList70, strList74);
        models.Users.FacultyMember facultyMember77 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList56, strList70);
        facultyMember77.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList80 = facultyMember77.getRented_item_list();
        textbook32.addObserver((models.TextbookObserver.TextbookObserver) facultyMember77);
        models.Items.PhysicalItems.PhysicalItem[] physicalItemArray82 = new models.Items.PhysicalItems.PhysicalItem[] { textbook23, textbook32 };
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList83 = new java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<models.Items.PhysicalItems.PhysicalItem>) physicalItemList83, physicalItemArray82);
        bookAccess13.items = physicalItemList83;
        models.LibraryItem.LibraryManager libraryManager90 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.DisableItemCommand disableItemCommand91 = new models.LibraryItem.DisableItemCommand("hi!", "hi!", libraryManager90);
        // The following exception was thrown during execution in test generation
        try {
            disableItemCommand12.execute((java.util.List<models.Items.PhysicalItems.PhysicalItem>) physicalItemList83, "src/database/digital_tb.csv", libraryManager90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "src/database/students.csv" + "'", str16.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        java.lang.String str47 = facultyMember43.getPassword();
        facultyMember43.addCourse("Password must contain at least one uppercase letter");
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        models.Users.Visitor visitor74 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList68, strList72);
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        models.Users.Visitor visitor92 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList86, strList90);
        models.Users.FacultyMember facultyMember93 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList72, strList86);
        java.util.ArrayList<java.lang.String> strList94 = facultyMember93.getSubscribed_newsletters();
        facultyMember43.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str1 = logic.LoginUtilities.verifyStrongPass("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Password must contain at least one uppercase letter" + "'", str1.equals("Password must contain at least one uppercase letter"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        services.Payments.PaymentService paymentService0 = new services.Payments.PaymentService();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        models.Users.Visitor visitor27 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList21, strList25);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        models.Users.Visitor visitor45 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList39, strList43);
        models.Users.FacultyMember facultyMember46 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList25, strList39);
        java.lang.String str47 = facultyMember46.getName();
        facultyMember46.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember46.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        models.Users.Visitor visitor69 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList63, strList67);
        facultyMember46.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList63);
        java.lang.String str71 = facultyMember46.getEmail();
        facultyMember46.setOverdue_charge((java.lang.Double) 100.0d);
        paymentService0.overduePay((java.lang.Double) (-1.0d), "src/database/books.csv", (models.Users.User) facultyMember46);
        java.lang.String str75 = facultyMember46.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("Password must contain at least one uppercase letter", "src/database/students.csv", "", (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Double) 0.0d);
        book6.setPurchasability((java.lang.Boolean) true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        java.lang.Double double47 = facultyMember43.getOverdue_charge();
        java.util.ArrayList<java.lang.String> strList48 = facultyMember43.getSubscribed_newsletters();
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("hi!", "", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 1.0d);
        java.lang.String str7 = magazine6.getId();
        java.lang.Boolean boolean8 = magazine6.getPurchasability();
        java.lang.Boolean boolean9 = magazine6.getPurchasability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        models.Request request3 = new models.Request("src/database/digital_tb.csv", "", "");
        java.lang.String str4 = request3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        models.Request request3 = new models.Request("Faculty Member Notification: hi!", "src/database/digital_tb.csv", "src/database/students.csv");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager10 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.DisableItemCommand disableItemCommand11 = new models.LibraryItem.DisableItemCommand("hi!", "hi!", libraryManager10);
        models.LibraryItem.UpdateCommand updateCommand12 = new models.LibraryItem.UpdateCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setType("src/database/digital_tb.csv");
        models.Request request11 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str12 = request11.getId();
        models.Users.User user13 = request11.getRequester();
        request11.setType("src/database/digital_tb.csv");
        int int16 = request3.compareTo(request11);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        models.Users.Visitor visitor41 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList35, strList39);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        models.Users.Visitor visitor59 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList53, strList57);
        models.Users.FacultyMember facultyMember60 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList39, strList53);
        request11.setRequester((models.Users.User) facultyMember60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Password must contain at least one uppercase letter" + "'", str12.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        database_access.StudentAccess studentAccess0 = database_access.StudentAccess.getInstance();
        java.lang.String str1 = studentAccess0.path;
        java.util.ArrayList<models.Users.User> userList2 = studentAccess0.users;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess0.users;
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess4 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess5 = database_access.StudentAccess.getInstance();
        java.lang.String str6 = studentAccess5.path;
        java.util.ArrayList<models.Users.User> userList7 = studentAccess5.users;
        nonFacultyStaffAccess4.users = userList7;
        studentAccess0.users = userList7;
        studentAccess0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        database_access.StudentAccess studentAccess0 = database_access.StudentAccess.getInstance();
        java.util.ArrayList<models.Users.User> userList1 = studentAccess0.users;
        java.util.ArrayList<models.Users.User> userList2 = null;
        studentAccess0.users = userList2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        models.Course course1 = new models.Course("src/database/students.csv");
        java.lang.String str2 = course1.getName();
        course1.setCode((-1));
        int int5 = course1.getCode();
        int int6 = course1.getCode();
        java.lang.String str7 = course1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/students.csv" + "'", str2.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "src/database/students.csv" + "'", str7.equals("src/database/students.csv"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        java.lang.String str45 = facultyMember43.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        models.LibraryItem.LibraryManager libraryManager5 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand6 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager5);
        models.LibraryItem.RemoveItemCommand removeItemCommand7 = new models.LibraryItem.RemoveItemCommand("", "src/database/visitor.csv", libraryManager5);
        java.lang.String str8 = removeItemCommand7.getItemId();
        java.lang.String str9 = removeItemCommand7.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "src/database/visitor.csv" + "'", str9.equals("src/database/visitor.csv"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.LoginUtilities.verifyRegistration("Password must contain at least one uppercase letter", "src/database/students.csv", "src/database/students.csv", "src/database/students.csv", strConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        facultyMember43.add_subscription("src/database/students.csv");
        java.lang.Boolean boolean47 = facultyMember43.getIs_registered();
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47.equals(false));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setBookId("src/database/digital_tb.csv");
        models.Users.User user8 = request3.getRequester();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("Faculty Member Notification: hi!", "src/database/books.csv", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 0.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("src/database/students.csv", "", "src/database/digital_tb.csv");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        java.lang.String str47 = facultyMember43.getLastNotification();
        java.util.List<java.lang.String> strList48 = facultyMember43.getPreviousTextbooksUsed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.DisableItemCommand disableItemCommand4 = new models.LibraryItem.DisableItemCommand("hi!", "hi!", libraryManager3);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager3.enableItem("src/database/students.csv", "src/database/visitor.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        services.Payments.PaymentService paymentService0 = new services.Payments.PaymentService();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        models.Users.Visitor visitor27 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList21, strList25);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        models.Users.Visitor visitor45 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList39, strList43);
        models.Users.FacultyMember facultyMember46 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList25, strList39);
        java.lang.String str47 = facultyMember46.getName();
        java.lang.String str48 = facultyMember46.getName();
        paymentService0.overduePay((java.lang.Double) (-1.0d), "hi!", (models.Users.User) facultyMember46);
        paymentService0.discountPay("src/database/digital_tb.csv", (java.lang.Double) 100.0d, "hi!");
        paymentService0.pOption("src/database/digital_tb.csv", (java.lang.Double) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setType("src/database/digital_tb.csv");
        models.Request request11 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str12 = request11.getId();
        models.Users.User user13 = request11.getRequester();
        request11.setType("src/database/digital_tb.csv");
        int int16 = request3.compareTo(request11);
        request11.setBookId("src/database/students.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Password must contain at least one uppercase letter" + "'", str12.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("src/database/visitor.csv", "src/database/visitor.csv", "src/database/digital_tb.csv", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("src/database/students.csv", "", "");
        digitalTB3.courseName = "";
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        java.lang.String str47 = facultyMember43.getPassword();
        facultyMember43.add_item("src/database/books.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        database_access.FacultyMemberAccess facultyMemberAccess0 = database_access.FacultyMemberAccess.getInstance();
        database_access.StudentAccess studentAccess1 = database_access.StudentAccess.getInstance();
        java.lang.String str2 = studentAccess1.path;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess1.users;
        facultyMemberAccess0.users = userList3;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(facultyMemberAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        java.lang.Boolean boolean7 = textbook6.getPurchasability();
        java.lang.String str8 = textbook6.getId();
        java.util.List<models.TextbookObserver.TextbookObserver> textbookObserverList9 = textbook6.getFacultyObservers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookObserverList9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.LoginUtilities.verifyRegistration("hi!", "src/database/visitor.csv", "hi!", "Password must contain at least one uppercase letter", strConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        models.Course course1 = new models.Course("");
        models.Items.PhysicalItems.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.lang.String str4 = course1.getName();
        int int5 = course1.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        models.Request request3 = new models.Request("src/database/digital_tb.csv", "", "");
        models.Request request7 = new models.Request("hi!", "src/database/digital_tb.csv", "hi!");
        int int8 = request3.compareTo(request7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("src/database/students.csv", "src/database/visitor.csv", "hi!", (java.lang.Boolean) false, (java.lang.Long) 100L, (java.lang.Double) 100.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        models.Items.DigitalTB.DigitalTB digitalTB2 = new models.Items.DigitalTB.DigitalTB("Password must contain at least one uppercase letter", "src/database/digital_tb.csv");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        textbook8.setAvailability(false);
        boolean boolean12 = textbook8.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("");
        // The following exception was thrown during execution in test generation
        try {
            libraryManager1.disableItem("hi!", "Faculty Member Notification: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        database_access.NewsletterAccess newsletterAccess0 = database_access.NewsletterAccess.getInstance();
        java.util.ArrayList<models.Items.Newsletter> newsletterList1 = null;
        newsletterAccess0.items = newsletterList1;
        java.util.ArrayList<models.Items.Newsletter> newsletterList3 = newsletterAccess0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(newsletterList3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.LoginUtilities.verifyRegistration("Faculty Member Notification: hi!", "src/database/visitor.csv", "hi!", "Password must contain at least one uppercase letter", strConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        services.RequestBook requestBook0 = new services.RequestBook();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setType("src/database/digital_tb.csv");
        java.lang.String str8 = request3.getBookId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "src/database/students.csv" + "'", str8.equals("src/database/students.csv"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        services.Payments.PaymentService paymentService0 = new services.Payments.PaymentService();
        paymentService0.pOption("", (java.lang.Double) 100.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        java.lang.Boolean boolean45 = facultyMember43.getCan_borrow();
        java.util.List<java.lang.String> strList46 = facultyMember43.getTeachingCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand9 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager8);
        java.lang.Double double10 = cd6.getDollarAmount();
        models.LibraryItem.LibraryManager libraryManager14 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand15 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager14);
        models.LibraryItem.AddItemCommand addItemCommand16 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager14);
        models.Items.PhysicalItems.PhysicalItem physicalItem17 = addItemCommand16.getItem();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItem17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("Password must contain at least one uppercase letter", "Faculty Member Notification: hi!", "Password must contain at least one uppercase letter");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("");
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList4 = libraryManager3.getItems();
        models.LibraryItem.DisableItemCommand disableItemCommand5 = new models.LibraryItem.DisableItemCommand("hi!", "", libraryManager3);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager3.removeItem("Password must contain at least one uppercase letter", "src/database/digital_tb.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        facultyMember43.add_subscription("src/database/students.csv");
        java.lang.String str47 = facultyMember43.getPassword();
        java.lang.Boolean boolean48 = facultyMember43.getCan_borrow();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48.equals(false));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess0 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess1 = database_access.StudentAccess.getInstance();
        java.lang.String str2 = studentAccess1.path;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess1.users;
        nonFacultyStaffAccess0.users = userList3;
        nonFacultyStaffAccess0.path = "Password must contain at least one uppercase letter";
        java.util.ArrayList<models.Users.User> userList7 = nonFacultyStaffAccess0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        java.lang.String str5 = request3.getBookId();
        request3.setPriority((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "src/database/students.csv" + "'", str5.equals("src/database/students.csv"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.path = "src/database/students.csv";
        bookAccess0.enableItem("Password must contain at least one uppercase letter");
        bookAccess0.disableItem("Password must contain at least one uppercase letter");
        bookAccess0.removeItem("hi!");
        database_access.CdAccess cdAccess9 = database_access.CdAccess.getInstance();
        database_access.BookAccess bookAccess10 = database_access.BookAccess.getInstance();
        bookAccess10.removeItem("hi!");
        java.lang.String str13 = bookAccess10.path;
        models.Items.PhysicalItems.Textbook textbook20 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        models.Course course22 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook29 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course22.addTextbook(textbook29);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        models.Users.Visitor visitor55 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList49, strList53);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        models.Users.Visitor visitor73 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList67, strList71);
        models.Users.FacultyMember facultyMember74 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList53, strList67);
        facultyMember74.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList77 = facultyMember74.getRented_item_list();
        textbook29.addObserver((models.TextbookObserver.TextbookObserver) facultyMember74);
        models.Items.PhysicalItems.PhysicalItem[] physicalItemArray79 = new models.Items.PhysicalItems.PhysicalItem[] { textbook20, textbook29 };
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList80 = new java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<models.Items.PhysicalItems.PhysicalItem>) physicalItemList80, physicalItemArray79);
        bookAccess10.items = physicalItemList80;
        cdAccess9.items = physicalItemList80;
        bookAccess0.items = physicalItemList80;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "src/database/students.csv" + "'", str13.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        database_access.VisitorAccess visitorAccess0 = database_access.VisitorAccess.getInstance();
        java.util.ArrayList<models.Users.User> userList1 = visitorAccess0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(visitorAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("Faculty Member Notification: hi!", "src/database/visitor.csv", "", (java.lang.Boolean) false, (java.lang.Long) 100L, (java.lang.Double) 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand4 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager3);
        database_access.CdAccess cdAccess5 = database_access.CdAccess.getInstance();
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList6 = cdAccess5.items;
        models.LibraryItem.LibraryManager libraryManager11 = new models.LibraryItem.LibraryManager("");
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList12 = libraryManager11.getItems();
        models.LibraryItem.DisableItemCommand disableItemCommand13 = new models.LibraryItem.DisableItemCommand("hi!", "", libraryManager11);
        // The following exception was thrown during execution in test generation
        try {
            enableItemCommand4.execute((java.util.List<models.Items.PhysicalItems.PhysicalItem>) physicalItemList6, "Faculty Member Notification: hi!", libraryManager11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        models.Users.Visitor visitor72 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList66, strList70);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        models.Users.Visitor visitor90 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList84, strList88);
        models.Users.FacultyMember facultyMember91 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList70, strList84);
        facultyMember91.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList94 = facultyMember91.getRented_item_list();
        java.lang.Double double95 = facultyMember91.getOverdue_charge();
        java.util.ArrayList<java.lang.String> strList96 = facultyMember91.getSubscribed_newsletters();
        facultyMember43.setTeachingCourses((java.util.List<java.lang.String>) strList96);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList96);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        database_access.MagazineAccess magazineAccess0 = database_access.MagazineAccess.getInstance();
        magazineAccess0.path = "src/database/visitor.csv";
        magazineAccess0.enableItem("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazineAccess0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        models.Course course1 = new models.Course("hi!");
        int int2 = course1.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Prompts.SystemWarnings systemWarnings1 = new Prompts.SystemWarnings("");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        database_access.DigitalTBAccess digitalTBAccess0 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList1 = digitalTBAccess0.items;
        java.lang.String str2 = digitalTBAccess0.path;
        java.util.ArrayList<models.Items.Item> itemList3 = digitalTBAccess0.items;
        digitalTBAccess0.path = "src/database/books.csv";
        database_access.DigitalTBAccess digitalTBAccess6 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList7 = digitalTBAccess6.items;
        digitalTBAccess0.items = itemList7;
        java.lang.String str9 = digitalTBAccess0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/books.csv" + "'", str2.equals("src/database/books.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "src/database/books.csv" + "'", str9.equals("src/database/books.csv"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("hi!", "", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 1.0d);
        java.lang.String str7 = magazine6.getId();
        java.lang.Long long8 = magazine6.getDueDate();
        java.lang.Boolean boolean9 = magazine6.getPurchasability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.Course course1 = new models.Course("src/database/students.csv");
        java.lang.String str2 = course1.getName();
        course1.setCode((-1));
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/students.csv" + "'", str2.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "src/database/students.csv" + "'", str6.equals("src/database/students.csv"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        models.Request request3 = new models.Request("src/database/books.csv", "src/database/digital_tb.csv", "src/database/books.csv");
        request3.setType("src/database/visitor.csv");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        database_access.NewsletterAccess newsletterAccess0 = database_access.NewsletterAccess.getInstance();
        newsletterAccess0.path = "hi!";
        java.util.ArrayList<models.Items.Newsletter> newsletterList3 = newsletterAccess0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterAccess0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(newsletterList3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        models.Course course2 = new models.Course("hi!");
        models.Course course4 = new models.Course("src/database/students.csv");
        int int5 = course4.getCode();
        models.Course course8 = new models.Course("src/database/students.csv");
        java.lang.String str9 = course8.getName();
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList10 = course8.getTextbooks();
        models.Course course11 = new models.Course("Faculty Member Notification: hi!", textbookList10);
        course4.setTextbook(textbookList10);
        course2.setTextbook(textbookList10);
        models.Course course14 = new models.Course("", textbookList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "src/database/students.csv" + "'", str9.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        models.Users.Visitor visitor49 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList43, strList47);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        models.Users.Visitor visitor67 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList61, strList65);
        models.Users.FacultyMember facultyMember68 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList47, strList61);
        models.Users.FacultyMember facultyMember69 = new models.Users.FacultyMember("", "src/database/students.csv", "hi!", "src/database/digital_tb.csv", (java.lang.Boolean) true, (java.lang.Double) 100.0d, (java.lang.Boolean) false, strList18, strList61);
        facultyMember69.increaseOverdue_charge((java.lang.Double) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setBookId("src/database/digital_tb.csv");
        request3.setPriority((int) (short) 0);
        request3.setBookId("src/database/digital_tb.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        models.Items.PhysicalItems.Book book6 = new models.Items.PhysicalItems.Book("src/database/books.csv", "Password must contain at least one uppercase letter", "Faculty Member Notification: hi!", (java.lang.Boolean) false, (java.lang.Long) 1L, (java.lang.Double) 100.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Prompts.SystemNotifications systemNotifications1 = new Prompts.SystemNotifications("");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("hi!", "src/database/students.csv", "src/database/books.csv");
        java.lang.String str4 = digitalTB3.courseName;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "src/database/books.csv" + "'", str4.equals("src/database/books.csv"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        textbook6.setAvailability(false);
        java.util.List<models.LibraryManagementTeam.LibraryManagementTeamObserver> libraryManagementTeamObserverList9 = textbook6.getLibraryObservers();
        models.Items.DigitalTB.DigitalTB digitalTB11 = logic.DigitalTBUtilities.digitize(textbook6, "src/database/students.csv");
        java.lang.String str12 = digitalTB11.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(libraryManagementTeamObserverList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTB11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        database_access.MagazineAccess magazineAccess0 = database_access.MagazineAccess.getInstance();
        magazineAccess0.removeItem("src/database/visitor.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazineAccess0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        services.RequestService requestService0 = new services.RequestService();
        models.Request request4 = new models.Request("hi!", "src/database/digital_tb.csv", "hi!");
        request4.setType("Faculty Member Notification: hi!");
        requestService0.addRequest(request4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("hi!", "src/database/books.csv", "", (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Double) 100.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess0 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess1 = database_access.StudentAccess.getInstance();
        java.lang.String str2 = studentAccess1.path;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess1.users;
        nonFacultyStaffAccess0.users = userList3;
        nonFacultyStaffAccess0.path = "Password must contain at least one uppercase letter";
        database_access.StudentAccess studentAccess7 = database_access.StudentAccess.getInstance();
        java.lang.String str8 = studentAccess7.path;
        java.util.ArrayList<models.Users.User> userList9 = studentAccess7.users;
        nonFacultyStaffAccess0.users = userList9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        models.Users.Visitor visitor31 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList25, strList29);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        models.Users.Visitor visitor49 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList43, strList47);
        models.Users.FacultyMember facultyMember50 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList29, strList43);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        models.Users.Visitor visitor75 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList69, strList73);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        models.Users.Visitor visitor93 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList87, strList91);
        models.Users.FacultyMember facultyMember94 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList73, strList87);
        models.Users.FacultyMember facultyMember95 = new models.Users.FacultyMember("Password must contain at least one uppercase letter", "Faculty Member Notification: hi!", "src/database/books.csv", "src/database/books.csv", (java.lang.Boolean) false, (java.lang.Double) 1.0d, (java.lang.Boolean) false, strList29, strList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("hi!", "", "", (java.lang.Boolean) true, (java.lang.Long) (-1L), (java.lang.Double) 1.0d);
        java.lang.String str7 = magazine6.getId();
        java.lang.Long long8 = magazine6.getDueDate();
        java.lang.Double double9 = magazine6.getDollarAmount();
        java.lang.Double double10 = magazine6.getDollarAmount();
        java.lang.Double double11 = magazine6.getDollarAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11.equals(1.0d));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Prompts.SystemWarnings systemWarnings1 = new Prompts.SystemWarnings("src/database/books.csv");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        models.Course course1 = new models.Course("");
        models.Course course3 = new models.Course("src/database/students.csv");
        java.lang.String str4 = course3.getName();
        course3.setCode((-1));
        int int7 = course3.getCode();
        models.Course course9 = new models.Course("src/database/students.csv");
        java.lang.String str10 = course9.getName();
        course9.setCode((-1));
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList13 = course9.getTextbooks();
        course3.setTextbook(textbookList13);
        models.Course course16 = new models.Course("src/database/students.csv");
        java.lang.String str17 = course16.getName();
        course16.setCode((-1));
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList20 = course16.getTextbooks();
        course3.setTextbook(textbookList20);
        course1.setTextbook(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "src/database/students.csv" + "'", str4.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "src/database/students.csv" + "'", str10.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "src/database/students.csv" + "'", str17.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand4 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager3);
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList5 = libraryManager3.getItems();
        models.Items.PhysicalItems.Cd cd14 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager16 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand17 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd14, libraryManager16);
        models.LibraryItem.DisableItemCommand disableItemCommand18 = new models.LibraryItem.DisableItemCommand("hi!", "src/database/students.csv", libraryManager16);
        java.lang.String str19 = disableItemCommand18.getItemId();
        java.lang.String str20 = disableItemCommand18.getItemId();
        // The following exception was thrown during execution in test generation
        try {
            libraryManager3.executeCommand((models.LibraryItem.Command) disableItemCommand18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getType();
        java.lang.String str5 = request3.getId();
        request3.setPriority((-1));
        java.lang.String str8 = request3.getBookId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Password must contain at least one uppercase letter" + "'", str5.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "src/database/students.csv" + "'", str8.equals("src/database/students.csv"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        models.Course course1 = new models.Course("src/database/students.csv");
        int int2 = course1.getCode();
        models.Course course5 = new models.Course("src/database/students.csv");
        java.lang.String str6 = course5.getName();
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList7 = course5.getTextbooks();
        models.Course course8 = new models.Course("Faculty Member Notification: hi!", textbookList7);
        course1.setTextbook(textbookList7);
        models.Course course11 = new models.Course("src/database/students.csv");
        java.lang.String str12 = course11.getName();
        course11.setCode((-1));
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList15 = course11.getTextbooks();
        course1.setTextbook(textbookList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "src/database/students.csv" + "'", str6.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "src/database/students.csv" + "'", str12.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("Password must contain at least one uppercase letter", "src/database/digital_tb.csv", "src/database/books.csv");
        java.lang.String str4 = digitalTB3.courseName;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "src/database/books.csv" + "'", str4.equals("src/database/books.csv"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        java.lang.Double double47 = facultyMember43.getOverdue_charge();
        facultyMember43.addTextbookUsed("src/database/books.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47.equals((-1.0d)));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Prompts.SystemWarnings systemWarnings1 = new Prompts.SystemWarnings("Password must contain at least one uppercase letter");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        database_access.CdAccess cdAccess0 = database_access.CdAccess.getInstance();
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList1 = cdAccess0.items;
        database_access.BookAccess bookAccess2 = database_access.BookAccess.getInstance();
        bookAccess2.removeItem("hi!");
        java.lang.String str5 = bookAccess2.path;
        models.Items.PhysicalItems.Textbook textbook12 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        models.Course course14 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook21 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course14.addTextbook(textbook21);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        models.Users.Visitor visitor47 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList41, strList45);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        models.Users.Visitor visitor65 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList59, strList63);
        models.Users.FacultyMember facultyMember66 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList45, strList59);
        facultyMember66.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList69 = facultyMember66.getRented_item_list();
        textbook21.addObserver((models.TextbookObserver.TextbookObserver) facultyMember66);
        models.Items.PhysicalItems.PhysicalItem[] physicalItemArray71 = new models.Items.PhysicalItems.PhysicalItem[] { textbook12, textbook21 };
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList72 = new java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<models.Items.PhysicalItems.PhysicalItem>) physicalItemList72, physicalItemArray71);
        bookAccess2.items = physicalItemList72;
        cdAccess0.items = physicalItemList72;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "src/database/students.csv" + "'", str5.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("", "Password must contain at least one uppercase letter", "Faculty Member Notification: hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("hi!", "src/database/books.csv", "Password must contain at least one uppercase letter", (java.lang.Boolean) true, (java.lang.Long) 10L, (java.lang.Double) 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        models.Request request3 = new models.Request("hi!", "src/database/digital_tb.csv", "hi!");
        java.lang.String str4 = request3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "src/database/digital_tb.csv" + "'", str4.equals("src/database/digital_tb.csv"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Prompts.SystemWarnings systemWarnings1 = new Prompts.SystemWarnings("src/database/visitor.csv");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        models.Users.Visitor visitor31 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList25, strList29);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        models.Users.Visitor visitor49 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList43, strList47);
        models.Users.FacultyMember facultyMember50 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList29, strList43);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        models.Users.Visitor visitor75 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList69, strList73);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        models.Users.Visitor visitor93 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList87, strList91);
        models.Users.FacultyMember facultyMember94 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList73, strList87);
        models.Users.NonFacultyStaff nonFacultyStaff95 = new models.Users.NonFacultyStaff("src/database/books.csv", "Faculty Member Notification: hi!", "src/database/digital_tb.csv", "src/database/students.csv", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) true, strList43, strList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        models.Items.DigitalTB.DigitalTB digitalTB8 = logic.DigitalTBUtilities.digitize(textbook6, "Faculty Member Notification: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTB8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        database_access.NewsletterAccess newsletterAccess0 = database_access.NewsletterAccess.getInstance();
        models.Items.Newsletter newsletter4 = new models.Items.Newsletter("", "src/database/students.csv", "");
        java.lang.String str5 = newsletter4.getLink();
        models.Items.Newsletter[] newsletterArray6 = new models.Items.Newsletter[] { newsletter4 };
        java.util.ArrayList<models.Items.Newsletter> newsletterList7 = new java.util.ArrayList<models.Items.Newsletter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<models.Items.Newsletter>) newsletterList7, newsletterArray6);
        newsletterAccess0.items = newsletterList7;
        java.lang.String str10 = newsletterAccess0.path;
        java.util.ArrayList<models.Items.Newsletter> newsletterList11 = newsletterAccess0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        java.lang.String str5 = request3.getBookId();
        request3.setPriority((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "src/database/students.csv" + "'", str5.equals("src/database/students.csv"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        database_access.VisitorAccess visitorAccess0 = database_access.VisitorAccess.getInstance();
        java.lang.String str1 = visitorAccess0.path;
        java.lang.String str2 = visitorAccess0.path;
        visitorAccess0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(visitorAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "src/database/visitor.csv" + "'", str1.equals("src/database/visitor.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/visitor.csv" + "'", str2.equals("src/database/visitor.csv"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        database_access.StudentAccess studentAccess0 = database_access.StudentAccess.getInstance();
        java.util.ArrayList<models.Users.User> userList1 = studentAccess0.users;
        java.lang.String str2 = studentAccess0.path;
        java.lang.String str3 = studentAccess0.path;
        java.util.ArrayList<models.Users.User> userList4 = studentAccess0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.lang.String str46 = facultyMember43.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        models.Request request3 = new models.Request("Faculty Member Notification: hi!", "hi!", "src/database/students.csv");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        facultyMember43.add_subscription("src/database/students.csv");
        facultyMember43.add_item("src/database/visitor.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("Password must contain at least one uppercase letter", "src/database/digital_tb.csv", "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.Items.PhysicalItems.Cd cd8 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager10 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand11 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd8, libraryManager10);
        models.LibraryItem.DisableItemCommand disableItemCommand12 = new models.LibraryItem.DisableItemCommand("hi!", "src/database/students.csv", libraryManager10);
        java.lang.String str13 = disableItemCommand12.getItemId();
        java.lang.String str14 = disableItemCommand12.getItemId();
        java.lang.String str15 = disableItemCommand12.getItemType();
        java.lang.String str16 = disableItemCommand12.getItemId();
        java.lang.String str17 = disableItemCommand12.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "src/database/students.csv" + "'", str15.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "src/database/students.csv" + "'", str17.equals("src/database/students.csv"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        textbook6.setAvailability(false);
        boolean boolean9 = textbook6.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        models.LibraryManagementTeam.LibraryManagementTeam libraryManagementTeam0 = new models.LibraryManagementTeam.LibraryManagementTeam();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        models.Users.Visitor visitor25 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList19, strList23);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        models.Users.Visitor visitor43 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList37, strList41);
        models.Users.FacultyMember facultyMember44 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList23, strList37);
        java.lang.String str45 = facultyMember44.getName();
        facultyMember44.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember44.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        models.Users.Visitor visitor67 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList61, strList65);
        facultyMember44.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList61);
        facultyMember44.increaseOverdue_charge((java.lang.Double) 10.0d);
        Prompts.SystemNotifications systemNotifications72 = new Prompts.SystemNotifications("hi!");
        java.lang.String str73 = facultyMember44.update((Prompts.SystemPrompts) systemNotifications72);
        java.lang.String str74 = libraryManagementTeam0.update((Prompts.SystemPrompts) systemNotifications72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Faculty Member Notification: hi!" + "'", str73.equals("Faculty Member Notification: hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Library Management Team Notification: hi!" + "'", str74.equals("Library Management Team Notification: hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        java.util.Date date58 = null;
        // The following exception was thrown during execution in test generation
        try {
            textbook8.setDueDate(date58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        database_access.MagazineAccess magazineAccess0 = database_access.MagazineAccess.getInstance();
        magazineAccess0.path = "src/database/visitor.csv";
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList3 = magazineAccess0.items;
        magazineAccess0.disableItem("");
        magazineAccess0.enableItem("Password must contain at least one uppercase letter");
        magazineAccess0.enableItem("src/database/books.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazineAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        models.Course course1 = new models.Course("Password must contain at least one uppercase letter");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand4 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager3);
        java.lang.String str5 = enableItemCommand4.getItemId();
        java.lang.String str6 = enableItemCommand4.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "src/database/students.csv" + "'", str5.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "src/database/books.csv" + "'", str6.equals("src/database/books.csv"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        database_access.DigitalTBAccess digitalTBAccess0 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList1 = digitalTBAccess0.items;
        database_access.DigitalTBAccess digitalTBAccess2 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList3 = digitalTBAccess2.items;
        digitalTBAccess0.items = itemList3;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        java.lang.Double double47 = facultyMember43.getOverdue_charge();
        facultyMember43.setCan_borrow((java.lang.Boolean) false);
        java.util.ArrayList<java.lang.String> strList50 = facultyMember43.getSubscribed_newsletters();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList50);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setType("src/database/digital_tb.csv");
        models.Request request11 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str12 = request11.getId();
        models.Users.User user13 = request11.getRequester();
        request11.setType("src/database/digital_tb.csv");
        int int16 = request3.compareTo(request11);
        models.Request request20 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str21 = request20.getType();
        int int22 = request11.compareTo(request20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Password must contain at least one uppercase letter" + "'", str12.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        models.Users.Visitor visitor66 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList60, strList64);
        facultyMember43.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList60);
        java.lang.Boolean boolean68 = facultyMember43.getIs_registered();
        facultyMember43.increaseOverdue_charge((java.lang.Double) 0.0d);
        java.util.List<java.lang.String> strList71 = facultyMember43.getPreviousTextbooksUsed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.LoginUtilities.verifyRegistration("src/database/students.csv", "Password must contain at least one uppercase letter", "Faculty Member Notification: hi!", "Library Management Team Notification: hi!", strConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.lang.String str46 = facultyMember43.getLastNotification();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        models.Users.Visitor visitor49 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList43, strList47);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        models.Users.Visitor visitor67 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList61, strList65);
        models.Users.FacultyMember facultyMember68 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList47, strList61);
        models.Users.FacultyMember facultyMember69 = new models.Users.FacultyMember("", "src/database/students.csv", "hi!", "src/database/digital_tb.csv", (java.lang.Boolean) true, (java.lang.Double) 100.0d, (java.lang.Boolean) false, strList18, strList61);
        java.lang.String str70 = facultyMember69.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "src/database/digital_tb.csv" + "'", str70.equals("src/database/digital_tb.csv"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.LoginUtilities.verifyRegistration("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", "Library Management Team Notification: hi!", strConsumer4, runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        models.Users.Visitor visitor72 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList66, strList70);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        models.Users.Visitor visitor90 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList84, strList88);
        models.Users.FacultyMember facultyMember91 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList70, strList84);
        facultyMember91.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList94 = facultyMember91.getRented_item_list();
        java.lang.Double double95 = facultyMember91.getOverdue_charge();
        java.util.ArrayList<java.lang.String> strList96 = facultyMember91.getSubscribed_newsletters();
        facultyMember43.setTeachingCourses((java.util.List<java.lang.String>) strList96);
        java.util.List<java.lang.String> strList98 = facultyMember43.getPreviousTextbooksUsed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-1.0d) + "'", double95.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList98);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        database_access.FacultyMemberAccess facultyMemberAccess0 = database_access.FacultyMemberAccess.getInstance();
        database_access.StudentAccess studentAccess1 = database_access.StudentAccess.getInstance();
        java.lang.String str2 = studentAccess1.path;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess1.users;
        java.util.ArrayList<models.Users.User> userList4 = studentAccess1.users;
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess5 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess6 = database_access.StudentAccess.getInstance();
        java.lang.String str7 = studentAccess6.path;
        java.util.ArrayList<models.Users.User> userList8 = studentAccess6.users;
        nonFacultyStaffAccess5.users = userList8;
        studentAccess1.users = userList8;
        facultyMemberAccess0.users = userList8;
        database_access.FacultyMemberAccess facultyMemberAccess12 = database_access.FacultyMemberAccess.getInstance();
        database_access.StudentAccess studentAccess13 = database_access.StudentAccess.getInstance();
        java.util.ArrayList<models.Users.User> userList14 = studentAccess13.users;
        facultyMemberAccess12.users = userList14;
        facultyMemberAccess0.users = userList14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(facultyMemberAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(facultyMemberAccess12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess13);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        java.lang.Long long7 = cd6.getDueDate();
        java.lang.String str8 = cd6.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "src/database/digital_tb.csv" + "'", str8.equals("src/database/digital_tb.csv"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        facultyMember43.remove_subscription("Faculty Member Notification: hi!");
        facultyMember43.setCan_borrow((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList2 = libraryManager1.getItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.path = "src/database/students.csv";
        bookAccess0.enableItem("Password must contain at least one uppercase letter");
        bookAccess0.disableItem("Password must contain at least one uppercase letter");
        bookAccess0.disableItem("src/database/books.csv");
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList9 = bookAccess0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        models.Request request3 = new models.Request("src/database/students.csv", "src/database/students.csv", "hi!");
        models.Request request7 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str8 = request7.getId();
        models.Users.User user9 = request7.getRequester();
        request7.setBookId("src/database/digital_tb.csv");
        int int12 = request3.compareTo(request7);
        java.lang.String str13 = request7.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Password must contain at least one uppercase letter" + "'", str8.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Password must contain at least one uppercase letter" + "'", str13.equals("Password must contain at least one uppercase letter"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        database_access.VisitorAccess visitorAccess0 = database_access.VisitorAccess.getInstance();
        java.lang.String str1 = visitorAccess0.path;
        java.lang.String str2 = visitorAccess0.path;
        visitorAccess0.path = "src/database/digital_tb.csv";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(visitorAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand9 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager8);
        java.lang.Double double10 = cd6.getDollarAmount();
        models.LibraryItem.LibraryManager libraryManager14 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand15 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager14);
        models.LibraryItem.AddItemCommand addItemCommand16 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd6, libraryManager14);
        // The following exception was thrown during execution in test generation
        try {
            libraryManager14.enableItem("Library Management Team Notification: src/database/digital_tb.csv", "src/database/books.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10.equals(0.0d));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.path = "src/database/students.csv";
        bookAccess0.enableItem("Password must contain at least one uppercase letter");
        bookAccess0.disableItem("Password must contain at least one uppercase letter");
        bookAccess0.enableItem("Password must contain at least one uppercase letter");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        models.Request request3 = new models.Request("Faculty Member Notification: hi!", "Library Management Team Notification: hi!", "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        models.Users.Visitor visitor66 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList60, strList64);
        facultyMember43.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList60);
        facultyMember43.increaseOverdue_charge((java.lang.Double) 10.0d);
        facultyMember43.increaseOverdue_charge((java.lang.Double) (-1.0d));
        java.lang.Boolean boolean72 = facultyMember43.getIs_registered();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72.equals(false));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        models.Users.Visitor visitor66 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList60, strList64);
        facultyMember43.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList60);
        facultyMember43.increaseOverdue_charge((java.lang.Double) 10.0d);
        facultyMember43.increaseOverdue_charge((java.lang.Double) (-1.0d));
        facultyMember43.remove_subscription("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        java.lang.Boolean boolean58 = textbook8.getPurchasability();
        java.util.List<models.TextbookObserver.TextbookObserver> textbookObserverList59 = textbook8.getFacultyObservers();
        models.Items.DigitalTB.DigitalTB digitalTB61 = logic.DigitalTBUtilities.digitize(textbook8, "src/database/books.csv");
        java.util.List<models.TextbookObserver.TextbookObserver> textbookObserverList62 = textbook8.getFacultyObservers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookObserverList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTB61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookObserverList62);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.setCan_borrow((java.lang.Boolean) false);
        java.lang.Boolean boolean49 = facultyMember43.getIs_registered();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49.equals(false));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        java.lang.Boolean boolean58 = textbook8.getPurchasability();
        java.util.List<models.TextbookObserver.TextbookObserver> textbookObserverList59 = textbook8.getFacultyObservers();
        java.util.List<models.TextbookObserver.TextbookObserver> textbookObserverList60 = textbook8.getFacultyObservers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookObserverList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookObserverList60);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        java.lang.Boolean boolean7 = textbook6.getPurchasability();
        java.util.List<models.TextbookObserver.TextbookObserver> textbookObserverList8 = textbook6.getFacultyObservers();
        java.lang.Long long9 = textbook6.getDueDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookObserverList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9.equals(0L));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand4 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager3);
        database_access.CdAccess cdAccess5 = database_access.CdAccess.getInstance();
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList6 = cdAccess5.items;
        models.LibraryItem.LibraryManager libraryManager9 = new models.LibraryItem.LibraryManager("");
        // The following exception was thrown during execution in test generation
        try {
            enableItemCommand4.execute((java.util.List<models.Items.PhysicalItems.PhysicalItem>) physicalItemList6, "hi!", libraryManager9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.DisableItemCommand disableItemCommand4 = new models.LibraryItem.DisableItemCommand("hi!", "", libraryManager3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess0 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess1 = database_access.StudentAccess.getInstance();
        java.lang.String str2 = studentAccess1.path;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess1.users;
        nonFacultyStaffAccess0.users = userList3;
        nonFacultyStaffAccess0.path = "Password must contain at least one uppercase letter";
        nonFacultyStaffAccess0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        models.LibraryItem.LibraryManager libraryManager1 = new models.LibraryItem.LibraryManager("Library Management Team Notification: src/database/digital_tb.csv");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getSubscribed_newsletters();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        database_access.MagazineAccess magazineAccess0 = database_access.MagazineAccess.getInstance();
        magazineAccess0.path = "src/database/visitor.csv";
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList3 = magazineAccess0.items;
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList4 = magazineAccess0.items;
        magazineAccess0.path = "src/database/students.csv";
        magazineAccess0.disableItem("Password must contain at least one uppercase letter");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazineAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        database_access.DigitalTBAccess digitalTBAccess0 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList1 = digitalTBAccess0.items;
        java.lang.String str2 = digitalTBAccess0.path;
        database_access.DigitalTBAccess digitalTBAccess3 = database_access.DigitalTBAccess.getInstance();
        java.util.ArrayList<models.Items.Item> itemList4 = digitalTBAccess3.items;
        digitalTBAccess0.items = itemList4;
        java.lang.String str6 = digitalTBAccess0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/books.csv" + "'", str2.equals("src/database/books.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTBAccess3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "src/database/books.csv" + "'", str6.equals("src/database/books.csv"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.RemoveItemCommand removeItemCommand4 = new models.LibraryItem.RemoveItemCommand("src/database/digital_tb.csv", "src/database/students.csv", libraryManager3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        java.util.List<models.LibraryManagementTeam.LibraryManagementTeamObserver> libraryManagementTeamObserverList7 = textbook6.getLibraryObservers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(libraryManagementTeamObserverList7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        models.Items.PhysicalItems.Cd cd8 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager10 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand11 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd8, libraryManager10);
        models.LibraryItem.DisableItemCommand disableItemCommand12 = new models.LibraryItem.DisableItemCommand("hi!", "src/database/students.csv", libraryManager10);
        models.LibraryItem.LibraryManager libraryManager16 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand17 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager16);
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList18 = libraryManager16.getItems();
        models.Items.PhysicalItems.Cd cd26 = new models.Items.PhysicalItems.Cd("Password must contain at least one uppercase letter", "", "Password must contain at least one uppercase letter", (java.lang.Boolean) true, (java.lang.Long) 100L, (java.lang.Double) 100.0d);
        java.lang.Double double27 = cd26.getDollarAmount();
        models.LibraryItem.LibraryManager libraryManager33 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand34 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager33);
        models.LibraryItem.RemoveItemCommand removeItemCommand35 = new models.LibraryItem.RemoveItemCommand("", "src/database/visitor.csv", libraryManager33);
        models.LibraryItem.UpdateCommand updateCommand36 = new models.LibraryItem.UpdateCommand((models.Items.PhysicalItems.PhysicalItem) cd26, libraryManager33);
        // The following exception was thrown during execution in test generation
        try {
            disableItemCommand12.execute(physicalItemList18, "src/database/digital_tb.csv", libraryManager33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27.equals(100.0d));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Prompts.SystemWarnings systemWarnings1 = new Prompts.SystemWarnings("Faculty Member Notification: hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        java.lang.Boolean boolean7 = textbook6.getPurchasability();
        textbook6.setPurchasability((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        database_access.FacultyMemberAccess facultyMemberAccess0 = database_access.FacultyMemberAccess.getInstance();
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess1 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess2 = database_access.StudentAccess.getInstance();
        java.lang.String str3 = studentAccess2.path;
        java.util.ArrayList<models.Users.User> userList4 = studentAccess2.users;
        nonFacultyStaffAccess1.users = userList4;
        facultyMemberAccess0.users = userList4;
        facultyMemberAccess0.path = "src/database/books.csv";
        facultyMemberAccess0.path = "Library Management Team Notification: hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(facultyMemberAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.disableItem("src/database/books.csv");
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList3 = bookAccess0.items;
        bookAccess0.disableItem("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        models.Request request3 = new models.Request("src/database/students.csv", "Password must contain at least one uppercase letter", "");
        java.lang.String str4 = request3.getId();
        models.Users.User user5 = request3.getRequester();
        request3.setBookId("src/database/digital_tb.csv");
        java.lang.String str8 = request3.getBookId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Password must contain at least one uppercase letter" + "'", str4.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "src/database/digital_tb.csv" + "'", str8.equals("src/database/digital_tb.csv"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.Items.DigitalTB.DigitalTB digitalTB2 = new models.Items.DigitalTB.DigitalTB("src/database/visitor.csv", "src/database/visitor.csv");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.Payments.MobileWallet.pay((java.lang.Double) 10.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        facultyMember43.add_subscription("src/database/students.csv");
        java.lang.String str47 = facultyMember43.getPassword();
        java.lang.String str48 = facultyMember43.getLastNotification();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        database_access.CdAccess cdAccess0 = database_access.CdAccess.getInstance();
        cdAccess0.removeItem("Password must contain at least one uppercase letter");
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList3 = cdAccess0.items;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/books.csv", "src/database/books.csv", "src/database/books.csv", (java.lang.Boolean) false, (java.lang.Long) 10L, (java.lang.Double) 0.0d);
        java.lang.Double double7 = cd6.getDollarAmount();
        cd6.setDollarAmount((java.lang.Double) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand4 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager3);
        java.lang.String str5 = enableItemCommand4.getItemId();
        java.lang.String str6 = enableItemCommand4.getItemType();
        models.LibraryItem.LibraryManager libraryManager8 = new models.LibraryItem.LibraryManager("");
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList9 = libraryManager8.getItems();
        models.Items.PhysicalItems.Cd cd17 = new models.Items.PhysicalItems.Cd("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Long) 0L, (java.lang.Double) 0.0d);
        models.LibraryItem.LibraryManager libraryManager19 = new models.LibraryItem.LibraryManager("");
        models.LibraryItem.AddItemCommand addItemCommand20 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd17, libraryManager19);
        java.lang.Double double21 = cd17.getDollarAmount();
        models.LibraryItem.LibraryManager libraryManager25 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand26 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager25);
        models.LibraryItem.AddItemCommand addItemCommand27 = new models.LibraryItem.AddItemCommand((models.Items.PhysicalItems.PhysicalItem) cd17, libraryManager25);
        // The following exception was thrown during execution in test generation
        try {
            enableItemCommand4.execute(physicalItemList9, "Password must contain at least one uppercase letter", libraryManager25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Password must contain at least one uppercase letter" + "'", str5.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Password must contain at least one uppercase letter" + "'", str6.equals("Password must contain at least one uppercase letter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21.equals(0.0d));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.disableItem("src/database/books.csv");
        bookAccess0.disableItem("src/database/visitor.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        models.Users.Visitor visitor66 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList60, strList64);
        facultyMember43.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList60);
        java.lang.Boolean boolean68 = facultyMember43.getIs_registered();
        java.util.ArrayList<java.lang.String> strList69 = facultyMember43.getRented_item_list();
        java.lang.Double double70 = facultyMember43.getOverdue_charge();
        facultyMember43.addCourse("Library Management Team Notification: src/database/digital_tb.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70.equals((-1.0d)));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess0 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess1 = database_access.StudentAccess.getInstance();
        java.lang.String str2 = studentAccess1.path;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess1.users;
        nonFacultyStaffAccess0.users = userList3;
        java.util.ArrayList<models.Users.User> userList5 = nonFacultyStaffAccess0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        database_access.MagazineAccess magazineAccess0 = database_access.MagazineAccess.getInstance();
        magazineAccess0.path = "src/database/visitor.csv";
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList3 = magazineAccess0.items;
        magazineAccess0.disableItem("");
        magazineAccess0.enableItem("Password must contain at least one uppercase letter");
        database_access.CdAccess cdAccess8 = database_access.CdAccess.getInstance();
        database_access.BookAccess bookAccess9 = database_access.BookAccess.getInstance();
        bookAccess9.removeItem("hi!");
        java.lang.String str12 = bookAccess9.path;
        models.Items.PhysicalItems.Textbook textbook19 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        models.Course course21 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook28 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course21.addTextbook(textbook28);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        models.Users.Visitor visitor54 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList48, strList52);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        models.Users.Visitor visitor72 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList66, strList70);
        models.Users.FacultyMember facultyMember73 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList52, strList66);
        facultyMember73.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList76 = facultyMember73.getRented_item_list();
        textbook28.addObserver((models.TextbookObserver.TextbookObserver) facultyMember73);
        models.Items.PhysicalItems.PhysicalItem[] physicalItemArray78 = new models.Items.PhysicalItems.PhysicalItem[] { textbook19, textbook28 };
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList79 = new java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<models.Items.PhysicalItems.PhysicalItem>) physicalItemList79, physicalItemArray78);
        bookAccess9.items = physicalItemList79;
        cdAccess8.items = physicalItemList79;
        magazineAccess0.items = physicalItemList79;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazineAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "src/database/students.csv" + "'", str12.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        models.Request request3 = new models.Request("Library Management Team Notification: hi!", "Faculty Member Notification: hi!", "Library Management Team Notification: hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        models.Items.PhysicalItems.PhysicalItem physicalItem2 = null;
        models.LibraryItem.LibraryManager libraryManager6 = new models.LibraryItem.LibraryManager("");
        java.util.List<models.Items.PhysicalItems.PhysicalItem> physicalItemList7 = libraryManager6.getItems();
        models.LibraryItem.DisableItemCommand disableItemCommand8 = new models.LibraryItem.DisableItemCommand("hi!", "", libraryManager6);
        models.LibraryItem.UpdateCommand updateCommand9 = new models.LibraryItem.UpdateCommand(physicalItem2, libraryManager6);
        models.LibraryItem.EnableItemCommand enableItemCommand10 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Library Management Team Notification: hi!", libraryManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        models.Course course1 = new models.Course("src/database/digital_tb.csv");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        database_access.StudentAccess studentAccess0 = database_access.StudentAccess.getInstance();
        studentAccess0.path = "";
        studentAccess0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        models.LibraryItem.LibraryManager libraryManager3 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand4 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager3);
        java.lang.String str5 = enableItemCommand4.getItemId();
        database_access.BookAccess bookAccess6 = database_access.BookAccess.getInstance();
        bookAccess6.removeItem("hi!");
        java.lang.String str9 = bookAccess6.path;
        java.lang.String str10 = bookAccess6.path;
        database_access.BookAccess bookAccess11 = database_access.BookAccess.getInstance();
        bookAccess11.removeItem("hi!");
        java.lang.String str14 = bookAccess11.path;
        models.Items.PhysicalItems.Textbook textbook21 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        models.Course course23 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook30 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course23.addTextbook(textbook30);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        models.Users.Visitor visitor56 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList50, strList54);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        models.Users.Visitor visitor74 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList68, strList72);
        models.Users.FacultyMember facultyMember75 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList54, strList68);
        facultyMember75.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList78 = facultyMember75.getRented_item_list();
        textbook30.addObserver((models.TextbookObserver.TextbookObserver) facultyMember75);
        models.Items.PhysicalItems.PhysicalItem[] physicalItemArray80 = new models.Items.PhysicalItems.PhysicalItem[] { textbook21, textbook30 };
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList81 = new java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<models.Items.PhysicalItems.PhysicalItem>) physicalItemList81, physicalItemArray80);
        bookAccess11.items = physicalItemList81;
        bookAccess6.items = physicalItemList81;
        models.LibraryItem.LibraryManager libraryManager91 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand92 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager91);
        models.LibraryItem.RemoveItemCommand removeItemCommand93 = new models.LibraryItem.RemoveItemCommand("", "src/database/visitor.csv", libraryManager91);
        // The following exception was thrown during execution in test generation
        try {
            enableItemCommand4.execute((java.util.List<models.Items.PhysicalItems.PhysicalItem>) physicalItemList81, "Library Management Team Notification: hi!", libraryManager91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "src/database/students.csv" + "'", str5.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "src/database/students.csv" + "'", str9.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "src/database/students.csv" + "'", str10.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "src/database/students.csv" + "'", str14.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        models.LibraryManagementTeam.LibraryManagementTeam libraryManagementTeam0 = new models.LibraryManagementTeam.LibraryManagementTeam();
        java.lang.String str1 = libraryManagementTeam0.getLastNotification();
        java.lang.String str2 = libraryManagementTeam0.getLastNotification();
        Prompts.SystemNotifications systemNotifications4 = new Prompts.SystemNotifications("src/database/visitor.csv");
        java.lang.String str5 = libraryManagementTeam0.update((Prompts.SystemPrompts) systemNotifications4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Library Management Team Notification: src/database/visitor.csv" + "'", str5.equals("Library Management Team Notification: src/database/visitor.csv"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.path = "src/database/students.csv";
        bookAccess0.enableItem("Password must contain at least one uppercase letter");
        bookAccess0.disableItem("Password must contain at least one uppercase letter");
        bookAccess0.removeItem("hi!");
        bookAccess0.enableItem("hi!");
        bookAccess0.disableItem("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess0 = database_access.NonFacultyStaffAccess.getInstance();
        java.util.ArrayList<models.Users.User> userList1 = nonFacultyStaffAccess0.users;
        java.util.ArrayList<models.Users.User> userList2 = nonFacultyStaffAccess0.users;
        database_access.StudentAccess studentAccess3 = database_access.StudentAccess.getInstance();
        java.lang.String str4 = studentAccess3.path;
        java.util.ArrayList<models.Users.User> userList5 = studentAccess3.users;
        database_access.StudentAccess studentAccess6 = database_access.StudentAccess.getInstance();
        java.lang.String str7 = studentAccess6.path;
        java.util.ArrayList<models.Users.User> userList8 = studentAccess6.users;
        java.util.ArrayList<models.Users.User> userList9 = studentAccess6.users;
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess10 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess11 = database_access.StudentAccess.getInstance();
        java.lang.String str12 = studentAccess11.path;
        java.util.ArrayList<models.Users.User> userList13 = studentAccess11.users;
        nonFacultyStaffAccess10.users = userList13;
        studentAccess6.users = userList13;
        studentAccess3.users = userList13;
        nonFacultyStaffAccess0.users = userList13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        database_access.MagazineAccess magazineAccess0 = database_access.MagazineAccess.getInstance();
        magazineAccess0.path = "src/database/visitor.csv";
        magazineAccess0.disableItem("Library Management Team Notification: src/database/digital_tb.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(magazineAccess0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        database_access.CdAccess cdAccess0 = database_access.CdAccess.getInstance();
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList1 = cdAccess0.items;
        cdAccess0.enableItem("Library Management Team Notification: hi!");
        cdAccess0.disableItem("src/database/books.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        textbook8.setLocation("Library Management Team Notification: src/database/visitor.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("hi!", "hi!", "hi!");
        java.lang.String str4 = digitalTB3.getCourseName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        models.Items.PhysicalItems.Cd cd6 = new models.Items.PhysicalItems.Cd("src/database/books.csv", "src/database/digital_tb.csv", "src/database/books.csv", (java.lang.Boolean) false, (java.lang.Long) (-1L), (java.lang.Double) 0.0d);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cd6.setDueDate(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.path = "src/database/students.csv";
        bookAccess0.enableItem("Password must contain at least one uppercase letter");
        bookAccess0.disableItem("Password must contain at least one uppercase letter");
        bookAccess0.enableItem("src/database/visitor.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        models.Items.PhysicalItems.Cd cd8 = new models.Items.PhysicalItems.Cd("Password must contain at least one uppercase letter", "", "Password must contain at least one uppercase letter", (java.lang.Boolean) true, (java.lang.Long) 100L, (java.lang.Double) 100.0d);
        java.lang.Double double9 = cd8.getDollarAmount();
        models.LibraryItem.LibraryManager libraryManager15 = new models.LibraryItem.LibraryManager("Password must contain at least one uppercase letter");
        models.LibraryItem.EnableItemCommand enableItemCommand16 = new models.LibraryItem.EnableItemCommand("src/database/students.csv", "src/database/books.csv", libraryManager15);
        models.LibraryItem.RemoveItemCommand removeItemCommand17 = new models.LibraryItem.RemoveItemCommand("", "src/database/visitor.csv", libraryManager15);
        models.LibraryItem.UpdateCommand updateCommand18 = new models.LibraryItem.UpdateCommand((models.Items.PhysicalItems.PhysicalItem) cd8, libraryManager15);
        models.LibraryItem.EnableItemCommand enableItemCommand19 = new models.LibraryItem.EnableItemCommand("Library Management Team Notification: src/database/digital_tb.csv", "src/database/students.csv", libraryManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9.equals(100.0d));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        services.RequestService requestService0 = new services.RequestService();
        services.RequestService requestService1 = new services.RequestService();
        java.util.PriorityQueue<models.Request> requestQueue2 = requestService1.requestQueue;
        requestService0.requestQueue = requestQueue2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestQueue2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        models.LibraryItem.LibraryManager libraryManager5 = new models.LibraryItem.LibraryManager("src/database/students.csv");
        models.LibraryItem.EnableItemCommand enableItemCommand6 = new models.LibraryItem.EnableItemCommand("Password must contain at least one uppercase letter", "Password must contain at least one uppercase letter", libraryManager5);
        models.LibraryItem.EnableItemCommand enableItemCommand7 = new models.LibraryItem.EnableItemCommand("Library Management Team Notification: src/database/visitor.csv", "Library Management Team Notification: hi!", libraryManager5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        models.Course course1 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook8 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course1.addTextbook(textbook8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        models.Users.Visitor visitor34 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList28, strList32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        models.Users.Visitor visitor52 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList46, strList50);
        models.Users.FacultyMember facultyMember53 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList32, strList46);
        facultyMember53.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList56 = facultyMember53.getRented_item_list();
        textbook8.addObserver((models.TextbookObserver.TextbookObserver) facultyMember53);
        java.lang.Boolean boolean58 = textbook8.getPurchasability();
        boolean boolean59 = textbook8.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        models.Users.Visitor visitor49 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList43, strList47);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        models.Users.Visitor visitor67 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList61, strList65);
        models.Users.FacultyMember facultyMember68 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList47, strList61);
        models.Users.NonFacultyStaff nonFacultyStaff69 = new models.Users.NonFacultyStaff("src/database/digital_tb.csv", "src/database/students.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) false, (java.lang.Double) 0.0d, (java.lang.Boolean) false, strList22, strList61);
        java.util.ArrayList<java.lang.String> strList70 = nonFacultyStaff69.getRented_item_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList70);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        database_access.CdAccess cdAccess0 = database_access.CdAccess.getInstance();
        database_access.BookAccess bookAccess1 = database_access.BookAccess.getInstance();
        bookAccess1.removeItem("hi!");
        java.lang.String str4 = bookAccess1.path;
        models.Items.PhysicalItems.Textbook textbook11 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        models.Course course13 = new models.Course("hi!");
        models.Items.PhysicalItems.Textbook textbook20 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        course13.addTextbook(textbook20);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        models.Users.Visitor visitor46 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList40, strList44);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        models.Users.Visitor visitor64 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList58, strList62);
        models.Users.FacultyMember facultyMember65 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList44, strList58);
        facultyMember65.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList68 = facultyMember65.getRented_item_list();
        textbook20.addObserver((models.TextbookObserver.TextbookObserver) facultyMember65);
        models.Items.PhysicalItems.PhysicalItem[] physicalItemArray70 = new models.Items.PhysicalItems.PhysicalItem[] { textbook11, textbook20 };
        java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem> physicalItemList71 = new java.util.ArrayList<models.Items.PhysicalItems.PhysicalItem>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<models.Items.PhysicalItems.PhysicalItem>) physicalItemList71, physicalItemArray70);
        bookAccess1.items = physicalItemList71;
        cdAccess0.items = physicalItemList71;
        cdAccess0.disableItem("Password must contain at least one uppercase letter");
        cdAccess0.removeItem("Password must contain at least one uppercase letter");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cdAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "src/database/students.csv" + "'", str4.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        facultyMember43.setCan_borrow((java.lang.Boolean) true);
        java.util.ArrayList<java.lang.String> strList46 = facultyMember43.getRented_item_list();
        facultyMember43.remove_subscription("Faculty Member Notification: hi!");
        java.lang.Class<?> wildcardClass49 = facultyMember43.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.lang.String str1 = logic.LoginUtilities.verifyStrongPass("src/database/visitor.csv");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Password must contain at least one uppercase letter" + "'", str1.equals("Password must contain at least one uppercase letter"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.Boolean boolean44 = facultyMember43.getCan_borrow();
        facultyMember43.add_subscription("src/database/students.csv");
        java.util.ArrayList<java.lang.String> strList47 = facultyMember43.getRented_item_list();
        java.util.ArrayList<java.lang.String> strList48 = facultyMember43.getSubscribed_newsletters();
        java.lang.String str49 = facultyMember43.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        database_access.FacultyMemberAccess facultyMemberAccess0 = database_access.FacultyMemberAccess.getInstance();
        database_access.StudentAccess studentAccess1 = database_access.StudentAccess.getInstance();
        java.lang.String str2 = studentAccess1.path;
        java.util.ArrayList<models.Users.User> userList3 = studentAccess1.users;
        java.util.ArrayList<models.Users.User> userList4 = studentAccess1.users;
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess5 = database_access.NonFacultyStaffAccess.getInstance();
        database_access.StudentAccess studentAccess6 = database_access.StudentAccess.getInstance();
        java.lang.String str7 = studentAccess6.path;
        java.util.ArrayList<models.Users.User> userList8 = studentAccess6.users;
        nonFacultyStaffAccess5.users = userList8;
        studentAccess1.users = userList8;
        facultyMemberAccess0.users = userList8;
        facultyMemberAccess0.path = "src/database/books.csv";
        facultyMemberAccess0.path = "src/database/students.csv";
        java.util.ArrayList<models.Users.User> userList16 = facultyMemberAccess0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(facultyMemberAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(studentAccess6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        services.Payments.PaymentService paymentService0 = new services.Payments.PaymentService();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        models.Users.Visitor visitor27 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList21, strList25);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        models.Users.Visitor visitor45 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList39, strList43);
        models.Users.FacultyMember facultyMember46 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList25, strList39);
        java.lang.String str47 = facultyMember46.getName();
        java.lang.String str48 = facultyMember46.getName();
        paymentService0.overduePay((java.lang.Double) (-1.0d), "hi!", (models.Users.User) facultyMember46);
        paymentService0.pOption("src/database/books.csv", (java.lang.Double) 1.0d);
        models.Users.User user55 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService0.overduePay((java.lang.Double) 0.0d, "Library Management Team Notification: hi!", user55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        models.Users.Visitor visitor24 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList18, strList22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        models.Users.Visitor visitor42 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList36, strList40);
        models.Users.FacultyMember facultyMember43 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList22, strList36);
        java.lang.String str44 = facultyMember43.getName();
        facultyMember43.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember43.setCan_borrow((java.lang.Boolean) false);
        facultyMember43.add_subscription("Faculty Member Notification: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        models.Course course1 = new models.Course("src/database/students.csv");
        int int2 = course1.getCode();
        course1.setName("Faculty Member Notification: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        database_access.VisitorAccess visitorAccess0 = database_access.VisitorAccess.getInstance();
        database_access.NonFacultyStaffAccess nonFacultyStaffAccess1 = database_access.NonFacultyStaffAccess.getInstance();
        java.util.ArrayList<models.Users.User> userList2 = nonFacultyStaffAccess1.users;
        visitorAccess0.users = userList2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(visitorAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(nonFacultyStaffAccess1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        models.Items.DigitalTB.DigitalTB digitalTB3 = new models.Items.DigitalTB.DigitalTB("src/database/students.csv", "src/database/students.csv", "Library Management Team Notification: src/database/digital_tb.csv");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        models.Items.PhysicalItems.Textbook textbook6 = new models.Items.PhysicalItems.Textbook("", "hi!", "src/database/students.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 100.0d);
        textbook6.setAvailability(false);
        java.util.List<models.LibraryManagementTeam.LibraryManagementTeamObserver> libraryManagementTeamObserverList9 = textbook6.getLibraryObservers();
        models.Items.DigitalTB.DigitalTB digitalTB11 = logic.DigitalTBUtilities.digitize(textbook6, "src/database/students.csv");
        java.lang.String str12 = textbook6.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(libraryManagementTeamObserverList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(digitalTB11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        database_access.BookAccess bookAccess0 = database_access.BookAccess.getInstance();
        bookAccess0.path = "src/database/students.csv";
        bookAccess0.enableItem("Password must contain at least one uppercase letter");
        bookAccess0.disableItem("hi!");
        java.lang.String str7 = bookAccess0.path;
        java.lang.String str8 = bookAccess0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookAccess0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "src/database/students.csv" + "'", str7.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "src/database/students.csv" + "'", str8.equals("src/database/students.csv"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        models.LibraryManagementTeam.LibraryManagementTeam libraryManagementTeam0 = new models.LibraryManagementTeam.LibraryManagementTeam();
        java.lang.String str1 = libraryManagementTeam0.getLastNotification();
        java.lang.String str2 = libraryManagementTeam0.getLastNotification();
        Prompts.SystemWarnings systemWarnings4 = new Prompts.SystemWarnings("src/database/digital_tb.csv");
        java.lang.String str5 = libraryManagementTeam0.update((Prompts.SystemPrompts) systemWarnings4);
        java.lang.String str6 = libraryManagementTeam0.getLastNotification();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Library Management Team Notification: src/database/digital_tb.csv" + "'", str5.equals("Library Management Team Notification: src/database/digital_tb.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Library Management Team Notification: src/database/digital_tb.csv" + "'", str6.equals("Library Management Team Notification: src/database/digital_tb.csv"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        models.Course course1 = new models.Course("src/database/students.csv");
        java.lang.String str2 = course1.getName();
        course1.setCode((-1));
        int int5 = course1.getCode();
        models.Course course7 = new models.Course("src/database/students.csv");
        java.lang.String str8 = course7.getName();
        course7.setCode((-1));
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList11 = course7.getTextbooks();
        course1.setTextbook(textbookList11);
        models.Course course14 = new models.Course("src/database/students.csv");
        java.lang.String str15 = course14.getName();
        course14.setCode((-1));
        java.util.ArrayList<models.Items.PhysicalItems.Textbook> textbookList18 = course14.getTextbooks();
        course1.setTextbook(textbookList18);
        java.lang.String str20 = course1.getName();
        int int21 = course1.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src/database/students.csv" + "'", str2.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "src/database/students.csv" + "'", str8.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "src/database/students.csv" + "'", str15.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "src/database/students.csv" + "'", str20.equals("src/database/students.csv"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        models.Items.PhysicalItems.Magazine magazine6 = new models.Items.PhysicalItems.Magazine("src/database/digital_tb.csv", "", "src/database/digital_tb.csv", (java.lang.Boolean) true, (java.lang.Long) 0L, (java.lang.Double) 1.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        services.Payments.PaymentService paymentService0 = new services.Payments.PaymentService();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        models.Users.Visitor visitor27 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList21, strList25);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        models.Users.Visitor visitor45 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList39, strList43);
        models.Users.FacultyMember facultyMember46 = new models.Users.FacultyMember("hi!", "hi!", "", "hi!", (java.lang.Boolean) false, (java.lang.Double) (-1.0d), (java.lang.Boolean) false, strList25, strList39);
        java.lang.String str47 = facultyMember46.getName();
        facultyMember46.addTextbookUsed("Password must contain at least one uppercase letter");
        facultyMember46.remove_subscription("src/database/students.csv");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "src/database/students.csv", "src/database/students.csv" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        models.Users.Visitor visitor69 = new models.Users.Visitor("hi!", "", "hi!", "hi!", (java.lang.Boolean) false, (java.lang.Double) 10.0d, (java.lang.Boolean) true, strList63, strList67);
        facultyMember46.setPreviousTextbooksUsed((java.util.List<java.lang.String>) strList63);
        java.lang.String str71 = facultyMember46.getEmail();
        facultyMember46.setOverdue_charge((java.lang.Double) 100.0d);
        paymentService0.overduePay((java.lang.Double) (-1.0d), "src/database/books.csv", (models.Users.User) facultyMember46);
        java.lang.String str75 = facultyMember46.getLastNotification();
        java.util.ArrayList<java.lang.String> strList76 = facultyMember46.getSubscribed_newsletters();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList76);
    }
}
