package jc_homework_1;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // Dividing by zero isn't allowed
        // We can use ternary operator
        int c = calc.divide.apply(a,b);

        calc.println.accept(c);
    }
}
