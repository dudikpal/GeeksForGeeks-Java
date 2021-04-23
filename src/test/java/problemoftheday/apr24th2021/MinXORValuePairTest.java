package problemoftheday.apr24th2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinXORValuePairTest {

    @Test
    void minxorpair() {

        int[] arr = {9, 5, 3};
        int length = arr.length;
        int expected = 6;

        assertEquals(expected, MinXORValuePair.minxorpair(length, arr));

    }
}