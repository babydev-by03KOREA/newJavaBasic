package set;

import java.util.HashSet;
import java.util.Set;

public class HashTag {
    /* List > 저장순서 유지 / Set > 저장 순서 유지 X 객체중복 X null 1개만 저장가능 */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("JSP");
        set.remove("Java");
        for(String s : set) {
            System.out.println(s + "\t");
        }
    }
}
