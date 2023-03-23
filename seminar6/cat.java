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

public class cat {
    public String name;
    public int age;
    public String breed; 
    public boolean vaccination = false; 
    public boolean isHangry;
    public person owner;

    public cat (String name, int age, String breed, boolean vaccination, person owner){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.vaccination = vaccination;
        this.isHangry  = true;
        this.owner = owner;
    }
    public void meow(int times){
        System.out.printf("Кот %s мяукает %d раз.\n", this.name, times);
    }

    public void vaccinate(){
        if (!this.vaccination){
            this.vaccination = true;
            System.out.printf("Кота %s привили от ковида.\n", this.name);
        }
        else {
            System.out.printf("Кот %s уже привит.\n", this.name);
        }
    }
    public void feed(){
        if (!this.isHangry){
        System.out.printf("Покормили кота %s \n", this.name);
        }
        else{
            System.out.printf("Кот %s не хочет есть!\n", this.name);
        }
    }
    
}
