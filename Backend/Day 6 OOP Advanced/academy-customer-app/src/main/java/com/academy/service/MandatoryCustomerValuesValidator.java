package com.academy.service;

import com.academy.entity.Customer;
import com.academy.exception.CustomerNotAdultException;
import com.academy.exception.MandatoryValueMissingException;

public class MandatoryCustomerValuesValidator extends Validator<Customer> {

    @Override
    void validate(Customer attribute) {
        if (!isValidString(customer.getFirstName())) {
            throw new MandatoryValueMissingException("Missing first name");
        }

        if (!isValidString(customer.getLastName())) {
            throw new MandatoryValueMissingException("Missing last name");
        }

        if (!isValidString(customer.getPersonalNumber())) {
            throw new MandatoryValueMissingException("Missing personal number");
        }


    }
    private boolean isValidString(String string) {
        return string != null && !string.trim().isEmpty();
    }
}
