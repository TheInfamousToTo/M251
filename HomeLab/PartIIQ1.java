package HomeLab;

public class PartIIQ1 {
    public static int f(int a, String s)
    { s = "Java";
        a=++a;
        return a;}
    public static void test()
    { int n=10;
        String s1 = "Python";
        n = f(n,s1);
        System.out.println("n="+n+"\n s1="+s1);
        String s2 = "Java";
        String s3 = s2;
        String s4 = new String("Java");
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));
    }
    public static void main(String args[])
    { test();}
}
