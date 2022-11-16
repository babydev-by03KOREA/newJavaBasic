package basic.Variable;

public class Object {
    // Object Class는 모든 클래스의 최상위 클래스이다. 그 중 일부를 제정의하여 사용 가능하다.
    // toString()
    String id;
    String passwd;

    Object(String id, String passwd) {
        this.id = id;
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return String.format("User (ID = %s, PassWord = %s)", id, passwd);
    }

    // equals()
    static String s1 = new String("ABC");
    static String s2 = new String("ABC");

    public static void main(String[] args) {
        Object object = new Object("hyeongju1122", "!qhdkscjfwj@");

        // toString() 사용하지 않고 출력시에는 16진수 해시코드 문자열을 반환한다.
        // 객체가 가지고있는 정보나 값들을 문자열로 만들어 리턴하는 메소드이다.
        // toString()은 디버깅을 위해 설계된 메소드이다.
        System.out.println("toString()을 활용한 재정의 : " + object);
        System.out.printf("== 비교(주소값이 동일합니까?) : %b \n", s1 == s2);
        System.out.println("equals() 비교 : " + s1.equals(s2));
    }
}

