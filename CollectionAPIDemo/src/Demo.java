import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 21/01/16.
 */
public class Demo {
    public static void main(String[] args) {

        String[] studentNames = new String[10];
        studentNames[0] = "Suresh";
        studentNames[1] = "Ramesh";


        List studentNameList = new ArrayList();
        studentNameList.add("Suresh");
        studentNameList.add("Ramesh");

        studentNameList.clear();

        Boolean result = studentNameList.contains("Ramesh");
        System.out.println(result);
        System.out.println(studentNameList.size());

        studentNameList.remove("Ramesh");

        result = studentNameList.contains("Ramesh");
        System.out.println(result);
        System.out.println(studentNameList.size());

    }
}
