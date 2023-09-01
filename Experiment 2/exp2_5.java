import java.util.Scanner;

public class exp2_5 {
    public static void main(String[] args) {
        int res = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        System.out.print(res);
        sc.close();
    }
}
