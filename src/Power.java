
import java.util.Scanner;
import java.io.FileInputStream;

class Power
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println("#" + test_case + " " + getPower(N, M));
        }
    }

    private static int getPower(int N, int M) {
        if (M != 0) return N * getPower(N, --M);
        return 1;
    } 
}