package ScrabbleCalculator;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {



    @Test
    void calculateScore_SixLetterWord() {
        Calculation w1 = new Calculation("accept");
        assertEquals(12, w1.calculateScore());
    }



    @Test
    void calculateScore_LongWord() {
        Calculation w1 = new Calculation("Impedimenta");
        assertEquals(18, w1.calculateScore());
    }

    @Test
    void calculateScore_ShortWord() {
        Calculation w1 = new Calculation("The");
        assertEquals(6, w1.calculateScore());
    }

    @Test
    void calculateScore_OneLetterWord() {
        Calculation w1 = new Calculation("A");
        assertEquals(1, w1.calculateScore());
    }

    @Test
    void calculateScore_Special() {
        Calculation w1 = new Calculation("Hello!");
        assertEquals(8, w1.calculateScore());
    }

    @Test
    void calculateScore_EmptyString() {
        Calculation w1 = new Calculation("");
        assertEquals(0,w1.calculateScore());
    }


    @Test
    void calculateScore_Uppercase_Lowercase() {
        Calculation w1 = new Calculation("HELLO"); //ALL UPPERCASE
        Calculation w2 = new Calculation("hello"); //all lowercase
        assertEquals(w1.calculateScore(),w2.calculateScore());
    }


}


