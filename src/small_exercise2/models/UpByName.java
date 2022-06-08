package small_exercise2.models;

import java.util.Comparator;

public class UpByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
