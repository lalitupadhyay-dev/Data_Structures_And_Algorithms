package Backtracking;

import java.util.ArrayList;

public class RatInTheMaze {

    static void findPath (int i, int j, int n, int m, int[][] maze, ArrayList<Character> path) {

        if ((i == n - 1) && (j == m - 1)) {
            System.out.println(path);
            return;
        }

        if (i > n || j > m) {
            return;
        }

        path.add('R');
        findPath(i, j + 1, n, m, maze, path);
        path.removeLast();

        path.add('D');
        findPath(i + 1, j, n, m, maze, path);
        path.removeLast();

    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        ArrayList<Character> path = new ArrayList<>();
        int[][] maze = new int[n][m];

        findPath(0, 0, n, m, maze, path);

    }
}
