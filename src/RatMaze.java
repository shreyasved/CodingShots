import java.util.ArrayList;

public class RatMaze {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        arr[0] = new int[] {1,0,0,0};
        arr[1] = new int[] {1,1,0,1};
        arr[2] = new int[] {1,1,0,0};
        arr[3] = new int[] {0,1,1,1};
        findSum(arr, 4);
    }

    public static ArrayList<String> findSum(int[][] arr, int n) {
        ArrayList < String > result = new ArrayList();
        int[][] visited = new int[n][n];

        for(int i=0 ; i<n; i++) {
            visited[i] = new int[n];
        }
        helper(arr, n , visited, 0, 0);
        return result;
    }

    public static void helper(int[][] arr, int n, int[][] visited, int x, int y) {

        if(x == n - 1 && y == n - 1) {
            visited[x][y] = 1;
            printSolution(visited, n);
        }

        if(x >= n || y >= n || x < 0 || y < 0 || arr[x][y] == 0 || visited[x][y] == 1)
            return;
        visited[x][y] = 1;
        helper(arr, n , visited, x, y - 1);
        helper(arr, n , visited, x, y + 1);
        helper(arr, n , visited, x - 1, y);
        helper(arr, n , visited, x + 1, y);
        visited[x][y] = 0;
    }

    public static void printSolution(int[][] solution, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(solution[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
