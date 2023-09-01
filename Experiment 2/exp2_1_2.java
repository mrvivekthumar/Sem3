import java.util.Scanner;

public class exp2_1_2 {
    public static void main(String[] args) {
        System.out.println("1 . for Addition");
        System.out.println("2 . for Substration ");
        System.out.println("3 . for Multiplication");
        System.out.println("4 . for Divide");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);
                System.out.println(a + b);
                break;

            case 2:
                float c = Integer.parseInt(args[1]);
                float d = Integer.parseInt(args[2]);
                System.out.println(c - d);
                break;

            case 3:
                float p = Integer.parseInt(args[1]);
                float q = Integer.parseInt(args[2]);
                System.out.println(p * q);
                break;

            case 4:
                float y = Integer.parseInt(args[1]);
                float z = Integer.parseInt(args[2]);
                System.out.println(y / z);
                break;

            default:
                break;
        }
        sc.close();
    }
}
