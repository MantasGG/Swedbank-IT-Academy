package com.academy.exception;

import com.academy.exception.MandatoryValueMissingException;

public class CustomerNotAdultException extends MandatoryValueMissingException {
    public CustomerNotAdultException() {
        super("Customer not adult");
    }
}
