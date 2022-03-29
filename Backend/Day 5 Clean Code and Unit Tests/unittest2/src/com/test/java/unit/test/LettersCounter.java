package java.unit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LettersCounter {

    private LettersCounter lettersCounter;

    @BeforeEach
    public void initCounter(){
        lettersCounter = new LettersCounter();
    }

    @Test
    public void Should_ThrowIllegalArgumentException_When_TextIsNull(){
        char character = 'd';
        String text = null;
        String expected = String.format("Method input parameter character was = %s and text was %s",
                character, text);

        Throwable actual = assertThrows(IllegalArgumentException.class, () -> {
            lettersCounter.countCharacters(char,text)
            assertEquals(expected)
        })
    }














}
