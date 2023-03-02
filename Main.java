import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        BinaryOperator<Integer> errorDevide = (x, y) -> {
            if (y == 0) {
                return Integer.MAX_VALUE;
            } else {
                return calc.devide.apply(x, y);
            }
        };

        int a = calc.plus.apply(1, 2); // получаем а = 3
        int b = calc.minus.apply(1, 1); // получаем b = 0
        int c = errorDevide.apply(a, b);

        if (c == Integer.MAX_VALUE) {
            System.out.println("Деление на ноль !!!");
            calc.println.accept(c);
        } else {
            calc.println.accept(c);
        }

    }
}
