import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.add(3);
        intLinkedList.add(5);
        intLinkedList.add(7);

        List<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(3);
        intArrayList.add(5);
        intArrayList.add(7);

        System.out.println("LinkedList:");
        for (int i : intLinkedList) {
            System.out.println(i);
        }

        System.out.println("ArrayList");
        for (int i: intArrayList) {
            System.out.println(i);
        }

    }
}