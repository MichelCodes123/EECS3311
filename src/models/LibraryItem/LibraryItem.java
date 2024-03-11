package models.LibraryItem;

public class LibraryItem {
    private int id;
    private String name;
    private String location;
    private boolean canBePurchased;

    public LibraryItem(String name, String location, boolean canBePurchased) {
        this.id = ItemIdGenerator.getInstance().generateId();
        this.name = name;
        this.location = location;
        this.canBePurchased = canBePurchased;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isCanBePurchased() {
        return canBePurchased;
    }
    public void setCanBePurchased(boolean canBePurchased) {
        this.canBePurchased = canBePurchased;
    }
}
