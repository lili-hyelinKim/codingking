class Solution {
    public String solution(int n) {
        String answer = "";
        String h="수";
        String z="박";
        for(int i=1;i<=n;i++){
            if(i%2!=0) answer+=h;
            else answer+=z;
        }
        return answer;
    }
}