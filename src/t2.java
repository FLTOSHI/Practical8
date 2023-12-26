import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        int sumDig = 0;
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                sumDig += Character.getNumericValue(c);
            }
        }

        System.out.println("Сумма цифр в строке: " + sumDig);
    }
}