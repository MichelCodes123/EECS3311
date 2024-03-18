package services.itemstrategy;

import models.Request;

public class RequestBook implements ItemStrategy {

    public void execute(String item_id, String user_id)  throws Exception {

        Request r = new Request(item_id, user_id);

    }
}
