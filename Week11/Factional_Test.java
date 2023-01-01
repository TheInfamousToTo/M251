package Week11;

public class Factional_Test {
    public static long fact1(int n) {
        long product = 1;
        for (int i = n; i >= 1; i--) {
            product = product * i;
        }
        return product;
    }
    /*public static void main(String[] args)
    {
        System.out.println("5!= "+ fact1(5));
    }*/
    public static long fact2( int n)
    {
        if (n == 0) // Base case
            return 1;
        else
            return n * fact2(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("5!= "+ fact2(5));
    }

}
