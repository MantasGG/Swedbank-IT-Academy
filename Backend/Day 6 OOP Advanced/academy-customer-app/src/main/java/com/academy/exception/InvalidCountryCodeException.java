package com.academy.exception;

import com.academy.exception.MandatoryValueMissingException;

public class InvalidCountryCodeException extends MandatoryValueMissingException {

    public InvalidCountryCodeException(String message) {
        super("Country code can not be parsed from: " + message);
    }
}
