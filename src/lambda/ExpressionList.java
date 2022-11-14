package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ExpressionList {
    // Stream > Java8
    // Iterator<> 외부반복자 | Stream<> 내부반복자
    public static void javaSevenIterator() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Iterator<Integer> iterator = list1.listIterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + "\t");
        }
    }

    // Stream<> : Collection's lambda Iterator
    public static void lambdaIterator() {
        List<Integer> listLambda = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Stream<Integer> stream = listLambda.stream();
        stream.forEach(value -> System.out.print(value + "\t"));
    }

    public static void javaForEach() {
        List<String> list = new ArrayList<>(Arrays.asList("JSP", "PHP", "ASP"));
        for (String value : list) {
            if(list.contains("JSP")) {
                System.out.println(value + "\t");
            }
        }
    }

    public static void javaLambdaStream() {
        List<String> listLambda = new ArrayList<>(Arrays.asList("JSP", "PHP", "ASP"));
        listLambda.stream()
                .filter("JSP"::contains)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        javaLambdaStream();
    }
}
