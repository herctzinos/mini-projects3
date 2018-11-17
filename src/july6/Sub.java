package july6;

public class Sub extends Super {

    int x = 3;

    public int method(int x, int x2) {
        return (this.x * 2) + (x + x2 + super.x);
    }
    
    public static void main(String ars[]) {
        Super s = new Sub();
        Super s1 = new Super();
        Sub s2 = new Sub();
    }
}
