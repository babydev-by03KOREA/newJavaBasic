package basic.blog.singleton;

public class Company {
    // getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static! | 클래스변수
    private static Company instance;

    private String companyName;
    private String companyAddress;

    private Company() { }

    // 인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static!
    // 객체가 존재하지 않으면 생성해주고, 존재하면 기존 객체를 반환한다!
    public static synchronized Company getInstance() {
        if (instance == null)
            instance = new Company();
        return instance;
    }

    public static void setInstance(Company instance) {
        Company.instance = instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String toString() {
        return String.format("회사 이름: %s / 회사 주소: %s", companyName, companyAddress);
    }
}
