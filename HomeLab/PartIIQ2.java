package HomeLab;

class B {
    int a =50;
    public void show() {
        System.out.println("B show()");
    }
    public static void disp() {
        System.out.println("B disp()");
    }
}
class D extends B {
    int a = 20;
    public void show() {
        System.out.println("D show()");
    }
    public static void disp() {
        System.out.println("D disp()");
    }
}
class E extends D {
    public void show()
    { super.show();
        System.out.println("E show()"); }
}
public class PartIIQ2 {
    public static void DoPrint( B o ) { o.show(); }
    public static void main(String[] args)
    { B x = new B();
        B y = new D();
        D z = new D();
        E w = new E();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
        DoPrint(w);
        y.disp();
        System.out.println(x.a);
        System.out.println(y.a);
        System.out.println(z.a);
        System.out.println(w.a); }
}