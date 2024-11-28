package chapter7.nestedclasses;

// 3. local classes
public class PrintNumbers {
    private int length = 5; // effectively final
    public void calculate() {
        final int width = 20; // explicitly declared final
        int radius = 10;
        class Calculator {
            private void multiply() {
                System.out.println(length * width); // it is allowed to access both fields
            }
            private void subtract() {
//                System.out.println(length * width - radius); // not possible to access radius because it is modified
                // in the method
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
        radius = 5; // radius modified here
    }

    { // local class inside instance initializer
        int x = 2;
        class A {
            public void print() {
                System.out.println(x + length);
            }
        }
        A a = new A();
        a.print(); // 7 - printed before main is executed (remember class initialization process)
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate(); // 100
    }
}
