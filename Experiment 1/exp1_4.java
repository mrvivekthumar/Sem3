
// Check the number is Palindrom or not.
// reverse A Number.
import java.util.Scanner;

public class exp1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long rev = 0, temp = 0;
        while (n > 0) {
            temp = n % 10;
            rev = (rev * 10) + temp;
            n = n / 10;
        }
        System.out.println(rev);
        scan.close();
    }
}
