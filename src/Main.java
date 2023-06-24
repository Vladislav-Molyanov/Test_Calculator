import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическое выражение через пробел");
        String reques = scanner.nextLine();


        String result = calc(reques);
        System.out.println(result);
    }
    public static String calc(String input) {

        String[] tokens = input.trim().split(" ");
        if (tokens.length > 3 || tokens.length < 3) {
            throw new ArithmeticException("Ошибочная арифметическая операция");
        }
        int operandOne = Integer.parseInt(tokens[0]);

        int operandTwo = Integer.parseInt(tokens[2]);
        if (operandOne < 1 || operandOne > 10 || operandTwo < 1 || operandTwo > 10) {
            throw new IllegalArgumentException("Число не подходит в заданный диапазон");
        }
        String operator = tokens[1];
        int calc = 0;
        switch (operator) {
            case "+":
                calc = operandOne + operandTwo;
                break;
            case "-":
                calc = operandOne - operandTwo;
                break;
            case "*":
                calc = operandOne * operandTwo;
                break;
            case "/":
                if (operandTwo == 0) {
                    throw new ArithmeticException("Деление на 0 невозможно");
                }
                calc = operandOne / operandTwo;
                break;
            default:
                throw new IllegalArgumentException("Некорректная операция");


        }
        String result = Integer.toString(calc);
        return result;
    }
}


