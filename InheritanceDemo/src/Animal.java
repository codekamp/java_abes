/**
 * Created by cerebro on 28/10/15.
 */
public class Animal {

    public String name;
    public int price;


    public Animal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Animal() {
        this.name = "Gumnam Janwar";
        this.price = 100;
    }

    public void introduceYourself() {
        System.out.println("My name is " + this.name + " and my price is " + this.price);
    }

    public void walk() {
        System.out.println("Tak Tak Tak Tak");
    }

    public void talk() {
        System.out.println("Hello guys!");
    }
}
