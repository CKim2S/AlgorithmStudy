/*
    https://www.acmicpc.net/problem/2775
    문제 번호 : 2775
    문제 이름 : 부녀회장이 될테야
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Test case의 개수를 입력하시오. : ");
        int testCaseCounter = scanner.nextInt();

        for (int i = 0; i < testCaseCounter; i++) {
            System.out.print("몇 층인지 입력하시오. : ");
            int k = scanner.nextInt();

            System.out.print("몇 호인지 입력하시오. : ");
            int n = scanner.nextInt();

            int peopleCounter = 0;

            for (int j = 0; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    if (j == 0) {
                        peopleCounter = j + 1;
                    } else {
                        peopleCounter = l * j + (l - 1) * j;
                    }
                }
            }

            System.out.println(peopleCounter);
        }
    }
}