// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина


package seminar5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое выражение");
        String str = input.nextLine();
        input.close();
        System.out.println(isTrue(str));
        }
        public static boolean isTrue(String str){
        Map<Character, Character> vocabulary = new HashMap<>();
        vocabulary.put(')', '(');
        vocabulary.put(']', '[');
        vocabulary.put('}', '{');
        Stack<Character> newStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
        if (vocabulary.containsValue(str.charAt(i))){
        newStack.push(str.charAt(i));
        }
        if (vocabulary.containsKey(str.charAt(i))){
        if ((newStack.isEmpty() || vocabulary.get(str.charAt(i)) != newStack.pop())) return false;
        }
        }
        return newStack.isEmpty();
    }
}
////////////////////////////////////////////////////////// Код С Разбором
// public static boolean checkBrackets(String expr) {
//     Stack<Character> stack = new Stack<>();
    
//     for (int i = 0; i < expr.length(); i++) {
//     char c = expr.charAt(i);
    
//     if (c == '(' || c == '[' || c == '{') { // открывающая скобка добавляем ее в стек
//     stack.push(c);
//     } else if (c == ')' || c == ']' || c == '}') { // закрывающая скобка, то проверяем соответствие открывающей скобке
//     if (stack.isEmpty()) { // если стек пуст, то нет соответствующей открывающей скобки
//     return false;
//     }
    
//     char last = stack.pop(); // извлекаем последнюю открывающую скобку из стека
    
//     if ((c == ')' && last != '(') || (c == ']' && last != '[') || (c == '}' && last != '{')) { // проверяем соответствие скобок
//     return false;
//     }
//     }
//     }
    
//     return stack.isEmpty(); // если в стеке не осталось открывающих скобок, то выражение верно
//     }