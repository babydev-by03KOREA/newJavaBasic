package basic.Memory.polymorphism;

public class CastingTest {
    public static void main(String[] args) {
        UpDownCasting casting = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        casting = fe;   // UpDownCasting casting = (UpDownCasting) new FireEngine();
//        casting.water();  UpDownCasting 타입의 참조변수로는 water()을 호출할 수 없다.
        fe2 = (FireEngine)casting;  // 자손타입 <- 조상타입
        // UpDownCasting fe2 = (
        fe2.water();
    }
}
