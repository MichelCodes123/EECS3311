package services;

import database_access.BookAccess;
import models.Request;
import models.Users.User;

import java.util.PriorityQueue;

public class RequestService implements RequestMethod {

    private static RequestService r;
    private static PriorityQueue <Request> requestQueue  =  new PriorityQueue<Request>();

    public static RequestService getInstance() {
        if (r == null) {
            r = new RequestService();
        }
        return r;
    }

    public void addRequest(Request r){

    }

}
