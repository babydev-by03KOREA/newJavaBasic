package basic.method;

public class Declaration {
    // [method's Type(Out)] [method's Name] [parameters]
    int add (int x, int y) {    // method's body / 메서드의 구현부
        int result = x + y;
        return result;  // == return x + y;
    }

    int isABig (int a, int b) {
        if(a > b)
            return a;
        else
            return b;
        // return Math.max(a, b);
    }

    void multiplicationTable() {
        System.out.println("*****MULTIPLICATION TABLE*****");
        for (int i = 2; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d \t", i, j, i*j);
            }
        }
        System.out.println();
        // return; > 리턴타입이 void면 컴파일러가 자동으로 추가해준다. class 기본 생성자와 같은 원리이다.
    }

    float divide(int x, int y) {
        // 가능 한 모든 변수를 생각하고 코드를 작성해야한다. 유저는 생각보다 멍청하다.
        if (y == 0) {
            System.out.println("You can't divide 0");
            // return false
            return 0;
        }
        return x / (float) y;
    }

    public static void main(String[] args) {
        Declaration declaration = new Declaration();
        int calcResult = declaration.add(1,2);
        System.out.println(calcResult);
        int maxMinValue = declaration.isABig(5, 10);
        System.out.println(maxMinValue);
        declaration.multiplicationTable();
        float divideResult = declaration.divide(3, 1);
        System.out.println(divideResult);
        System.out.println("한줄로 줄이기 > result = 9");
        int declarationResult = new Declaration().add(5,4);
        System.out.println(declarationResult);
    }
}
