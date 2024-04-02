package Tests;

import database_access.BookAccess;
import database_access.CdAccess;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.Cd;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.SearchingService;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {

    @Test
    @DisplayName("Searching returns exact query")
    void searchTest() throws Exception {
       Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
       BookAccess bookdb = BookAccess.getInstance();
       bookdb.items.add(book4);
       bookdb.update();

        ArrayList<Book> results = SearchingService.search("The Last Wish");
        assertEquals(1, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }


    @Test
    @DisplayName("Returns empty search if nothing is found")
    void nullSearch() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "Lord of the Rings", "RM 125", true, (long) 0, 0.0);
        Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(book4);
        bookdb.update();

        ArrayList<Book> results = SearchingService.search("aaaaaaaaaaaaaaaaaaa");
        assertEquals(0, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }


    @Test
    @DisplayName("Searching returns similar strings")
    void ReccomendationSearch() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "Lord of the Rings", "RM 125", true, (long) 0, 0.0);
        Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(book4);
        bookdb.update();

        ArrayList<Book> results = SearchingService.search("The Last Wish");
        assertEquals(2, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }

    @Test
    @DisplayName("Levenshtein Distance of 6 or less is maintained")
    void LevenshteinDistance() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "The Last Of Us", "RM 125", true, (long) 0, 0.0);
        Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(book4);
        bookdb.update();

        ArrayList<Book> results = SearchingService.search("The Last ");
        assertEquals(3, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }

    @Test
    @DisplayName("String similarity extends to symbols")
    void SymbolicSimilarity() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last!", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "The Last Of Us", "RM 125", true, (long) 0, 0.0);
        Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(book4);
        bookdb.update();

        ArrayList<Book> results = SearchingService.search("The Last!");
        assertEquals(3, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }

    @Test
    @DisplayName("String similarity extends to empty query")
    void TestEmptyQuery() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last!", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "Chanel", "RM 125", true, (long) 0, 0.0);
        Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(book4);
        bookdb.update();

        ArrayList<Book> results = SearchingService.search("");
        assertEquals(1, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }

    @Test
    @DisplayName("String similarity extends to spaced query")
    void TestSpaceQuery() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last!", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "Chanel", "RM 125", true, (long) 0, 0.0);
        Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(book4);
        bookdb.update();

        ArrayList<Book> results = SearchingService.search("\n");
        assertEquals(1, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }

    @Test
    @DisplayName("Exact match is always the first return")
    void TestFirstReturn() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last!", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "Chanel", "RM 125", true, (long) 0, 0.0);
        Book book4 = new Book("3", "The Last Wish", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.items.add(book4);
        bookdb.update();

        ArrayList<Book> results = SearchingService.search("The Last!");
        assertEquals("The Last!", results.get(0).getName());

        bookdb.items = new ArrayList<>();
        bookdb.update();
    }



    @Test
    @DisplayName("Only books are returned")
    void TestOnlyBooks() throws Exception {
        Book book = new Book("0", "Game of Thrones", "RM 125", true, (long) 0, 0.0);
        Book book2 = new Book("1", "The Last", "RM 125", true, (long) 0, 0.0);
        Book book3 = new Book("2", "The Last Of Us", "RM 125", true, (long) 0, 0.0);
        Cd cd = new Cd("3", "Dark Side of the Moon", "RM 125", true, (long) 0, 0.0);
        BookAccess bookdb = BookAccess.getInstance();
        bookdb.items.add(book);
        bookdb.items.add(book2);
        bookdb.items.add(book3);
        bookdb.update();

        CdAccess cddb = CdAccess.getInstance();
        cddb.items.add(cd);
        assertEquals(1, cddb.items.size());

        cddb.update();

        ArrayList<Book> results = SearchingService.search("Dark Side of the Moon");
        assertEquals(0, results.size());

        bookdb.items = new ArrayList<>();
        bookdb.update();

        cddb.items = new ArrayList<>();
        cddb.update();
    }

    @Test
    @DisplayName("Empty array is returned if no books are found")
    void TestNoBooks() throws Exception {
        Cd cd = new Cd("3", "Dark Side of the Moon", "RM 125", true, (long) 0, 0.0);

        CdAccess cddb = CdAccess.getInstance();
        cddb.items.add(cd);
        assertEquals(1, cddb.items.size());

        cddb.update();

        ArrayList<Book> results = SearchingService.search("Dark Side of the Moon");
        assertEquals(0, results.size());


        cddb.items = new ArrayList<>();
        cddb.update();
    }
}
