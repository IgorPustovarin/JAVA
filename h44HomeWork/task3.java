// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример // 1 // + // 2 // ответ: // 3  // + // 4 // ответ: // 7 // Отмена

package h44HomeWork;

import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();        
        int i = 0;
        int result = 0;
        String n = iscan.next();
        System.out.println("Введи первое число ");                
        n = iscan.next();                
        ll.add(n);                
        Integer num1 = Integer.parseInt(ll.get(i));                
        i++;        
        while(true){            
            System.out.println("Начнем1");           
            System.out.println("Если нужно остановить программу Stop если нет, если нужно отменить последнее действие введи clear, введи любое число и нажми Enter ");
            n = iscan.next();
            if (n.equals("stop")){
                break;
            }
            else if(n.equals("clear")){                                
                for (int j = 0; j < 3; j++) {
                    System.out.println(ll.get(i-1));
                    ll.remove(i-1);                                
                    System.out.println(ll);    
                    i--;
                }
            System.out.println("Теперь результат равен " + ll.get(i-1));
            num1 = Integer.parseInt(ll.get(i-1));
                            
            }
            else{
                System.out.println(ll);
                              
                System.out.println("Введите знак ");
                n = iscan.next();
                ll.add(n);
                String c = ll.get(i);                
                i++;                
                System.out.println("Введите второе число ");
                n = iscan.next();
                ll.add(n);              
                Integer num2 = Integer.parseInt(ll.get(i));
                i++;                
                
                System.out.println("Выполним выражение " + num1 + " " + c + " " + num2 + " = " );
                if (c.contains("+")){
                    result = num1 + num2;
                    String result1 = Integer.toString(result);
                    ll.add(result1);
                    System.out.println(num1 + " + " + num2 + " = " + result);                    
                    i++;
                }
                else if (c.contains("-")){
                    result = num1 - num2;
                    String result1 = Integer.toString(result);
                    ll.add(result1);
                    System.out.println(num1 + " - " + num2 + " = " + result);                    
                    i++;
                }
                else if (c.contains("*")){
                    result = num1 * num2;
                    String result1 = Integer.toString(result);
                    ll.add(result1);
                    System.out.println(num1 + " * " + num2 + " = " + result);                    
                    i++;
                }
                else if (c.contains("/")){
                    result = num1 / num2;
                    String result1 = Integer.toString(result);
                    ll.add(result1);
                    System.out.println(num1 + " / " + num2 + " = " + result);                    
                    i++;
                }
                num1 = result;
            }
        }
        iscan.close();
        }

   
    }