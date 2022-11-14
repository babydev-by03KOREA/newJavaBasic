package lambda;

import lambda.member.Member;

import java.util.Arrays;
import java.util.List;

public class ExpressionMember {
    public static void main(String[] args) {
        List<Member> member = (List<Member>) Arrays.asList(
                new Member("박형주", Member.MALE, 20),
                new Member("한상준", Member.MALE, 24),
                new Member("한찬민", Member.MALE, 19),
                new Member("박예담", Member.FEMALE, 17)
        );

        int count = 0;
        double sum = 0;

        for (int i = 0; i < member.size(); i++) {
            if (member.get(i).getGender() == Member.MALE) {
                sum += member.get(i).getAge();
                count++;
            }
        }

        double ageAvg = sum/count;

        System.out.println("남자 회원의 평균나이: " + ageAvg);

        double ageAvg2 = member.stream().   // Original Stream
                filter(member1 -> member1.getGender() == Member.MALE). // Middle Progressing
                mapToInt(Member::getAge).   // Middle Progressing
                average().  // Last Progressing Stream => 집계처리
                getAsDouble();

        System.out.println("남자 회원 평균나이 for Stream : " + Math.ceil(ageAvg2));
    }
}
