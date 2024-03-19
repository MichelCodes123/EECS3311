package models.Items.PhysicalItems;

import java.util.Date;
import java.util.List;

import models.FacultyObserver.FacultyObserver;
import models.LibraryManagementTeam.LibraryManagementTeam;
import models.LibraryManagementTeam.LibraryManagementTeamObserver;

public class Textbook extends Book {
    private List<FacultyObserver> facultyObservers;
    private List<LibraryManagementTeamObserver> libraryObservers;
    private boolean available;

    public Textbook(String id, String name, String location, Boolean can_purchase, Long due_date, Double dollar_amount) {
        super(id, name, location, can_purchase, due_date, dollar_amount);
    }

    public void addObserver(FacultyObserver facultyObserver) {
        facultyObservers.add(facultyObserver);
    }

    public void addLibraryObserver(LibraryManagementTeam libraryManagementTeam) {
        libraryObservers.add(libraryManagementTeam);
    }

    public void setAvailability(boolean available) {
        this.available = available;
        if (available) {
            notifyFacultyObservers();
        } else {
            notifyLibraryObservers();
        }
    }

    public boolean isAvailable() {
        return available;
    }

    private void notifyFacultyObservers() {
        for (FacultyObserver observer : facultyObservers) {
            observer.update(this);
        }
    }

    private void notifyLibraryObservers() {
        for (LibraryManagementTeamObserver observer : libraryObservers) {
            observer.update(this);
        }
    }

}
