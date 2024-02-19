import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String expression = scanner.nextLine();
        System.out.println(separate(expression));
    }

    public static String separate(String expression) throws Exception{
        int num1 = 0, num2 = 0;
        String operation, result;
        boolean isRoman = true;
        String[] operands = expression.split("[+\\-*/]");
        if (operands.length != 2) throw new Exception("Должно быть два операнда!");
        operation = detectOperation(expression);
        if (operation == null) throw new Exception("Данная математическая операция недопустима!");
        if (Roman.isRoman(operands[0]) && Roman.isRoman((operands[1]))) {
            num1 = Roman.fromRomanToArabian(operands[0]);
            num2 = Roman.fromRomanToArabian(operands[1]);
            isRoman = true;
        }
        else if (!Roman.isRoman(operands[0]) && !Roman.isRoman(operands[1])) {
            num1 = Integer.parseInt(operands[0]);
            num2 = Integer.parseInt(operands[1]);
            isRoman = false;
        }
        else {
            throw new Exception("Числа должны быть одного формата!");
        }

        if (num1 > 10 || num2 > 10) { throw new Exception("Числа должны быть от 1 до 10"); }

        int arabian =calc(num1, num2, operation);
        if (isRoman) {
            if(arabian <= 0) {
                throw new Exception("Римское число должно быть больше нуля");
            }
            result = Roman.fromArabianToRoman(arabian);
        } else { result = String.valueOf(arabian); }
        return result;
    }

    public static String detectOperation(String expression) {
        if (expression.contains("+")) return "+";
        else if (expression.contains("-")) return "-";
        else if (expression.contains("*")) return "*";
        else if (expression.contains("/")) return "/";
        else return null;
    }

    public static int calc(int a, int b, String operation) {
        if (operation.equals("+")) return a+b;
        else if (operation.equals("-")) return a-b;
        else if (operation.equals("*")) return a*b;
        else return a/b;
    }

}