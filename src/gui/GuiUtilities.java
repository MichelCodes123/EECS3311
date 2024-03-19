package gui;

import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import database_access.QueryUtilities;

public class GuiUtilities {
    private static QueryUtilities queryUtilities = new QueryUtilities();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final String[] rentColumn = {"ID", "Name", "Location", "Dollar Amount", "Due Date", "Purchase"};
    public static final String[] viewColumn = {"ID", "Name", "Location", "Due Date"};

    public static Object[][] convertItemsToRentArray(ArrayList<Book> results) {
        Object[][] data = new Object[results.size()][6];
        for (int i = 0; i < results.size(); i++) {
            Book item = results.get(i);
            data[i][0] = item.getId();
            data[i][1] = item.getName();
            data[i][2] = item.getLocation();
            data[i][3] = item.getDollarAmount();
            data[i][4] = dateFormat.format(item.getDueDate());
            data[i][5] = "Rent";

           
        }
        return data;
    }
    public static Object[][] convertItemsToViewArray(ArrayList<PhysicalItem> items) {
        Object[][] data = new Object[items.size()][6];
        for (int i = 0; i < items.size(); i++) {
            PhysicalItem item = items.get(i);
            data[i][0] = item.getId();
            data[i][1] = item.getName();
            data[i][2] = item.getLocation();
            data[i][4] = dateFormat.format(item.getDueDate());
            
        }
        return data;
    }

    
}
