package ru.job4j.ex.users;

public class UserInvalidException extends UserNotFoundException {

    public UserInvalidException(String message) {
        super(message);
    }

}
