package services;

import java.util.PriorityQueue;

import models.Request;

public class RequestService implements RequestMethod {

	private static RequestService r = null;
	public PriorityQueue<Request> requestQueue = new PriorityQueue<Request>();

	public static RequestService getInstance() {
		if (r == null) {
			r = new RequestService();
		}
		return r;
	}

	@Override
	public void addRequest(Request r) {

		requestQueue.add(r);

	}

}
