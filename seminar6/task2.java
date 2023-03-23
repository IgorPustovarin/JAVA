// 1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
// в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
package seminar6;

import java.util.TreeSet;

public class task2 {
    public static void main(String[] args) {
        int len = 133;
        int[] original = new int [len];
        original = fillArray(original, 0, 100);
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.printf("%.2f %%\n", countUnique(original));//.2f указывает на два знака после запятой
    }
    public static int[] fillArray(int[] array, int min, int max){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max + 1 - min)) + min;//max + 1 массив до 100 включительно заполняется
        }                   //////////////////////////////////////////Random ran = new Random();Второй вариант генерации случайного числа в цикле
        return array;/////////////////////////////////////////////////array_to_fill.add(ran.nextInt(0, 100));
    }
       
    public static double countUnique(int[] array){
        TreeSet<Integer> unique = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            unique.add(array[i]);
        }
        System.out.println(unique);
        return (double) unique.size() * 100 / array.length; 
        
    }
}
