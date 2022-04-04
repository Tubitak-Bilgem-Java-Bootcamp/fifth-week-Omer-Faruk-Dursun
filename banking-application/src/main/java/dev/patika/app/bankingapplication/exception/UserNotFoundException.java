package dev.patika.app.bankingapplication.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id) {
        super("Could not find user with the id : " + id);
    }
}
