import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = String.valueOf(n);
        for(int i=0; i<result.length(); i++){
            char cc = result.charAt(i);
            
            answer += Integer.parseInt(String.valueOf(cc));
        }

        return answer;
    }
}