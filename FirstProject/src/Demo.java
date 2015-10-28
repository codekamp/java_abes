/**
 * Created by cerebro on 26/10/15.
 */
public class Demo {

    static int averageAge = 99;

    static Student student1;

    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println(Demo.averageAge);
        System.out.println(Cat.averageAge);
        System.out.println(Dog.averageAge);

        Cat.introduceYourself();
        Dog.introduceYourself();

        Student student1 = new Student("Suresh", "suresh@gmail.com", "+91.0000000000", 25);
        Student student2 = new Student("Ramesh", "ramesh@gmail.com", "+91.1111111111", 22);
        Student student3 = new Student("Denesh", "denesh@gmail.com", "+91.222222222", 52);

        System.out.println(student3.name);
        System.out.println(student2.name);
        System.out.println(student1.email);

        student1.email = "newemail@gmail.com";


        System.out.println(student1.email);

        student1.validate();
        student2.validate();

        student3.saveInDatabase();
        student1.saveInDatabase();
    }


}
