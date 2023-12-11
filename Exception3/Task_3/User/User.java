package Task_3.User;

public class User {
    public int id;
    public String lastName = " ";
    public String firstName = " ";
    public String birthDay = " ";
    public String phoneNumber = " ";
    public String sex = " ";

    static public int index;

    public User(String lastName, String firstName, String patronymic, String birthDay,
                   String sex, String phoneNumber) {

        this.id = index;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.sex = sex;

        index ++;
        
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", birthDay=" + birthDay
                + ", phoneNumber=" + phoneNumber + ", sex=" + sex + "]";
    }

    public String getName() {return lastName;}

    public void setName(String lastName) {this.lastName=lastName;}

}