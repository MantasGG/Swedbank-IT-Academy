package com.itacademy.java.unit.test;

public class LettersCounter {

    public int countCharacters(char character, String text) {
        if (character == ' ' || text == null) {
            throw new IllegalArgumentException(String.format("Method input parameter character was = %s and text was %s",
                    character, text));
        }

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                counter++;
            }
        }

        return counter;
    }
}
