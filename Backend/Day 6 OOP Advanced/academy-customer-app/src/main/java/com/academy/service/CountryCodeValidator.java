package com.academy.service;

import com.academy.entity.CountryCode;
import com.academy.exception.InvalidCountryCodeException;

public class CountryCodeValidator extends Validator<String>{
    @Override
    void validate(String attribute) {
        if (countryCode != null && !countryCode.isEmpty()) {
            try {
                CountryCode.valueOf(countryCode);
            } catch (IllegalArgumentException e) {
                throw new InvalidCountryCodeException(countryCode);
            }
        }
    }
}
