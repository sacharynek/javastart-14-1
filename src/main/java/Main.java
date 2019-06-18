import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyList ml = new MyList();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Podaj liczbę");
            String element = sc.nextLine();
            flag = ml.addToList(element);
        }

        System.out.println(ml.reverse());

        for (int i = 0; i < ml.getList().size() - 1; i++) {
            System.out.print(ml.getList().get(i) + " + ");
        }
        System.out.print(ml.getList().get(ml.getList().size() - 1));
        System.out.print(" = ");

        System.out.println(ml.getSum());
        System.out.println(ml.getMax());
        System.out.println(ml.getMin());


    }


}
