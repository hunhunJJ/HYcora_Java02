package week2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. 참조자료형 - String
        String name = "홍길동";

        System.out.println("== String 예제 ==");
        System.out.println();
        System.out.println();
        System.out.println();



        // 2. 참조자료형 - 배열
        int[] scores = new int[]{90, 80, 75, 100};

        System.out.println("== 배열 예제 ==");
        System.out.println("scores: " + Arrays.toString(scores));
        System.out.println("배열 길이: " + scores.length);

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        /*
        for (int i : scores) {
        }
        */

        double average = (double) sum / scores.length;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        System.out.println();

    }
}
