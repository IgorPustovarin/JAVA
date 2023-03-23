package seminar1;

import java.util.Arrays;

// import java.util.Scanner;

/**
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
 * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
// public class sem1 {
//     public static void main(String[] args) {
//         Scanner name = new Scanner(System.in);
//         System.out.print("Name is ");
//         String name1 = name.nextLine();
//         name.close();
//         System.out.println("Hello, " + name1);
//     }
    
// }
/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1,1,1,1,1], вывести максимальное количество подряд идущих 1.
 */
// public class sem1 {
//     public static void main(String[] args) {
//         int[] arg = {1,1,0,1,1,0,1,1,1,1,1,0,0,1};
//         int count = 0;
//         int max = 0;
//         for (int i = 0; i < arg.length - 1; i++) {
//             if (arg[i] == 1){
//                 count++;
//                 if (count > max){
//                     max = count;
//                 }
//             }
//             else count = 0;
            
//         }
//         System.out.println(Arrays.toString(arg));
//         System.out.println(max);
        
//     }

    
// }

// Дан массив nums = [3,2,2,3,4,1,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

// [2,2,4,1,3,3,3]
/**
 * sem1
 */
public class sem1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 3, 2, 3};
        int val = 3;
        int j = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
            {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
}