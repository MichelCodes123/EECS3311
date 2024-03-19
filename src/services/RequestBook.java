package services;

import models.Request;

public class RequestBook {

	public static void execute(String item_id, String user_id, String type) {

		Request r = new Request(item_id, user_id, type);

		RequestServiceProxy rsp = new RequestServiceProxy();

		rsp.addRequest(r);
	}
}
