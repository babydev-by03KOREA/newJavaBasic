package basic.Object;

public class InitBlock {
    static {
        System.out.println("static 클래스변수 초기화 블럭 { }");
        System.out.println("한번 호출되면 다음 인스턴스화가 되어도 호출되지 않습니다. 그것이 클래스변수니까..");
    }

    {
        System.out.println("인스턴스변수 초기화 블럭 { }");
    }

    public InitBlock() {
        System.out.println("생성자 호출");
    }

    public static void main(String[] args) {
        InitBlock ib = new InitBlock();
        InitBlock ib2 = new InitBlock();
    }
}

class InitTest {
    static int cv = 1;
    int iv = 1;

    static {    // static Variable Init
        cv = 2;
        // iv 출력 불가 > 클래스 변수가 생성되기 전 인스턴스 변수는 생성되지 않았을 수 있기 때문!
        System.out.println("또불러도 우린 못봐요ㅠ > 그러니깐 cv = 2 이제 안바껴요");
    }

    {   // Instance Variable Init
        iv = 2;
    }

    InitTest() {
        iv = 3;
        System.out.println("갸아악");
    }

    public static void main(String[] args) {
        InitTest it1 = new InitTest();
        System.out.printf("it1.iv: %d it1.cv: %d \t it1 인스턴스 종료 \n", it1.iv, it1.cv);
        InitTest it2 = new InitTest();
        System.out.printf("it2.iv: %d it2.cv: %d \n", it2.iv, it2.cv);
    }
}

class Document {
    String name;    // 인스턴스 고유의 번호
    static int count = 0;   // 생성된 인스턴스에 수를 저장하기 위한 변수

    Document() {    // 문서 생성 시 문서명을 지정하지 않았을 때 / Default Value
        // 즉 우리는 기본적으로 호출되었을 때 지정하고 싶은 초기값을 정해놓을수 있다.
        // 제목이 없는 친구들만 샘하면 되기 때문에 선증감으로 선언해둠.
        this("제목없음 " +  ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + name + "이(가) 생성되었습니다.");
    }

    public static void main(String[] args) {
        Document document1 = new Document("index.jsp");
        Document document2 = new Document("index.java");
        Document document3 = new Document();
    }
}

class Product extends Object {
    // 명시적 초기화
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    Product() {
        super();
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        System.out.printf("Serial Number %d / produce No.%d \n", p1.serialNo, Product.count);
        System.out.printf("Serial Number %d / produce No.%d \n", p2.serialNo, Product.count);
        System.out.printf("Serial Number %d / produce No.%d \n", p3.serialNo, Product.count);
        System.out.printf("Serial Number %d / produce No.%d \n", p4.serialNo, Product.count);
        System.out.println("다음과 같이 우리는 Product.count 는 한번 생성되면 클래스 내에서 공유되기때문에 프로그램이 종료되기 전까지 합계값이 출력된다.");
        System.out.println("즉 serialNO가 죽어도 count는 살아있기 때문에 계속해서 참조된다. 언제까지? main 메소드가 죽기 전까지.");
    }
}