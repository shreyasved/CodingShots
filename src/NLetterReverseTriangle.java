public class NLetterReverseTriangle {

    public static void main(String[] args) {
        int n = 3;
        int start = 65;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print((char)(start++));
            }
            start = 65;
            System.out.println();
        }
    }

}
