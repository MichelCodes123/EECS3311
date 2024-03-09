package models.LibraryItem;

public class ItemIdGenerator {
    private static ItemIdGenerator instance;
    private int currentId;
    private ItemIdGenerator() {
        currentId = 1;
    }

    public static ItemIdGenerator getInstance() {
        if (instance == null) {
            instance = new ItemIdGenerator();
        }
        return instance;
    }

    public int generateId() {
        return currentId++;
    }
}
