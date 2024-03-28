import java.util.Arrays;

public class Teleportation {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[0] = new int[] {0,0,0,0,0};
        arr[1] = new int[] {0,1,0,0,0};
        arr[2] = new int[] {0,0,0,0,0};
        arr[3] = new int[] {0,0,1,0,0};
        arr[4] = new int[] {0,0,0,0,0};
        String path = "DRDRUUULL";
        int[] startPos = new int[]{0,0};
        int[] portalEntry = new int[]{1,1};
        int[] portalExit = new int[]{3,2};
        printDestination(arr, path, startPos, portalEntry, portalExit);
    }

    public static void printDestination(int[][] arr, String path, int[] startPos, int[] portalEntry, int[] portalExit) {
        char[] charPath = path.toCharArray();
        int[] finalPos = new int[2];
        int[] newPos = new int[2];
        newPos = startPos;
        int y = startPos[0];
        int x = startPos[1];

        for (char c : charPath) {
            if (c == 'D' && y <= arr.length - 1) {
                y = newPos[0] + 1;
            } else if (c == 'U' && y >= 0) {
                y = newPos[0] - 1;
            } else if (c == 'R' && x <= arr.length - 1) {
                x = newPos[1] + 1;
            } else if (c == 'L' && x >= 0) {
                x = newPos[1] - 1;
            }
            newPos[0] = y;
            newPos[1] = x;

            if(Arrays.equals(newPos, portalEntry)) {
                newPos = portalExit.clone();
                //System.out.println("Portal found" + Arrays.toString(newPos));
                y = newPos[0];
                x = newPos[1];
            } else if(Arrays.equals(newPos, portalExit)) {
                newPos = portalEntry.clone();
                //System.out.println("Portal found" + Arrays.toString(newPos));
                y = newPos[0];
                x = newPos[1];
            }

        }
        finalPos = newPos;
        System.out.println("Final pos" + Arrays.toString(finalPos));
    }

}
