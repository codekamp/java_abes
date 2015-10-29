/**
 * Created by cerebro on 28/10/15.
 */
abstract public class Animal {

    public String name;
    public int price;

    public void walk() {
        System.out.println("Tuk Tuk Tuk Tuk");
    }

    abstract public void speak();
}
