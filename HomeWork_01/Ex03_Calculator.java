package Examples.HomeWork_01;

import java.util.Scanner;
public class Ex03_Calculator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        double oneValue, secondValue, result;
        char operator;

        System.out.println("Введите первое значение: ");
        oneValue = iScanner.nextDouble();

        System.out.println("Введите второе значение: ");
        secondValue = iScanner.nextDouble();

        System.out.println("Введите оператор: ");
        operator = iScanner.next().charAt(0);
        switch(operator) {
            case '+': result = oneValue + secondValue;
               break;
            case '-': result = oneValue - secondValue;
               break;
            case '*': result = oneValue * secondValue;
               break;
            case '/': result = oneValue / secondValue;
               break;
            default: System.out.printf("Ошибка! Введите оператор");
               return;            
        }
        System.out.println(oneValue + " " + operator + " " + secondValue + " = " + result);


        


    }
}
