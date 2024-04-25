class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i=0; i<num_str.length();i++){
            char cc = num_str.charAt(i);
            answer += Character.getNumericValue(cc); // 문자를 정수로 변환

        }
        return answer;
    }
}