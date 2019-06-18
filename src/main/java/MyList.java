import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private List<Integer> list = new ArrayList<>();

    public MyList() {
    }


    public List<Integer> getList() {
        return list;
    }

    public int compare(Integer a, Integer b) throws ClassCastException {
        return a.compareTo(b);
    }

    public int compareToZero(Integer a) {
        return a.compareTo(0);
    }

    public Integer convestStringToType(String text) {
        return Integer.valueOf(text);
    }

    boolean addToList(String text) {
        Integer element = Integer.valueOf(text);

        boolean output = compareToZero(element) > 0;
        if (output) {

            list.add(element);
        }
        return output;
    }

    List<Integer> reverse() {
        return Lists.reverse(this.getList());
    }

    int getSum() {
        int sum = Integer.valueOf(0);

        for (Integer element : getList()) {
            sum = Integer.sum(sum, element);
        }
        return sum;
    }

    Integer getMin() {
        return this.getList()
                .stream()
                .mapToInt(v -> v)
                .min().getAsInt();
    }

    Integer getMax() {
        return this.getList()
                .stream()
                .mapToInt(v -> v)
                .max().getAsInt();
    }

}
