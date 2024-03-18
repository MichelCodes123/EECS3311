package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import database_access.BookAccess;
import database_access.FacultyMemberAccess;
import database_access.QueryUtilities;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import models.Users.FacultyMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.itemstrategy.ItemStrategy;
import services.itemstrategy.RentItem;

import java.util.ArrayList;
import java.util.Date;

public class QueryUtilsTest {

    @Test
    @DisplayName("getExpiringItems")
    void getExpiringItemsTest() throws Exception {
        BookAccess db = BookAccess.getInstance();
        Long current_date = new Date().getTime();

        System.out.println(current_date);

        Book book = new Book("id","Name", "location", true,  current_date + (long) 1000000000, 0.0 );
        Book book2 = new Book("id2","Name1", "location", true,  (long) (24*60*60*1000), 0.0 );
        Book book3 = new Book("id3","Name2", "location", true,   (long) (24*60*60*1000), 0.0 );
        Book book4 = new Book("id4","Name3", "location", true,   (long) (24*60*60*1000), 0.0 );
        FacultyMember prof = new FacultyMember("id","Name", "location", "password",  true, 0.0, true, new ArrayList<>(), new ArrayList<>() );

        db.items.add(book);
        db.items.add(book2);
        db.items.add(book3);
        db.items.add(book4);
        db.update();

        FacultyMemberAccess profdb = FacultyMemberAccess.getInstance();
        profdb.users.add(prof);
        profdb.update();

        QueryUtilities utils = new QueryUtilities();
        ItemStrategy strat = new RentItem();
        ArrayList<PhysicalItem> items = utils.allPhysicalItems();

        for (PhysicalItem item : items) {
            strat.execute(item.getId(), prof.getId());
        }

        ArrayList<PhysicalItem> expiring_items = utils.getExpiringItems(prof.getId());
        assertEquals(3, expiring_items.size());

    }

}
