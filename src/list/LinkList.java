package list;

import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class LinkList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // List<Integer> linkedList = new LinkedList<>(10); X
        // 가용량이 의미가 없기때문에 가용량을 받는 생성자는 존재하지 않는다.
        // 잦은 삽입 및 삭제가 필요한경우 사용됩니다.

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            linkedList.add(random.nextInt(30) + 1);
        }

        System.out.println("=====LinkedList + Random=====");
        for (int l : linkedList) {
            System.out.print(l + "\t");
        }
        System.out.println();

        linkedList.set(0, 55);
        System.out.println("=====SET INDEX 1 TO 55=====");
        for (int l : linkedList) {
            System.out.print(l + "\t");
        }
        System.out.println();

        linkedList.remove(4);
        System.out.println("=====REMOVE INDEX 4=====");
        for (int l : linkedList) {
            System.out.print(l + "\t");
        }
        System.out.println();

    }
}
