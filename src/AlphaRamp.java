public class AlphaRamp {

    public static void main(String[] args) {
        int n = 3;

        int start = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (start));
            }
            start++;
            System.out.println();
        }

    }

}
