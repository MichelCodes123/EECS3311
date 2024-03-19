package models.Items.PhysicalItems;

import java.util.ArrayList;
import java.util.List;

import Prompts.SystemNotifications;
import Prompts.SystemPrompts;
import models.LibraryManagementTeam.LibraryManagementTeam;
import models.LibraryManagementTeam.LibraryManagementTeamObserver;
import models.TextbookObserver.TextbookObserver;

public class Textbook extends Book {
    private List<TextbookObserver> facultyObservers;
    private List<LibraryManagementTeamObserver> libraryObservers;
    private boolean available;
    private String lastNotification;

    public Textbook(String id, String name, String location, Boolean can_purchase, Long due_date, Double dollar_amount) {
        super(id, name, location, can_purchase, due_date, dollar_amount);
        this.facultyObservers = new ArrayList<>();
        this.libraryObservers = new ArrayList<>();
        this.available = true; // Assume the textbook is initially available
    }
    
    public List<TextbookObserver> getFacultyObservers() {
        return facultyObservers;
    }

    public List<LibraryManagementTeamObserver> getLibraryObservers() {
        return libraryObservers;
    }

    public void addObserver(TextbookObserver facultyObserver) {
        facultyObservers.add(facultyObserver);
    }

    public void addLibraryObserver(LibraryManagementTeam libraryManagementTeam) {
        libraryObservers.add(libraryManagementTeam);
    }

    public void setAvailability(boolean available) {
        this.available = available;
        if (available) {
        	lastNotification = "New edition of textbook '" + getName() + "' is available.";
        } else {
        	 lastNotification = "Textbook '" + getName() + "' is not available.";
        }
        notifyObservers(new SystemNotifications(lastNotification));
    }

    public boolean isAvailable() {
        return available;
    }
    private void notifyObservers(SystemPrompts prompt) {
        for (TextbookObserver observer : facultyObservers) {
            observer.update(prompt);
        }
        for (LibraryManagementTeamObserver observer : libraryObservers) {
            observer.update(prompt);
        }
    }
}