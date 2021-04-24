package school.printthepatternset1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintThePatternSet1Test {

    @Test
    void printPat() {

        String expected = "3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $";

        assertEquals(expected, new PrintThePatternSet1().printPat(3));
    }


    @Test
    void printPat2() {

        String expected = "2 2 1 1 $2 1 $";

        assertEquals(expected, new PrintThePatternSet1().printPat(2));
    }
}