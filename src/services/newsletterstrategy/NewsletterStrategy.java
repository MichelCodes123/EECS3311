package services.newsletterstrategy;

public interface NewsletterStrategy {

    public void execute(String letter, String user_id) throws Exception;
}
