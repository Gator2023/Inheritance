package polymorphism;
public class XEMethodOverloading {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    static int add( int a, int b, int c, int d )
    {
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("add() with 2 parameters");
        System.out.println(add(6, 8));

        System.out.println("add() with 2 parameters");
        System.out.println(add(6, 8, 10));

        System.out.println("add() with 2 parameters");
        System.out.println(add(6, 8, 10, 12));

    }
}
