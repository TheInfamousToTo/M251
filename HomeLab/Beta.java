package HomeLab;

class Alpha
{ public String type = "a ";
    public Alpha() { System.out.print("\nalpha "); }
    public static void write()
    { System.out.println("Writing..."); }
}
public class Beta extends Alpha
{ public Beta() { System.out.print("beta "); }
    void go()
    { type = "b ";
        System.out.print(this.type + super.type); }
    public static void write()
    { System.out.println("Writing code"); }
    public static void main(String[] args)
    { Alpha a = new Beta();
        ((Beta) a).go();
        a.write();
    }
}
