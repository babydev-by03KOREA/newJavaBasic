package com.java.basic.map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesMain {
    /* class Properties extends Hashtable<Object,Object>
     * HashTable<K,V>은 값을 다양한 타입으로 지정 가능하지만 Properties()는 키와 값을 String으로 제한하고있다.
     * https://velog.io/@shawnhansh/intelliJ-properties-%ED%8C%8C%EC%9D%BC-UTF-8-%EC%9D%B8%EC%BD%94%EB%94%A9 > property 한글이 깨진다면 참고하자!
     * mybatis.properties > db 관련 String 정보를 작성 후 가져다가 쓰기 기능은 Properties를 이용하여 구연한다. Hashtable의 하위 클래스이다!*/
    public static void main(String[] args) {

        Properties prop = new Properties();

        try {
            // load() > get() > use!
            String Path = PropertiesMain.class.getResource("../profile/DB.Properties").getPath();
            Path = URLDecoder.decode(Path, "utf-8");
            // 데이터 읽기 > load(FileReader(객체)) / 매값으로 받는다!
            prop.load(new FileReader(Path));

            String contry = prop.getProperty("contry");
            String language = prop.getProperty("language");
            String blogname = prop.getProperty("blogname");
            String job = prop.getProperty("job");

            System.out.println("contry : " + contry);
            System.out.println("language : " + language);
            System.out.println("blogname : " + blogname);
            System.out.println("job : " + job);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
