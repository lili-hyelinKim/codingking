import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int[] sc2 = new int[k+1];
        for(int i=0; i<score.length; i++) sc2[score[i]]++; //점수배열 sc2 : sc2[점수]=갯수

        int sum=0, mod=0;
        for(int i=k; i>0; i--){         // 점수가 높은것부터 낮은순으로 박스에 담기
            sc2[i]=sc2[i] + mod;        // 남은 사과를 낮은사과 뭉치에 더한다
            sum += sc2[i]/m * m * i;    // sum+=(박스수x사과수x단가)
            mod = sc2[i]%m;             // 박스에 넣고 남은 사과수
        }
        return sum;
    }
}