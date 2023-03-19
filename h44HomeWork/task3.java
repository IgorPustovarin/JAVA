// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример // 1 // + // 2 // ответ: // 3  // + // 4 // ответ: // 7 // Отмена

package h44HomeWork;

import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        while(true){
            String n = iscan.nextLine();
            if (n.equals("stop")){
                break;
            }
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
    
}
// public static void main(String[] args) {
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