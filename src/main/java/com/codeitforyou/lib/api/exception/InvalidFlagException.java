package com.codeitforyou.lib.api.exception;

public class InvalidFlagException extends Exception {
    public InvalidFlagException(String errorMessage) {
        super(errorMessage + " is an unknown flag.");
    }
}
