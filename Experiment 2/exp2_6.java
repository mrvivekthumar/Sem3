import java.util.Scanner;

public class exp2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Fib(n - 2));
        input.close();
    }

    static int Fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 2 || n == 1) {
            return 1;
        } else {
            return (Fib(n - 2) + Fib(n - 1));
        }
    }
}
