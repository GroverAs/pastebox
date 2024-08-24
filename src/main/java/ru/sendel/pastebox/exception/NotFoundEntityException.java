package ru.sendel.pastebox.exception;

public class NotFoundEntityException extends RuntimeException {
    public NotFoundEntityException(String string) {
        super(string);
    }
}
