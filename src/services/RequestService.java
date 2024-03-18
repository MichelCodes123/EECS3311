package services;

import database_access.BookAccess;
import models.Request;

import java.util.PriorityQueue;

public class RequestService {
    private static PriorityQueue <Request> requestQueue  =  new PriorityQueue<Request>();

    public static PriorityQueue<Request> getInstance() {
        if (requestQueue == null) {
            requestQueue = new PriorityQueue<Request>();
        }
        return requestQueue;
    }

}
