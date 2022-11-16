package basic.Memory;

public class Overloading {
    int add(int a, int b) {
        System.out.printf("%d + %d = %d%n",a,b,a+b);
        return a + b;
    }
    long add(int a, long b) {
        System.out.printf("%d + %d = %d%n",a,b,a+b);
        return a + b;
    }
    long add(long a, int b) {
        System.out.printf("%d + %d = %d%n",a,b,a+b);
        return a + b;
    }
    long add(long a, long b) {
        System.out.printf("%d + %d = %d%n",a,b,a+b);
        System.out.println("리터럴의 접미사는 출력하지 않습니다.");
        return a + b;
    }
    int add(int[] a) {
        System.out.println("Array's SUM");
        int result = 0;
        for (int index = 0; index < a.length; index++) {
            result += a[index];
        }
        return result;
    }
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println("overloading 주소값 > " + overloading);
        System.out.println(overloading.add(3,3));
        System.out.println(overloading.add(3,3L));
        System.out.println(overloading.add(3L,3));
        System.out.println(overloading.add(3L,3L));
        int[] array = {100, 200, 300};
        System.out.println(overloading.add(array));
    }
}
