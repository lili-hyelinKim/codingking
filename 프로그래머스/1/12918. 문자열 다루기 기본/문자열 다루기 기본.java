class Solution {
    public boolean solution(String s) {
        int count=0;
        if(s.length()==4 || s.length()==6){
            for(int i=0;i<s.length(); i++){
                if((s.charAt(i)-'0') >= 0 && (s.charAt(i)-'0') <=9)
                    count++;
            }
        }
        if(s.length()==count) return true;
        else return false;
    }
}