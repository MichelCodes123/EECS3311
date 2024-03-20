package models.LibraryItem;

public class ItemIdGenerator {
    private static ItemIdGenerator instance;
    private int currentId;
    private ItemIdGenerator() {
        currentId = 0;
    }

    public static ItemIdGenerator getInstance() {
        if (instance == null) {
            instance = new ItemIdGenerator();
        }
        return instance;
    }

    public String generateId() {
        return Integer.toString(currentId++);
    }
}
