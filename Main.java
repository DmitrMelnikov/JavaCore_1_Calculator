import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // получаем а = 3
        int b = calc.minus.apply(1, 1); // получаем b = 0
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);


    }
}
