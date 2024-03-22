package gui;

import models.Items.Item;
import models.Items.Newsletter;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import database_access.QueryUtilities;
import models.Items.PhysicalItems.Textbook;

public class GuiUtilities {
    private static QueryUtilities queryUtilities = new QueryUtilities();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final String[] rentColumn = {"ID", "Name", "Location", "Dollar Amount", "Due Date", "Purchase"};
    public static final String[] viewColumn = {"Name", "Location", "Due Date", "Status"};
    
    public static final String[] cdColumn = {"Name", "Dollar Amount", "Purchase"};

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
            
            data[i][0] = item.getName();
            data[i][1] = item.getLocation();
            data[i][2] = dateFormat.format(item.getDueDate());
            data[i][3] = getStatus(item.getDueDate());
            
        }
        return data;
    }

    public static Object[][] convertTextbookToViewArray(ArrayList<Book> items) {
        Object[][] data = new Object[items.size()][6];
        for (int i = 0; i < items.size(); i++) {
            Book item = items.get(i);

            data[i][0] = item.getName();
            data[i][1] = item.getLocation();
            data[i][2] = dateFormat.format(item.getDueDate());
            data[i][3] = getStatus(item.getDueDate());

        }
        return data;
    }

    public static Object[][] convertDigitalTBToViewArray(ArrayList<String> items) {
        Object[][] data = new Object[items.size()][6];
        for (int i = 0; i < items.size(); i++) {
            data[i][0] = items.get(i);
        }
        return data;
    }

    private static String getStatus(long date){
        if (date < System.currentTimeMillis()) {
            return "Overdue";
        }
        else if (date < System.currentTimeMillis() + 86400000) {
            return "Due Today";
        }
        else {
            return "Not Due";
        }
        
    }
    public static Object[][] convertNews(ArrayList<Newsletter> items) {
        Object[][] data = new Object[items.size()][3];
        for (int i = 0; i < items.size(); i++) {
            Newsletter item = items.get(i);
            
            data[i][0] = item.getName();
            data[i][1] = "Subscribe/Unsubscribe";
            data[i][2] = "Open";
            
            
        }
        return data;
    }
    public static Object[][] convertCD(ArrayList<PhysicalItem> items) {
        Object[][] data = new Object[items.size()][3];
        for (int i = 0; i < items.size(); i++) {
            PhysicalItem item = items.get(i);
            
            data[i][0] = item.getName();
            data[i][1] = item.getDollarAmount();
            data[i][2] = "Purchase";
            
            
        }
        return data;
    }

    
}
