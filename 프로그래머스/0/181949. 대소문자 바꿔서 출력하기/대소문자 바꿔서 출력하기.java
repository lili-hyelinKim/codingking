import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder result = new StringBuilder(a.length());
        
        for(char c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        
        System.out.print(result.toString());
    }
}