import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> grade = new HashMap<>();
        grade.put("Adam", 10);
        grade.put("Peter", 9);
        grade.put("Alex", 6);
        grade.put("Wayne", 7);

        Iterator<Map.Entry<String, Integer>> i = grade.entrySet().iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}