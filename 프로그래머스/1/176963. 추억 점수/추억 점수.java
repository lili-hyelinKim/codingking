import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            nameMap.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            
            int total = 0;
            for (String person : photo[i]) {
                total += nameMap.getOrDefault(person, 0);
            }
            answer[i] = total;
        }
        
        return answer;
    }
}