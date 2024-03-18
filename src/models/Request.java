package models;

import models.Items.PhysicalItems.Book;
import models.Users.User;

import java.util.Comparator;

public class Request implements Comparator<Request> {

    public String id;
    public Book book;
    public int request_type;
    //Priority is 1,2 or 3
    public User requester;

    public String getId(){
        return this.id;

    }
    public Book getBook(){
        return this.book;
    }

    @Override
    public int compare(Request o1, Request o2) {
        return Integer.compare(o1.request_type, o2.request_type);

    }
}
