package models.LibraryManagementTeam;

import models.Items.PhysicalItems.Textbook;

public interface LibraryManagementTeamObserver {
    String update(Textbook textbook);
}
