package ru.bmstu.service;

public class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
