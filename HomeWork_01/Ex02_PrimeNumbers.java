package Examples.HomeWork_01;

public class Ex02_PrimeNumbers {
    public static void main(String[] args) {
        
        for (int i = 2; i <= 1000; i++) {
            boolean simple = false;

            for (int j = 2; j * j <= i; j++) {
                simple = (i % j == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(i + " ");
            }
        }
    }
}
