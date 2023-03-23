// Создайте структуру класса Кот. Продумать какие поля и методы будут актуальны для приложения, которое является
// информационной системой ветеринарной клиники
// Поля:
// Имя
// Возраст
// Порода
// Прививка =false
// Метод:
// Кот(имя) мякнул 5 раз
// Прививка

package seminar6;

public class task3 {
    public static void main(String[] args) {
        person Ivan = new person("Ivan");
        person Feudor = new person("Feudor");
        cat Tom = new cat ("Tom", 5, "Underfinied", false, Ivan);
        Tom.meow(5);
        Tom.vaccinate();
        Tom.vaccinate();
        Tom.feed();
        Ivan.petCat(Tom);      
        Feudor.petCat(Tom);
    }
    
}
