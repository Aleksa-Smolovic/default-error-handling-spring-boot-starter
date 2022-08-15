package com.xlea.me.defaulterrorhandling.exception;

public class EntityNotFoundException extends RuntimeException {

    private String identifier;
    private String name;

    @Override
    public String getMessage() {
        return String.format("Entity '%s' with identifier: '%s' was not found", name, identifier);
    }

    public EntityNotFoundException(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
}
