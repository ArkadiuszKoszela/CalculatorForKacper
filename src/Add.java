public class Add implements Calculator{

    @Override
    public void action(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }
}
