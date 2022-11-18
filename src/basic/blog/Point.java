package basic.blog;

public class Point {
    String userName;
    int pointNum;
    int pointValue;

    Point(String userName, int pointNum, int pointValue) {
        this.userName = userName;
        this.pointNum = pointNum;
        this.pointValue = pointValue;
        System.out.printf("가입된 회원:%s" + " pointNumber:%d" + " pointValue: %d\n", userName, pointNum, pointValue);
    }

    Point(String userName) {
        this(userName,1234,1000);
        System.out.printf("신규회원:%s" + " pointNumber:%d" + " pointValue: %d\n", userName, pointNum, pointValue);
    }

    Point() {
//        this("비회원", 0000, 0);
        this.userName = "비회원";
        this.pointNum = 0000;
        this.pointValue = 0;
        System.out.printf("비회원:%s" + " pointNumber:%d" + " pointValue: %d\n", userName, pointNum, pointValue);
    }

    public static void main(String[] args) {
        Point pointUser = new Point("박형주", 12345, 5000);
        Point pointUserFirst = new Point("신규가입");
        Point defaultUser = new Point();
    }
}
