// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит
// из чередующихся символов c1 и c2, начиная с c1.
// package seminar2;

// public class lec {
//     public static void main(String[] args) {
//         char c1 = 'a';
//         char c2 = 'b';
//         int N = 6;
//         StringBuilder newString = new StringBuilder();
//         for (int i = 0; i < N /2 ; i++) {
//             newString.append(c1).append(c2);
//             // newString.append(c1);
//             // newString.append(c2);            
//         }
//         System.out.println(newString);
//     }
    
// }

// Напишите метод, который сжимает строку.


// Пример: вход aaaabbbcaaadd.
// // результат - a4b3ca3d2
// package seminar2;

/**
//  * lec
//  */
// public class lec {
//     public static void main(String[] args) {
//         String myString = "aaabbcaaaahh";
//         StringBuilder resString = new StringBuilder();
//         int count = 1;
//         for (int i = 0; i < myString.length() - 1; i++) {
//             if (myString.charAt(i + 1) == myString.charAt(i)){
//                 count++;
//             }
//             else {
//                 if (count == 1) resString.append(myString.charAt(i));
//                 else {
//                 resString.append(myString.charAt(i)).append(count);
//                 count = 1;
//                 }
//             }            
//         }
//         if (count == 1) resString.append(myString.charAt(myString.length()-1));
//         else {
//         resString.append(myString.charAt(myString.length()-1)).append(count);
//         }
//         System.out.println(resString);
//     }    
// }

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

package seminar2;

// import java.io.File;
// import java.io.PrintWriter;
import java.io.FileWriter;

/**
 * lec
 */
// public class lec {
//     public static void main(String[] args) {
//         String palindrom = "123311";
//         System.out.println(isPalindrom(palindrom));
//     }    
//     public static boolean isPalindrom(String example) {
//         for (int i = 0; i < example.length() / 2; i++) {
//             if (example.charAt(i) != example.charAt(example.length() - i - 1)) return false;
//         }
//         return true;
//     }
// }

// Записать в простой текстовый файл слово TEST 10 раз, обработайте исключения.

/**
 * lec
 */
public class lec {
    public static void main(String[] args) {
        String line = "TEST\n";
        int num = 10;
        try {
            FileWriter file = new FileWriter("test.txt", false);
            for (int i = 0; i < num; i++){
                file.write(line);
            }
            file.close();
        }
        catch (Exception e){
            System.out.println("Что-то пошло не так!");            
        }
    }
}