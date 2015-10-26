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
}
