class Solution {
    public int solution(int[] number) {
        int answer;
        int count=0;
        for(int i=0; i<number.length;i++){
            for(int j=i+1; j<number.length; j++){
                for(int k=j+1; k<number.length; k++){
                    answer = 0;
                    answer=number[i]+number[j]+number[k];
                    if(answer==0) count++;
                }
            }
        }
        return count;
    }
}