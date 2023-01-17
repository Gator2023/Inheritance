package polymorphism;

public class TestMain {
    public static void main(String[] args) {

        // creating instance of parent
        Parent parent1 = new Parent();
        parent1.parent();

        Child child1 = new Child();
        child1.child();

        // creating instance of overload
        Overload overload1 = new Overload();
        overload1.name("Saima");
        overload1.name("Saima", "Samiha");

    }
}
