package lambda;

import lambda.member.Customer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ExpressionCustomer {
    public static void main(String[] args) {
        List<Customer> list = (List) Arrays.asList(new Customer("박형주", 2420001),
                new Customer("한상준", 990412));

        for (Customer customer : list) {
            System.out.println("이름 " + customer.getName() + " 생년월일 " + customer.getBorn());
        }

        // Collection 스트림 얻기 > List 참조변수를 통해서!
        Stream<Customer> stream = list.stream();

        stream.forEach(s -> {   // 한문장 이상일 때 {} 생략하면 안됨!!
            String name = s.getName();
            int born = s.getBorn();
            System.out.println(name + " 님의 생년월일은 " + born + " 입니다.");
        });
    }
}
