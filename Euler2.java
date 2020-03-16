/**
 * Solution to Problem 2
 * 
 * Haadi
 */

public class Euler2 {
    public static void main(String[] args) {
        int i = 0;
        long total = 0;
        while(fibonacci(i) < 4000000) {
            i++;
            if(fibonacci(i) % 2 == 0) 
                total += fibonacci(i);
        }
        System.out.println(total);
    }

    public static int fibonacci(int termNumber) {
        if (termNumber <= 1)
            return termNumber;
        return fibonacci(termNumber - 1) + fibonacci(termNumber - 2);
    }
}