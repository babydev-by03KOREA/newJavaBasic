package controlStatement;

import java.util.Scanner;

public class array {
    // 배열의 선언
    static int[] arr1;
    static int[] scannerArray;
    static int min, max;

    static void basicArray() {
        // 배열의 초기화
        arr1 = new int[2];

        arr1[0] = 1;
        arr1[1] = 2;

        System.out.println("arr1[0] > " + arr1[0]);
    }

    static void inputArray() {
        // 5개의 방을 할당해줌
        scannerArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("5개의 정수를 입력하세요 > ");
        for (int i = 0; i < scannerArray.length; i++) {
            scannerArray[i] = sc.nextInt();
        }
        // 최소값, 최대값 초기 설정
        max = scannerArray[0];
        min = scannerArray[0];
        for (int j : scannerArray) {
            // scannerArray[0] > 0번째 값을 뽑음
            // 0 1 2 3 4 번째 중 가장 크면 max 할당
            if (max < j) {
                max = j;
            }
            // 0 1 2 3 4 번째 중 가장 작으면 min 할당
            if (min > j) {
                min = j;
            }
        }
        System.out.println("최대값은 " + max + " 입니다.");
        System.out.println("최솟값은 " + min + " 입니다.");
    }

    public static void main(String[] args) {
//        basicArray();
        inputArray();
    }
}
