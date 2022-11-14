package lambda.member;

public class Customer {

    private String name;
    private int born;

    public Customer(String name, int born) {
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public int getBorn() {
        return born;
    }
}
