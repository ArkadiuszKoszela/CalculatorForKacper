import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        doAction();
    }

    private static void doAction() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj pierwszą liczbę: ");
            int x;
            String next = scanner.next();
            if (next.equals("e"))
                break;
            else
                x = Integer.parseInt(next);
            System.out.println("Podaj drugą liczbę: ");
            int y;
            String next1 = scanner.next();
            if (next1.equals("e"))
                break;
            else
               y = Integer.parseInt(next1);

            Calculator calculator = new Add();
            calculator.action(x, y);
        }
        doAction();
    }
}