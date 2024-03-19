package models;

import models.Users.User;

public class Request implements Comparable<Request> {

	public String userId;
	public String bookId;
	public String request_type;

	// Priority is 0 or 1. 1 for courses, 0 for anything else
	public int priority;
	public User requester;

	public Request(String itemId, String userId, String type) {
		this.userId = userId;
		this.bookId = itemId;
		this.request_type = type;
	}

	public String getId() {
		return this.userId;

	}

	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String id) {
		this.bookId = id;
	}

	public User getRequester() {
		return this.requester;
	}

	public void setRequester(User s) {
		this.requester = s;

	}

	public String getType() {

		return this.request_type;
	}

	public void setPriority(int a) {
		this.priority = a;
	}

	public void setType(String type) {
		this.request_type = type;

	}

	@Override
	public int compareTo(Request o) {

		return -(Integer.compare(this.priority, o.priority));

	}
}
