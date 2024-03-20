package models.LibraryManagementTeam;

import Prompts.SystemPrompts;

public class LibraryManagementTeam implements LibraryManagementTeamObserver {
    private String lastNotification;

	 @Override
     public String update(SystemPrompts prompt) {
        return lastNotification = "Library Management Team Notification: " + prompt.getMessage();
    }

	 public String getLastNotification() {
	    return lastNotification;
	}
}
