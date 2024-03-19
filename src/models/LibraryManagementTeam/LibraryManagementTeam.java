package models.LibraryManagementTeam;

import models.Items.PhysicalItems.Textbook;

public class LibraryManagementTeam implements LibraryManagementTeamObserver {
    private String lastNotification;

	 @Override
	public String update(Textbook textbook) {
	    lastNotification = "Library Management Team Notification: Textbook '" + textbook.getName() + "' is not available.";
	    return lastNotification;
	}

	 public String getLastNotification() {
	    return lastNotification;
	}
}
