package chapter7.nestedclasses;

// 1. inner classes
public class A {
    private int x = 10;
    class B {
        private int x = 20;
        class C {
            private int x = 30;
            public void allTheX() {
                System.out.println(x); // 30
                System.out.println(this.x); // 30 - equivalent to previous line
                System.out.println(B.this.x); // 20
                System.out.println(A.this.x); // 10
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B(); // type is defined starting from outermost (B is also valid because it is at member level
        // of A)
        A.B.C c = b.new C(); // this is even more nested, and it's mandatory to write the type this way
        c.allTheX();
    }
}
