class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int data : arr){
            answer+=data;
        }
        answer = answer/arr.length;
        return answer;
    }
}