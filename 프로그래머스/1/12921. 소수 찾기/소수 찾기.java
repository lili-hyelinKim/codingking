class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                answer++;
            }
        }

        return answer;
    }

    // 주어진 숫자가 소수인지 확인하는 함수
    private boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
