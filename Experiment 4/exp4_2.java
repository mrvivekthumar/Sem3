abstract class shape {
    int x, y;

    abstract void display();

    abstract void area();
}

class circle extends shape {
    int radius;

    circle(int a) {
        radius = a;
    }

    void display() {
        System.out.println(3.14 * radius * radius);
    }

    void area() {
        System.out.println("circle Area is Called");
    }
}

class rectangle extends shape {
    int length;
    int width;

    rectangle(int a, int b) {
        length = a;
        width = b;

    }

    void display() {
        System.out.println(length * width);
    }

    void area() {
        System.out.println("rectangle Area is Called");
    }
}

public class exp4_2 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(4, 5);
        circle c1 = new circle(3);
        r1.area();
        r1.display();
        c1.area();
        c1.display();
    }
}