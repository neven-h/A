public class Driver {
    public static void main(String[] args) {
        A b1 = new B(2, 4);
        B b2 = new B(5, 5);
        A c1 = new C(4, 1);
        C c2 = new C(5, 7);


        System.out.println(!b1.foo(2));
        System.out.println(b1.foo(4));
        System.out.println(b2.foo(2));
        System.out.println(c1.foo(1));
        System.out.println(!c2.foo(7));
        System.out.println(!c2.foo(5));


    }
}