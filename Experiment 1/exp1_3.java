import java.util.Scanner;

public class exp1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n = n / 10;
        }
        System.out.println(sum);
        scan.close();
    }
}
