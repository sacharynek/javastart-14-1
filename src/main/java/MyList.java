import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//dzięki temu możemy tutaj dodawać tylko liczby !!!
public class MyList<T extends Number & Comparable> {

    private ArrayList<T> list = new ArrayList<T>();
    T max = (T) NumberUtils.createNumber("0");
    T min;

    public MyList() {

    }

    public List<T> getList() {
        return list;
    }

    public int compare(T a, T b) throws ClassCastException {
        return a.compareTo(b);
    }

    public int compareToZero(T a) {
        return compare(a, (T) NumberUtils.createNumber("0"));
    }

    void addToList(T element) {
        if (compareToZero(element) > 0) {
            if (compare(max, element) > 0) {
                max = element;
            }
            if (compare(min, element) < 0) {
                min = element;
            }
            list.add(element);
        }
    }

    void reverse() {
        Collections.reverse(this.getList());
    }

    void initializeMin(T a) {
        this.min = a;
    }

    void displaySum(){
        this.getList().forEach(item->{
            System.out.print(item +" + ");
        });
    }


}
