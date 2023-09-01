public class exp3_1 {
    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 8 };
        int[] b = { 1, 2, 3, 4 };
        int[] c = new int[8];
        for (int i = 0; i < 4; i++) {
            c[i] = a[i];
            c[4 + i] = b[i];
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(c[i] + " ");
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
