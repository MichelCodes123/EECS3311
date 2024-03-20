package models.TextbookObserver;

import Prompts.SystemPrompts;

public interface TextbookObserver {
    String update(SystemPrompts prompt);
    
}
