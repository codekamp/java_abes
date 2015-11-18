/**
 * Created by cerebro on 28/10/15.
 */
public class Dog extends Animal {

    public String breed;

    public void bark() {
        System.out.println("wuff wuff");
    }

    public Dog(String breed) {



        super("Gumnam Kutta", 100);
        this.breed = breed;
    }

    public void talk() {
        System.out.println("wuff wuff");
    }
}
