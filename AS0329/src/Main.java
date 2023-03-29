/*
    https://www.acmicpc.net/problem/2775
    문제 번호 : 2775
    문제 이름 : 부녀회장이 될테야
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Test case의 개수를 입력하시오. : ");
        int testCaseCounter = scanner.nextInt();

        for (int i = 0; i < testCaseCounter; i++) {
//            System.out.print("몇 층인지 입력하시오. : ");
            int k = scanner.nextInt();

//            System.out.print("몇 호인지 입력하시오. : ");
            int n = scanner.nextInt();

            int peopleCounter = 0;

            int[][] rooms = new int[(k + 1)][n];
            int result = 0;

            for (int a = k; a >= 0; a--) {
//                System.out.println(a);
                for (int b = 0; b < n; b++) {
//                    System.out.print(a + "행 " + b + "열 ");
                    if (a == k || b == 0) {
                        rooms[a][b] = b + 1;
                    } else {
                        rooms[a][b] = rooms[a][b - 1] + rooms[a + 1][b];
                        result = rooms[a][b];
                    }
//                    System.out.print(rooms[a][b]);
                }
//                System.out.println();
            }

            System.out.println(result);

//            for (int a = 0; a <= k; a++) {
//                for (int b = 1; b <= n; b++) {
////                    System.out.print(a + "층 " + b + "호 ");
//                    System.out.print(rooms[a][b - 1]);
//                }
////                System.out.println();
//            }
        }
    }
}