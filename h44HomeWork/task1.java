// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.


package h44HomeWork;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add ("111");
        ll.add("222");
        ll.add("333");
        System.out.println(ll);
        LinkedList<String> llrevers = new LinkedList<>();
        for (int i = ll.size()-1; i >= 0; i--) {
            llrevers.add(ll.get(i));
            
        }
        System.out.println(llrevers);
                
    }
}