import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by cerebro on 27/10/15.
 */
public class Main {

    private Object items[] = new Object[100];
    private int size = 0;

    public static void main(String[] args) {

        ArrayList students = new ArrayList();

        System.out.println(students.isEmpty());
        System.out.println(students.size());

        students.add("Suresh");
        students.add("Ramesh");
        students.add("Ravi");
        students.add("Ram");

        System.out.println(students.isEmpty());
        System.out.println(students.size());
        System.out.println(students.get(3));

        System.out.println(students.contains("Rahul"));

    }
}
