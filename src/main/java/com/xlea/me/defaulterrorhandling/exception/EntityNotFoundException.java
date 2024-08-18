package com.xlea.me.defaulterrorhandling.exception;

import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends BadActionException {

    private static final int NOT_FOUND_STATUS = HttpStatus.NOT_FOUND.value();
    private static final String ENTITY_MISSING_CODE = "entity-missing";

    public EntityNotFoundException(String identifier) {
        super(NOT_FOUND_STATUS, ENTITY_MISSING_CODE, "Entity with identifier: " + identifier + " was not found!");
    }

    public EntityNotFoundException(Long identifier) {
        this(identifier.toString());
    }

    public EntityNotFoundException(String entityName, String identifier) {
        super(NOT_FOUND_STATUS, ENTITY_MISSING_CODE, "Entity '" + entityName + "' with identifier " + identifier + " was not found!");
    }

    public EntityNotFoundException(String entityName, Long identifier) {
        this(entityName, identifier.toString());
    }

}
