package Prompts;

public abstract class SystemPrompts {
    String message;

    public SystemPrompts(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }

}
