import java.util.Random;

/**
 * Created by cerebro on 28/10/15.
 */









public class Demo {
    public static void main(String[] args) {

        Animal animal1  = new Animal("Lalu", 100);
        Animal animal2 = animal1;
        Animal animal3  = new Animal("Lalu", 100);
        Dog dog1 = new Dog("bulldog");
        Hen hen1 = new Hen();
        Buffalo buffalo1 = new Buffalo();


        Animal screenAnimal;

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);

        if(randomInt == 0) {
            screenAnimal = new Hen();
        } else if(randomInt == 1) {
            screenAnimal = new Buffalo();
        } else if (randomInt == 2) {
            screenAnimal = new Dog("Bulldog");
        } else {
            screenAnimal = new Animal();
        }





        screenAnimal.talk();

        if (screenAnimal instanceof Dog) {
            System.out.println("screen animal is a dog");
        }

//        animal1.introduceYourself();
//        animal2.introduceYourself();
////        dog1.introduceYourself();
////        hen1.introduceYourself();
////        buffalo1.introduceYourself();
//
//        animal2.name = "abcd";
//
//        animal1.introduceYourself();
//        animal2.introduceYourself();
//
//        animal2 = new Animal("xyz", 500);
//
//        animal1.introduceYourself();
//        animal2.introduceYourself();
//
//        animal1 = animal2;
//        System.gc();
    }
}
