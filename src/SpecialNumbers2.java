import java.util.Scanner;

public class SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1111; number <= 9999; number++) {

            int units = number % 10;
            int tens = number / 10 % 10;
            int hundreds = number / 100 % 10;
            int thousands = number / 1000;

            boolean checkUnits = units != 0 && n % units == 0;
            boolean checkTens = tens != 0 && n % tens == 0;
            boolean checkHundreds = hundreds != 0 && n % hundreds == 0;
            boolean checkThousands = n % thousands == 0;

            if (checkUnits && checkTens && checkHundreds && checkThousands) {
                System.out.print(number + " ");
            }

        }
    }
}
