/**
 * Created by cerebro on 26/10/15.
 */
public class Student {

    String name;
    String email;
    String phoneNumber;
    int age;

    static int averageAge = 18;

    public Student(String studentName, String emailParamter, String phoneNumber, int age) {

        this.name = studentName;
        this.email = emailParamter;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public boolean validate() {
        System.out.println("I am valdate function and I have automatic access to data.");
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.phoneNumber);
        System.out.println(this.age);

        return true;
    }

    public boolean saveInDatabase() {
        System.out.println("I am saveInDatabase function and I have automatic access to data.");
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.phoneNumber);
        System.out.println(this.age);

        return true;
    }
}
