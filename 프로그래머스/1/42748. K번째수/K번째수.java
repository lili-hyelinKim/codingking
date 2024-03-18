import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            // 부분 배열 추출
            int[] subArray = Arrays.copyOfRange(array, i - 1, j);
            
            // 정렬
            Arrays.sort(subArray);
            
            // k번째 원소 저장
            answer[idx] = subArray[k - 1];
        }

        return answer;
    }
}