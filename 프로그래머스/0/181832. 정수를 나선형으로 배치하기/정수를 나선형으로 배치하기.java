public class Solution {
    public static int[][] solution(int n) {
        int[][] spiral = new int[n][n];
        int num = 1;
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;

        while (num <= n * n) {
            // 왼쪽에서 오른쪽으로 이동
            for (int i = leftCol; i <= rightCol; i++) {
                spiral[topRow][i] = num++;
            }
            topRow++;

            // 위쪽에서 아래쪽으로 이동
            for (int i = topRow; i <= bottomRow; i++) {
                spiral[i][rightCol] = num++;
            }
            rightCol--;

            // 오른쪽에서 왼쪽으로 이동
            for (int i = rightCol; i >= leftCol; i--) {
                spiral[bottomRow][i] = num++;
            }
            bottomRow--;

            // 아래쪽에서 위쪽으로 이동
            for (int i = bottomRow; i >= topRow; i--) {
                spiral[i][leftCol] = num++;
            }
            leftCol++;
        }

        return spiral;
    }
}