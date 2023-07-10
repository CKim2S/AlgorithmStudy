import java.util.Arrays;

public class P120921 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";

        int count = 0;
        String temp = A;
        for (int i = 0; i < A.length(); i++) {
            if(temp.equals(B)){
                System.out.println(count);
                return;
            }
            String strTemp = temp.substring(temp.length() - 1);
            temp = strTemp + temp.substring(0, temp.length() - 1);
            count++;
            System.out.println(temp);
        }

        System.out.println(-1);
    }
}
