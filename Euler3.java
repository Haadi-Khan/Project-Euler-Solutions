/**
 * Solution to Problem 3
 * 
 * Haadi
 */

public class Euler3 {
   public static void main(String args[]){
      long number = 600_851_475_143L;
      
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}