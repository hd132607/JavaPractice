package org.dimigo.oop;

import java.util.Scanner;

/**
 * Created by codertimo on 15. 5. 14..
 */
public class Score {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int korean;
        int math;
        int english;

        System.out.print("국어점수 입력 :");
        korean = scanner.nextInt();
        System.out.print("수학점수 입력 :");
        math = scanner.nextInt();
        System.out.print("영어점수 입력 :");
        english = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<점수출력>");
        stringBuilder.append("\n국어 점수 :");
        stringBuilder.append(korean);
        stringBuilder.append("\n수학 점수 :");
        stringBuilder.append(math);
        stringBuilder.append("\n영어 점수 :");
        stringBuilder.append(english);
        stringBuilder.append("총점 : ");
        stringBuilder.append(korean+math+english);
        stringBuilder.append("평균 : ");
        stringBuilder.append(String.format("%.1f",(double)(korean+math+english)/3));

        System.out.print(stringBuilder);

    }
}
