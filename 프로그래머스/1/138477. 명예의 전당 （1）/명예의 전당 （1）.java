import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        LinkedList<Integer> list = new LinkedList();
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            for(int j=0; j<=i; j++){
                list.add(score[j]);
            }
                Collections.sort(list);
                Collections.reverse(list);
                
                if(i<k){
                    answer[i]=list.getLast();
                }else{
                    answer[i]=list.get(k-1);
                }
            list.clear();
        }
        return answer;
    }
}