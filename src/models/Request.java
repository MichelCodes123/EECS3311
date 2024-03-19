package models;

import java.util.Comparator;

import models.Users.User;

public class Request implements Comparator<Request> {

	public String userId;
	public String bookId;
	public String request_type;
	public int priority;
	// Priority is 1,2 or 3
	public User requester;

	public Request(String itemId, String userId) {
		this.userId = userId;
		this.bookId = itemId;
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

	@Override
	public int compare(Request o1, Request o2) {
		return Integer.compare(o1.priority, o2.priority);

	}
}
