public class Euler4 {
    public static void main(String[] args) {
        mult();
    }

    private static void mult() {
        int currentPalindrome = 696; //teehee fune sex number

        for(int i = 100; i < 1000; i++) {

            for(int j = 100; j < 1000; j++) {

                if(isPalindrome(i*j) && i*j > currentPalindrome) //if the new the palindrome is greater than the last, make it the new palindrome
                    currentPalindrome = i*j;
                else
                    continue;
            }
        }
        System.out.println(currentPalindrome);
    }

    private static boolean isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (number > revertedNumber) {
            revertedNumber = revertedNumber * 10 + number % 10;
            number /= 10;
        }

        return number == revertedNumber || number == revertedNumber / 10;
    }
}