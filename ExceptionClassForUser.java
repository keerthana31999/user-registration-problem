package com.junittest;

public class ExceptionForUserInputs extends Exception {
    exceptionType type;

    public ExceptionForUserInputs(exceptionType type, String message) {
        super(message);
        this.type = type;
    }

    enum exceptionType {

        given_null_input,

        given_empty_input
    }
}
