package list;

import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        List<newThing> vector = new Vector<>();
        vector.add(new newThing("박형주", "대한민국", "남성"));
        System.out.println("=====VECTOR=====");
        for (newThing i : vector) {
            // list<자료형> 의 자료형을 입력할것.
            System.out.print(i.name + "\t" + i.nationality + "\t" + i.gender);
        }
        System.out.println();

        List<String> apple = new Vector<>(Arrays.asList("Mac", "iPhone", "iPad", "Watch", "airPods"));
        System.out.println(apple);
        Iterator<String> iterator = apple.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();

        List<Integer> vector2 = new Vector<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            vector2.add(random.nextInt(100) + 1);
        }
        System.out.println(vector2);
    }
}

class newThing {
    String name;
    String nationality;
    String gender;

    newThing(String name, String nationality, String gender) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
    }
}
