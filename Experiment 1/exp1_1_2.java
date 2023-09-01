public class exp1_1_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = -2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 2; j > i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");

        }
    }
}
