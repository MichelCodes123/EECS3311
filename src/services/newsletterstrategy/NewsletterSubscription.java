package services.newsletterstrategy;

import database_access.*;
import models.Users.*;

import java.util.Objects;

public class NewsletterSubscription implements NewsletterStrategy {

    public void execute(String letter, String user_id) throws Exception {
        QueryUtilities utils = new QueryUtilities();
        User user = utils.getUser(user_id);
        user.add_subscription(letter);


        if (user instanceof Student) {
            StudentAccess db = StudentAccess.getInstance();
            db.update();
        }

        else if (user instanceof FacultyMember) {
            FacultyMemberAccess db = FacultyMemberAccess.getInstance();
            db.update();
        }

        else if (user instanceof Visitor) {
            VisitorAccess db = VisitorAccess.getInstance();
            db.update();
        }

        else {
            NonFacultyStaffAccess db = NonFacultyStaffAccess.getInstance();
            db.update();
        }
    }
}
