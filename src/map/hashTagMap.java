package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTagMap {
    // <Key, Value>, Key 중복 불허 Value 중복 가능 / 동일한 키가 있는데 저장을 한다면 덮어쓰기 처리된다.
    public static void hashMap() {
        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("KoreanAir", "ICN to CGK");
        stringMap.put("AsianaAir", "ICN to FUK");
        stringMap.put("JejuAir", "GMP to CJU");

        // Key로 Value값 가져오기
        String getAirline = stringMap.get("KoreanAir");
        System.out.println("Destination: " + getAirline);

        // Key가 존재하니? T/F
        boolean isKeyExist = stringMap.containsKey("JejuAir");
        System.out.println("JejuAir is Exist? > " + isKeyExist);

        System.out.println("StringMap size : " + stringMap.size());

        System.out.println("Remove {Key-Value}");
        stringMap.remove("AsianaAir");
        System.out.println("StringMap size after : " + stringMap.size());

        // println {Key=Value}
        System.out.println(stringMap);

        // keySet()로 모든 키를 Set Collection으로 얻고 > Iterator<>사용해 출력!
        System.out.println("반복자를 얻는 첫번째 방법 > Set and Iterator<>");
        Set<String> MapForSet = stringMap.keySet();
        Iterator<String> MapSetStringIterator = MapForSet.iterator();
        while (MapSetStringIterator.hasNext()) {
            String key = MapSetStringIterator.next();
            String value = stringMap.get(key);
            System.out.print(key  + "\t");
            System.out.print(value  + "\t");
        }
        System.out.println();

        System.out.println("반복자를 얻는 두번째 방법 > Map.entrySet() / getKey() & getValue()");
        Set<Map.Entry<String, String>> mapSetEntry = stringMap.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = mapSetEntry.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            String Key = entry.getKey();
            String Value = entry.getValue();
            System.out.print(Key + "\t");
            System.out.print(Value + "\t");
        }
    }

    public static void entryMapIterate() {
        Map<Integer, String> iteratorStringMap = new HashMap<>();
        iteratorStringMap.put(1, "A");
        iteratorStringMap.put(2, "B");
        iteratorStringMap.put(3, "C");

        for (Map.Entry<Integer, String> integerStringEntry : iteratorStringMap.entrySet()) {
            System.out.print("Entry.getKey(): " + integerStringEntry.getKey() + "\t");
            System.out.print("Entry.getValue(): " + integerStringEntry.getValue() + "\t");
        }
    }

    public static void main(String[] args) {
        entryMapIterate();
    }
}
