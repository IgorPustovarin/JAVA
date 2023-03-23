package seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

// import java.util.ArrayList;
// import java.util.LinkedList;

// public class sem4 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         LinkedList<Integer> linked_list = new LinkedList<Integer>();
//         long time_start_all = System.currentTimeMillis(); //Систем каронт замеряет время выполнения операции
//         for (int i = 0; i < 100_000; i++) {
//             list.add(0, i);
                        
//         }
//         long time_stop_all = System.currentTimeMillis();
//         long time_all = time_stop_all - time_start_all;
//         System.out.println(time_all);
//         long time_start_ll = System.currentTimeMillis();
//         for (int i = 0; i < 100_000; i++) {
//             linked_list.add(0, i);            
//         }
//         long time_stop_ll = System.currentTimeMillis();
//         long time_ll = time_stop_ll - time_start_ll;
//         System.out.println(time_ll);
//     }
    
// }

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида 

// text

// Нужно сохранить text в связный список.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет ее из списка.
/**
 * sem4
 */
// public class sem4 {
//     public static void main(String[] args) {
//         Scanner iscan = new Scanner(System.in);
//         LinkedList<String> ll = new LinkedList<>();
//         // ll.add("noting");
//         while(true){
//             String n = iscan.nextLine();
//             if(n.equals("stop")){
//                 break;
//             }
//             else{
//                 if(n.contains("print~")){                
//                     ArrayList<String> str = new ArrayList<>(Arrays.asList(n.split("~")));
//                     int a=Integer.parseInt(str.get(1));
//                     System.out.println(ll.get(a));
//                     ll.remove(a);
//                 }
//                 else{
//                     ll.add(n);
//                 }
//                 System.out.println(ll);
                
//             }
//         }
//         iscan.close();
//     }
    
// }

//Принимает от пользователя и "запоминает" строки.
// Если введено print, выводит строки так, чтобы последняя введеная была первой в списке, а первая - последней.

/**
 * sem4
 */
// public class sem4 {
//     public static void main(String[] args) {
//         Scanner iscan = new Scanner(System.in);
//         Stack<String> stack = new Stack<>();
//         while (true) {
//             String n = iscan.nextLine();
//             if (n.equals("stop")){
//                 System.out.println("The End");
//                 break;
//             }
//             else{
//                 if (n.equals("print")){
//                     while (!stack.isEmpty()) {
//                         System.out.println(stack.pop());                    
//                     }
//                     System.out.println("\n");
//                 }
//                 else{
//                     stack.push(n);
//                 }

//             }            
//         }
//     }
// }

/**
 * sem4
 */
public class sem4 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("asd", "sfggf", "GHFIK"));
        Stack<String> strStack= new Stack<>();
        for (String string : str) {
            strStack.push(string);            
        }
        while(!strStack.isEmpty()){
            System.out.println(strStack.pop());
        }
    }
}