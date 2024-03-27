class Solution {
    public static String solution(String phoneNumber) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phoneNumber.length() - 4; i++) {
            result.append("*");
        }
        result.append(phoneNumber.substring(phoneNumber.length() - 4));
        return result.toString();
    

    }
}