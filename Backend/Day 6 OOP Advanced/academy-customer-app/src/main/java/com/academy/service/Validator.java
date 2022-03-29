package com.academy.service;

public abstract class Validator<T> {
    abstract void validate(T attribute);
}
