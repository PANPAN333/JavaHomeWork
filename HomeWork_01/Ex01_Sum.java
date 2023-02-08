package Examples.HomeWork_01;

import java.util.Scanner;

/**
 * Ex01_Sum
 */
public class Ex01_Sum {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        System.out.println(sum(n));
    }
    public static int  sum(int n){
        if(n == 1) return 1;
        return n + sum(n - 1);
    }
}