



/**
 * Created by cerebro on 27/10/15.
 */
public class Dog {

    public static int averageAge = 10;
    public String name;
    public int age;

    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public void introduceYourself() {
        System.out.println("Hi! my name is " + this.name +   " and I am a dog");
    }

}







