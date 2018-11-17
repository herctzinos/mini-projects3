package july6;

public class Super {

    protected int x = 5;

    public Super() {
        this(4);
        System.out.print("-" + method(7, 3, 2));
    }

    public Super(int i) {
        System.out.print("-" + method(i, 2));
        x += 3;
    }

    public int method(int i, int i2) {
        return (i + i2 + x);
    }

    public int method(int i, int i2, int i3) {
        return (i + i2 - i3 + x);
    }

}
