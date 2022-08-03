import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements Calculator {
    @Override
    public void action(int firstNumber, int secondNumber) {
        BigDecimal firstDecimal = new BigDecimal(firstNumber);
        BigDecimal secondDecimal = new BigDecimal(secondNumber);
        BigDecimal result2 = firstDecimal.divide(secondDecimal, 4, RoundingMode.HALF_UP);
        System.out.println(result2);
    }
}
