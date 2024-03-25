class Solution {
    public int solution(int a, int b, int n) {
        int totalColas = 0;
        
        // 보유 중인 빈 병이 a개 이상일 때만 콜라를 받을 수 있음
        while (n >= a) {
            // 빈 병 a개를 가져다주면 콜라 b병을 받음
            int colaFromEmptyBottles = n / a * b;
            totalColas += colaFromEmptyBottles;
            
            // 마신 콜라의 병과 가져다준 빈 병을 합산하여 다음에 가져갈 빈 병 수 계산
            n = colaFromEmptyBottles + n % a;
        }
        
        return totalColas;
    }
}