/**
 * Created by cerebro on 28/10/15.
 */
public class Demo {
    public static void main(String[] args) {

        Animal animal1  = new Animal();

        animal1.name = "Lalu";
        animal1.price = 100;

        System.out.println(animal1.name);

        animal1.introduceYourself();
    }
}
