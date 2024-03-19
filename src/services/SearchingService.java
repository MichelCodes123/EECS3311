package services;

import database_access.QueryUtilities;
import models.Items.PhysicalItems.Book;
import models.Items.PhysicalItems.PhysicalItem;
import java.util.ArrayList;
import org.apache.commons.text.similarity.LevenshteinDistance;


public class SearchingService {

    public static ArrayList<Book> search(String query) throws Exception {
        ArrayList<Book> results = new ArrayList<>();
        QueryUtilities utils = new QueryUtilities();

        ArrayList<PhysicalItem> all_physical_items = utils.allPhysicalItems();

        for (PhysicalItem item : all_physical_items) {
            if (item instanceof Book && query.equals(item.getName()) )  {
                results.add((Book) item);
            }
        }

        // ...

                for (PhysicalItem item : all_physical_items) {
                    // Use Levenshtein Distance to compare strings
                    // Metric here is that less than 7 changes to a string will make a string sufficiently similar to the query

                    LevenshteinDistance similarity = new LevenshteinDistance();
                    Integer similarity_index = similarity.apply(query, item.getName());

                    if (item instanceof Book && similarity_index < 7 && !results.contains(item) )  {
                        results.add((Book) item);
                    }
                }

        return results;
    }

}
