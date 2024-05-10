import java.util.Scanner;

public class Solution {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      
      for (Character data : a.toCharArray()) {
         if(Character.isLowerCase(data)) {
            data = Character.toUpperCase(data);
         }else if(Character.isUpperCase(data))
            data = Character.toLowerCase(data);
         System.out.print(data);
      
      } //for
   }
}