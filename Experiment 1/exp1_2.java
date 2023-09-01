import java.util.Scanner;

public class exp1_2 {
    public static void main(String[] args) {
        System.out.print("How Many Terms you Want in Fibb : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Fib(i));
        }
        scanner.close();
    }

    static int Fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return Fib(n - 2) + Fib(n - 1);
    }
}
