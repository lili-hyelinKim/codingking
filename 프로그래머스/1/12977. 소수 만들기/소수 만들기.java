class Solution {
    public int solution(int[] nums) {
        int cnt=0; 
        int answer =0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    answer=nums[i]+nums[j]+nums[k];
                    if(isPrime(answer)){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    
    private boolean isPrime(int nums){
        for(int i=2; i<nums; i++){
            if(nums%i==0)
                return false;
        }
        return true;
    }
}