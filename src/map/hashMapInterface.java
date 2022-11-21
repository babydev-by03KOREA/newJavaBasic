package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapInterface {
    // Map Interface 구현체 중 가장 대표 > HashMap<> hashCode() == return value / equals == true return
    // Key-Value type 클래스 및 인터페이스 타입만 가능하다.
    // 그말은 즉슨, byte, short, int, float, boolean, double, char 불가하다는거다.
    // 그럼 어떻게할까? Integer / Float 같이 클래스 및 인터페이스만 사용한다.
    public static void hashMapInterFace() {
        Map<String, String> serverMap = new HashMap<String, String>();

        serverMap.put("Java", "SpringFrameWork");
        serverMap.put("PHP", "Laravel");
        serverMap.put("Scala", "PlayFrameWork");
        serverMap.put("Python", "Django");
        serverMap.put("Python", "Flask");   // Flask 최종 저장
        serverMap.put("C#", ".Net");

        System.out.println("총 serverMap 갯수는 " + serverMap.size() + "개 입니다.");

        Set<Map.Entry<String, String>> entrySet = serverMap.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> stringEntry = entryIterator.next();
            String Key = stringEntry.getKey();
            String Value = stringEntry.getValue();
            System.out.print(Key + "\t");
            System.out.print(Value + "\t");
        }
        System.out.println();

        serverMap.clear();
        if (serverMap.isEmpty())
            System.out.println("SERVER IS EMPTY!");
    }
    public static void main(String[] args) {
        hashMapInterFace();
    }
}
