package services;

import models.Request;

public class RequestServiceProxy implements RequestMethod {

    private RequestService rs;


    @Override
    public void addRequest(Request r){
        if (rs == null){
            rs = RequestService.getInstance();
        }



    }


}
