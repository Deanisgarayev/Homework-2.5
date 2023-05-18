package com.springwork.homework25;

public class SpellingException extends RuntimeException{
    public SpellingException(String message) {
        super(message);
    }

    public SpellingException(String message, Throwable cause) {
        super(message, cause);
    }
}
