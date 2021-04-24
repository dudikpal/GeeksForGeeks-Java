package school.printthepatternset1;

public class PrintThePatternSet1 {

    String printPat(int n)
    {
        // Your code here
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                for (int k = 0; k < i; k++) {

                    sb.append( j + " ");
                }
            }
            sb.append("$");
        }
        return sb.toString();
    }
}
