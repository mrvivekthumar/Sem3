interface A {
    final int a = 10;
}

interface B {
    final int b = 20;
}

public class exp4_4 implements A, B {
    public static void main(String[] args) {
        exp4_4 a = new exp4_4();
        a.show();
    }

    public void show() {
        System.out.println(" a + b = " + (a + b));
    }
}
