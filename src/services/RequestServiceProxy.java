package services;

import database_access.QueryUtilities;
import models.Request;

public class RequestServiceProxy implements RequestMethod {

	private RequestService rs;

	@Override
	public void addRequest(Request r) {
		if (rs == null) {
			rs = RequestService.getInstance();
		}
		QueryUtilities q = new QueryUtilities();
		try {
			r.setRequester(q.getUser(r.getId()));
		} catch (Exception e) {

		}

		if (r.getType().equals("Course")) {
			r.setPriority(1);
		} else
			r.setPriority(0);

		rs.addRequest(r);

	}

}
