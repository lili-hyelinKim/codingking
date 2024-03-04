import java.util.*;

class Solution {
    public int solution(int n) {
        LinkedList <Integer> list = new LinkedList();
        int answer=0;
        while(n>=3){
            list.add(n%3);
            n/=3;
        }
        list.add(n);

        int digit = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i) * digit;
            digit *= 3;
        }
        return answer;
    }
}