package test;

import basic.blog.singleton.Company;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitSingletonTest {
    @Test
    public void SingletonTest() {
        Company companyTest = Company.getInstance();
        Company companyTest2 = Company.getInstance();

        // 객체가 만들어졌는지 테스트
        assertNotNull(companyTest);
    }
}
