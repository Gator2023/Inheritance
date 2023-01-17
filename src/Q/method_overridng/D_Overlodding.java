package Q.method_overridng;

public class D_Overlodding  {
    public static void main(String[] args) {

        A_Shape shape=new A_Shape();
        shape.area();

        B_Square square=new B_Square();
        square.area();

        C_Rectangle rectangle=new C_Rectangle();
        rectangle.area();

    }
}
