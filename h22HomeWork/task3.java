// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package h22HomeWork;


public class task3 {
     public static void main(String[] args) {
         String palindrom = "123311";
         System.out.println(isPalindrom(palindrom));
     }    
     public static boolean isPalindrom(String example) {
         for (int i = 0; i < example.length() / 2; i++) {
             if (example.charAt(i) != example.charAt(example.length() - i - 1)) return false;
         }
         return true;
     }
}
