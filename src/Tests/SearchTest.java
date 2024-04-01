package Tests;

import database_access.BookAccess;
import models.Items.PhysicalItems.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.SearchingService;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {

    @Test
    @DisplayName("Searching")
    void searchTest() throws Exception {
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
}
