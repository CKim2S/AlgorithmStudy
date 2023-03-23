// https://www.acmicpc.net/problem/10250
// 문제 : ACM 호텔
// 입력 : 프로그램은 표준 입력에서 입력 데이터를 받는다.
// 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다.
// 각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W).
// 출력 : 프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int a = 0; a < T; a++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int[][] rooms = new int[H][W]; // H개의 행, W개의 열을 가진 2차원 배열 생성.

            // 방 번호 배정. 행은 역방향으로 생각 필요.
            for (int height = 0; height < H; height++) {
                for (int width = 0; width < W; width++) {
                    rooms[H - height - 1][width] = (height + 1) * 100 + width + 1;
                }
            }

        /*
        // 배정된 방 번호 확인.
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println("");
        }
        */

            int count = 1;

            // 1층 1호실, 2층 1호실, 3층 1호실, ...
            for (int i = 0; i < W; i++) {
                for (int j = H - 1; j >= 0; j--) {
                    // System.out.print("(" + j + ", " + i + "), ");
                    // System.out.print(rooms[j][i] + ", ");
                    if (count == N) {
                        System.out.println(rooms[j][i]);
                    }
                    count++;
                }
            }
        }


    }
}