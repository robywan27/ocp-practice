package chapter8.methodreferences;

// 1. static methods
public interface Converter {
    long round(double num);
}

class ConverterTester {
    public static void main(String[] args) {
//        Converter converter = x -> Math.round(x);
        Converter converter = Math::round; // round() is a static method
        System.out.println(converter.round(10.56)); // 10 - even though round() is an overloaded method, Java infers
        // the information from the context, i.e. the interface method
    }
}
