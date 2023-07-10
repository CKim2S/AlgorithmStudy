import java.util.Scanner;

public class B10250_Compact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = N % H;
            int roomNumber = (N / H) + 1;

            if (floor == 0) {
                floor = H;
                roomNumber--;
            }

            System.out.println(floor * 100 + roomNumber);
        }
    }
}
