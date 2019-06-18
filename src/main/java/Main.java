public class Main {

    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<>();
        ml.initializeMin(0);
        ml.addToList(1);
        ml.addToList(2);
        ml.addToList(-2);
        ml.addToList(0);

        var List = ml.getList();
        ml.displaySum();

    }
}
