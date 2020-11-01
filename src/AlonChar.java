import java.util.Scanner;

public class AlonChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            char[] answer = new char[100];
            int N = 0;
            String str = s.nextLine();
            for (int i = 0; i < str.length(); i++) {
                int index = str.indexOf(str.substring(i, i+ 1));
                if (index != -1) {
                    continue;
                }
                else {
                    answer[N] = str.charAt(i);
                }
            }
        }
    }
}
