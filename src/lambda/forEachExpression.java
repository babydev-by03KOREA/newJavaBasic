package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachExpression {
    public static void main(String[] args) {
        List<String> airline = new ArrayList<>();
        airline.add("KoreanAir");
        airline.add("AsianaAirline");
        airline.add("JejuAir");
        airline.add("T\'WayAir");
        airline.forEach(System.out::println);

        String[] stringArray = {"JSP", "PHP", "NODE", "ASP"};
//        for (String s : stringArray) {
//            System.out.println(s);
//        }
//        System.out.println();

        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
