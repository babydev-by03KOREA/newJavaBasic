package map;

import java.util.*;

public class hashTagMap {
    /* <Key, Value>, Key 중복 불허 Value 중복 가능 / 동일한 키가 있는데 저장을 한다면 덮어쓰기 처리된다.
     * Value에 Null값도 허용한다! hash Algorithm을 이용하여 방대한 양의 데이터를 검색할 때 속도가 빠르다.
     * 멀티 스레드에서는 HashTable을 사용하세요. */
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

    public static void hashTable() {
        // synchronized method, multi thread Safety > 안전한 객체 삭제 및 추가
        System.out.println("HashMap<>과 같은 동작을 한다. 다만 기존 코드의 호환을 위해 남았으모로, HashMap<> Recommend");
        Map<String, String> hashTableMap = new Hashtable<String, String>();

        hashTableMap.put("TVN", "응답하라 1988");
        hashTableMap.put("MBC", "대학가요제");
        hashTableMap.put("KBS", "전국 노래자랑");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Key-Value / 방송 프로그램 맞추기! - 간첩판독 프로그램");
            System.out.print("TVN, MBC, KBS 중 하나를 입력하세요 > ");
            String Key = sc.nextLine();
            System.out.print("유명한 방송을 하나 입력하세요! > ");
            String Value = sc.nextLine();
            System.out.println();
            if (hashTableMap.containsKey(Key)) {
                if (hashTableMap.get(Key).equals(Value)) {
                    System.out.println("정답입니다!!");
                    break;
                } else {
                    System.out.println("틀렸습니다! 다시!");
                }
            } else {
                System.out.println("방송사 목록을 다시한번 확인해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        hashTable();
    }
}
