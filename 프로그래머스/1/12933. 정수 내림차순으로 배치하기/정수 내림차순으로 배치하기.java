import java.util.*;

class Solution {
    public long solution(long n) {
        LinkedList<Character> list = new LinkedList<>();
        String str = String.valueOf(n);
        
        for (int i = 0; i < str.length(); i++) {
           list.add(str.charAt(i));
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            sb.append(ch);
        }
        
        return Long.parseLong(sb.toString());
    }
}