package basic.blog.singleton;

public class CompanyInfo {
    // Java Basic 1 372p
    public static void main(String[] args) {
        Company companyInfo1 = Company.getInstance();
//        Company company = new Company(); > 생성자 생성 불가! private로 생성 못하게 지정함.

        companyInfo1.setCompanyName("OSM");
        companyInfo1.setCompanyAddress("서울시 성동구 왕십리로 지하1층 오성메디");
        String info = companyInfo1.toString();
        System.out.println(info);
    }
}
