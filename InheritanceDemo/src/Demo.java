/**
 * Created by cerebro on 28/10/15.
 */
public class Demo {
    public static void main(String[] args) {

        Animal animal1  = new Animal("Lalu", 100);
        Dog dog1 = new Dog("bulldog");
        Hen hen1 = new Hen();
        Buffalo buffalo1 = new Buffalo();


        animal1.introduceYourself();
        dog1.introduceYourself();
        hen1.introduceYourself();
        buffalo1.introduceYourself();

    }
}
