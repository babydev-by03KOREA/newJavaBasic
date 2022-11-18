package basic.Memory.polymorphism;

public class IsInstanceOf {
    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();

        if (fireEngine instanceof FireEngine) {
            System.out.println("This is FireEngine instance");
        }

        if (fireEngine instanceof UpDownCasting) {
            System.out.println("This is a UpDownCasting instance");
        }

        if (fireEngine instanceof Object) {
            System.out.println("This is an Object instance.");
        }

        System.out.println(fireEngine.getClass().getName());
    }
}
