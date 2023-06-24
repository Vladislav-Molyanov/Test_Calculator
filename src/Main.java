import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическое выражение через пробел");
        String input = scanner.nextLine();

        String result = calc(input);
        System.out.println(result);
    }

    public static String calc(String input) {

        String[] tokens = input.split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        int firstOperand;
        int secondOperand;
        try {
            firstOperand = Integer.parseInt(tokens[0]);
            secondOperand = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Некорректное число");
        }
        if (firstOperand < 1 || firstOperand > 10 || secondOperand < 1 || secondOperand > 10) {
            throw new IllegalArgumentException("Число не подходит в заданный диапазон");
        }

        String operator = tokens[1];
        int result = 0;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            default:
                throw new IllegalArgumentException("Некорректная операция");
        }
        return Integer.toString(result);
    }
}
