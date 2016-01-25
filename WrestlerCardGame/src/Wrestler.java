import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 25/01/16.
 */
public class Wrestler {
    String name;
    int height;
    float weight;

    public Wrestler(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static List<Wrestler> deck() {
        List<Wrestler> list = new ArrayList<Wrestler>();

        list.add(new Wrestler("Hulk Hogan", 100, 120.5f));
        list.add(new Wrestler("UnderTaker", 130, 125.5f));
        list.add(new Wrestler("HHH", 110, 100.0f));
        list.add(new Wrestler("John Cena", 150, 145.0f));

        return list;
    }
}
