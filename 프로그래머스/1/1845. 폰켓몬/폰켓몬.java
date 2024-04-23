import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int maxpoketmon =nums.length/2;
        Set<Integer> set = new TreeSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        if(maxpoketmon <= set.size()){
            answer = maxpoketmon;
        }else {
            answer = set.size();
        }
        return answer;
    }
}