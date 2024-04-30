class Solution {
    public int solution(int number, int limit, int power) {
        int[] answer = new int[number];
        int result = 0;
        
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                answer[j - 1]++;
            }
        }
        
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] > limit) {
                answer[i] = power;
            }
            result += answer[i];
        }
        
        return result;
    }
}
