import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b); // 두 문자열이 인덱스 n번째 글자가 동일한 경우, 전체 문자열을 비교하여 정렬
            } else {
                return Character.compare(a.charAt(n), b.charAt(n)); // 인덱스 n번째 글자를 기준으로 오름차순 정렬
            }
        });
        return strings;
    }
}