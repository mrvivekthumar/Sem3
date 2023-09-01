import java.util.Scanner;

public class exp2_3 {
    public static void main(String[] args) {
        System.out.println("1 . For Duplication Of Digit Is Allowed");
        System.out.println("2 . For Duplication Of Digit Is Not Allowed");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i, j, k, l;
        int a[] = { 1, 2, 3, 4 };
        switch (x) {
            case 1:
                for (i = 0; i < 4; i++) {
                    for (j = 0; j < 4; j++) {
                        for (k = 0; k < 4; k++) {
                            for (l = 0; l < 4; l++) {
                                if (a[j] > a[i] && a[l] < a[k]) {
                                    System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + a[l] + " ");
                                }

                            }
                        }
                    }
                }
                break;
            case 2:
                for (i = 0; i < 4; i++) {
                    for (j = 0; j < 4; j++) {
                        for (k = 0; k < 4; k++) {
                            for (l = 0; l < 4; l++) {
                                if (i != j && j != k && k != l && l != i && i != k && j != l) {
                                    if (a[j] > a[i] && a[l] < a[k]) {
                                        System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + a[l] + " ");
                                    }
                                }
                            }
                        }
                    }
                }
                break;

            default:
                break;

        }
        sc.close();
    }
}
