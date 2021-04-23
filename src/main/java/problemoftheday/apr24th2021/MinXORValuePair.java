package problemoftheday.apr24th2021;

import javax.swing.*;

public class MinXORValuePair {

    static int minxorpair(int N, int arr[]){
        // code here
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            int actual = computeXOR(arr[i], arr[i + 1]);
            if (actual < minValue) {
                minValue = actual;
            }
        }
        return minValue;
    }

    private static int computeXOR(int x, int y) {
        return (x & (~y) | ((~x) & y));
    }
}
