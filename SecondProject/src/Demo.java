


/**
 * Created by cerebro on 27/10/15.
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("hello world!");


        System.out.println(Cat.averageAge);
        System.out.println(Dog.averageAge);

//        Dog.introduceYourself();  //can't do this as this is not a static function
//        Dog.introduceYourself();
//        Dog.introduceYourself();
//        Cat.introduceYourself();


        Cat cat1 = new Cat(5, "kitty");
        Cat cat2 = new Cat(7, "Jenny");


        Dog myDog = new Dog("Jackie", 10);
        Dog yourDog = new Dog("John", 8);
        Dog neighboursDog = new Dog("Kevin", 12);


        System.out.println(cat1.name);
        System.out.println(cat2.name);
        System.out.println(myDog.name);
        System.out.println(yourDog.name);
        System.out.println(neighboursDog.name);

        cat1.introduceYourself();
        myDog.introduceYourself();
        yourDog.introduceYourself();

        cat1.dance();
        cat1.dance("bharat natyam");
        cat1.dance(10);
        cat2.dance();
    }
}
