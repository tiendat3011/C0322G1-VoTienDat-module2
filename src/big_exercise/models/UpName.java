package big_exercise.models;

import java.util.Comparator;

public class UpName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
