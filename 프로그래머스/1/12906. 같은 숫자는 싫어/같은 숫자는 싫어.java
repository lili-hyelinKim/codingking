import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> resultList = new ArrayList<>();
        
        resultList.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                resultList.add(arr[i]);
            }
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}