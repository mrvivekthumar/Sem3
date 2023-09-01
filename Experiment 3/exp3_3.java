import java.util.Scanner;

public class exp3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println();
        int b = s1.indexOf('@');
        int c = s1.indexOf('.');

        if (b != 1 && c != 1) {
            int a = s1.indexOf('@');
            String s2 = s1.substring(0, a);
            String s3 = s1.substring(a + 1, s1.length());
            System.out.println("Email Id : " + s2);
            System.out.println("Email Server Address : " + s3);
        } else
            System.out.println("Invalid");

        sc.close();
    }
}
