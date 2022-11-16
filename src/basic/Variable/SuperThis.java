package basic.Variable;

public class SuperThis {
    public static void main(String[] args) {
        // PointCard() -> PointCard(int a, int b, int c) -> Point(int a, int b) -> Object()
        PointCard pc = new PointCard();
        System.out.println("PointCard a : " + pc.a);
        System.out.println("PointCard b : " + pc.b);
        System.out.println("PointCard c : " + pc.c);
    }
}

class Point {
    int a = 10;
    int b = 20;

    Point(int a, int b) {
        // 여기에서 super()는 Point의 조상인 Object를 나타낸다. 즉, 생략 가능하다.
        // 이클립스에서 Generator 항목을 선택하면 자동으로 Object를 만들어준다!
        super();
        this.a = a;
        this.b = b;
    }
}
class PointCard extends Point {
    int c = 30;

    PointCard() {
        // PointCard(int a, int b, int c)를 호출합니다.
        // Point(100, 200) / PointCard(300); 맴버+조상 인스턴스 참조하기
        this(100, 200, 300);
    }

    PointCard(int a, int b, int c) {
        // PointCard의 조상인 Point의 a, b 값을 참조한다!
        super(a, b);
        // 멤버변수와 이름이 비슷해서 this!
        this.c = c;
    }
}