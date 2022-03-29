package com.academy.service;

import com.academy.exception.CustomerNotAdultException;

public class CustomerAdultValidator extends Validator<Integer>{
    @Override
    void validate(Integer attribute) {
        if (customer.getAge() < 18) {
            throw new CustomerNotAdultException();
        }
    }
}
