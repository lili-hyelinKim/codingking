import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] charArray = s.toCharArray();

        // 문자 배열을 정렬
        Arrays.sort(charArray);

        // 역순으로 정렬된 문자 배열을 문자열로 변환하여 반환
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}