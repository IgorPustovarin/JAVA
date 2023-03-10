// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package HomeWork1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.print("Введи число n ");
        int number = number1.nextInt();
        int result = 1;
        int resultFak = 1;
        number1.close();
        for (int i = 2; i <= number; i++) {
            result = result + i;
            resultFak = resultFak * i;            
        }
        System.out.println("Сумма равна " + result);
        System.out.println("Факториал равен " + resultFak);
    }
    
}
