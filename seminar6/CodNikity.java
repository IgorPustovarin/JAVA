package seminar6;

/**
 * CodNikity
 */
public class CodNikity {
    public class Cat {
        private String name;
        String poroda;
        private Integer age;
        
        public Cat(String name, Integer age){
        this.name = name;
        this.age = age;
        }
        
        public Cat(String name, Integer age, String poroda){
        this.name = name;
        this.age = age;
        this.poroda = poroda;
        }
        
        public Integer getAge() {
        return age;
        }
        
        public void setAge(Integer age) {
        this.age = age;
        }
        
        public void golos(){
        System.out.println(this.name + " say mur");
        }
        
        @Override
        public String toString() {
        return name +" <-Имя Возраст-> " + age;
        }
        }
        
        // Cat barsik = new Cat("Barsik", 3)
        // barsik.toString()
    
}