package seminars.first.Calculator;

import org.assertj.core.api.Assertions;

public class CalculatorTest {
    public static void main(String[] args) {

        Assertions.assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        Assertions.assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        Assertions.assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        Assertions.assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        Assertions.assertThatThrownBy(() -> Calculator.calculation(1, 0, '/'))
                  .isInstanceOf(ArithmeticException.class)
                  .hasMessageContaining("Деление на ноль невозможно");

        Assertions.assertThatThrownBy(() -> Calculator.calculation(1, 1, '%'))
                  .isInstanceOf(IllegalStateException.class)
                  .hasMessageContaining("Неожиданное значение оператора: %");

        Assertions.assertThat(Calculator.squareRootExtraction(169)).isEqualTo(13.0);

        Assertions.assertThatThrownBy(() -> Calculator.squareRootExtraction(-1))
                  .isInstanceOf(IllegalArgumentException.class)
                  .hasMessageContaining("Невозможно вычислить квадратный корень из отрицательного числа");

        Assertions.assertThat(Calculator.calculateDiscount(100, 10)).isEqualTo(90.0);
        Assertions.assertThat(Calculator.calculateDiscount(0, 0)).isEqualTo(0.0);
        Assertions.assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100.0);
        Assertions.assertThat(Calculator.calculateDiscount(100, 100)).isEqualTo(0.0);

        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 10))
                  .isInstanceOf(ArithmeticException.class)
                  .hasMessageContaining("Недопустимая сумма покупки или размер скидки");

        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(100, -10))
                  .isInstanceOf(ArithmeticException.class)
                  .hasMessageContaining("Недопустимая сумма покупки или размер скидки");

        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(100, 110))
                  .isInstanceOf(ArithmeticException.class)
                  .hasMessageContaining("Недопустимая сумма покупки или размер скидки");
    }
}