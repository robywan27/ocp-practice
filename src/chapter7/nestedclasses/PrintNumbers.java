package chapter7.nestedclasses;

// 3. local classes
public class PrintNumbers {
    private int length = 5;
    int width = 20; // effectively final
    public void calculate() {
        int radius = 10;
//        width = 1; can't modify or can't be referenced in local class
        class Calculator {
            private int length = 2; // hides outer length; same if it's static

            private void multiply() {
                System.out.println(length * width); // 40 - refers to local length
                System.out.println(PrintNumbers.this.length * width); // 100 - refers to outer length
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
