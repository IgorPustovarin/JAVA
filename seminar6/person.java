package seminar6;

public class person {
    public String name;

    public person (String name){
        this.name = name;
    }
    public void petCat(cat cat){
        System.out.printf("%s гладит кота %s\n", this.name, cat.name);
        if (cat.owner == this){
            System.out.printf("%s гладит кота %s.\n", this.name, cat.name);
        }
        else{
            System.out.printf("Кот %s зашипел. \n", cat.name);
        }
    }
    
}
