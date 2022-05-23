package big_exercise.models;

import java.util.Comparator;

public class Up implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.luong() > o2.luong()) {
            return 1;
        } else if (o1.luong() < o2.luong()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}