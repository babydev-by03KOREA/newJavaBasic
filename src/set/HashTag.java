package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class HashTag {
    /* List > 저장순서 유지 / Set > 저장 순서 유지 X 객체중복 X null 1개만 저장가능 > 굉장히 빠른 Algorithm! */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("PHP");
        set.add("ASP");
        set.add("JSP");
        set.add("node.js");
        set.add("SpringF/W");
        set.add("JSP"); // 중복을 허용하지 않기때문에 JSP 한개만 출력됩니다.

        for(String s : set) {
            System.out.println(s + "\t");
        }

        System.out.println("저장된 데이터 갯수 > " + set.size());
        System.out.println("is contain? PHP > " + set.contains("PHP"));
        System.out.println("반복자 생성! Iterator");

        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.print(setIterator.next() + "\t");
        }
        System.out.println();

        Stream<String> stringStream = set.stream();
        System.out.println("Lambda Expression Print > ");
        stringStream.forEach(System.out::println);

        set.clear();
        if (set.isEmpty()) {
            System.out.println("배열이 비어있습니다!");
            System.out.println("현재 Set 사이즈 > " + set.size());
        }
    }
}
