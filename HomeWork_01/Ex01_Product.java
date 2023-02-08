package Examples.HomeWork_01;
import java.util.Scanner;
public class Ex01_Product {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        System.out.println(factorial(n));
    }
    private static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n - 1);

    }
}
