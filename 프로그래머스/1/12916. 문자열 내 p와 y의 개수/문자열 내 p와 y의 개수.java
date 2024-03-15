class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.toLowerCase().charAt(i);
            
            if(ch=='p') countP++;
            else if(ch=='y') countY++;
        }
        
        if(countP==countY) return true;
        else return false;
    }
}