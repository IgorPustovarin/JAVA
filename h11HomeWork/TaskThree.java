// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
package h11HomeWork;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Введи первое число ");
        int num1 = number1.nextInt();
        System.out.println("Введите знак ");
        char c = number1.next().charAt(0);
        System.out.println("Введите второе число ");
        int num2 = number1.nextInt();
        number1.close();
        System.out.println("Выполним выражение " + num1 + " " + c + " " + num2 + " = " );
        if (c == '+'){
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (c == '-'){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (c == '*'){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (c == '/'){
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    
    }
    
}
