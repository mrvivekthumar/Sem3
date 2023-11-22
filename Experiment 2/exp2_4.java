public class exp2_4 {
    public static void main(String[] args) {
        int i;
        int[][] a = new int[10][10];
        for (int k = 0; k < 10; k++) {
            for (i = 0; i < 10; i++) {
                a[k][i] = (k + 1) * (i + 1);
            }
        }
        for (int k = 0; k < 10; k++) {
            for (i = 0; i < 10; i++) {
                System.out.print(a[k][i]);
                System.out.print("    ");
            }
            System.out.print("\n");
            System.out.print("\n");
        }
    }
}
