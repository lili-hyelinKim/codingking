class Solution {
    public static int solution(int[][] arr) {
        int n = arr.length;
        
        // 이차원 배열을 순회하면서 대칭 여부를 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0; // 대칭하지 않으면 0 반환
                }
            }
        }
        
        // 모든 요소가 대칭하면 1 반환
        return 1;
    }
}