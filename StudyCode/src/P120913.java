// https://school.programmers.co.kr/learn/courses/30/lessons/120913
public class P120913 {
    public static void main(String[] args) {
        String my_str = "abcdef123";
        int n = 3;

        if((my_str.length() % n) == 0){
            String[] subStringArray = new String[my_str.length() / n];
            int startNumber = 0;
            int endNumber = n;

            for(int i = 0; i < (my_str.length() / n); i++){
                subStringArray[i] = my_str.substring(startNumber, endNumber);

                startNumber = startNumber + n;
                endNumber = endNumber + n;

                System.out.println(subStringArray[i]);
            }
        } else {
            String[] subStringArray = new String[(my_str.length() / n) + 1];
            int startNumber = 0;
            int endNumber = n;

            for(int i = 0; i < (my_str.length() / n) + 1; i++){
                if(i == (my_str.length() / n)){
                    endNumber = i * n + (my_str.length() % n);
                    subStringArray[i] = my_str.substring(startNumber, endNumber);

                    System.out.println(subStringArray[i]);
                    return;
                }

                subStringArray[i] = my_str.substring(startNumber, endNumber);

                startNumber = startNumber + n;
                endNumber = endNumber + n;

                if(i == (my_str.length() / n)){
                    endNumber = endNumber + (my_str.length() % n);
                    System.out.print(endNumber);
                }

                System.out.println(subStringArray[i]);
            }
        }
    }
}
