





/**
 * Created by cerebro on 27/10/15.
 */
public class Cat {

    public static int averageAge = 5;
    public String name;
    public int age;

    public Cat(int age, String name) {
        this.name = name;
        this.age = age;
    }


    public void introduceYourself() {
        System.out.println("Hi my name is " + this.name + " and I am a cat");
    }

    public void dance() {
        System.out.println("Hi my name is " + this.name + " my age is " + this.age + " and I am dancing");
    }

    public void dance(String danceType) {
        System.out.println("I am doing " + danceType + " dance");
    }

    public void dance(int duration) {
        System.out.println("I will dance for " + duration + " seconds");
    }
}
