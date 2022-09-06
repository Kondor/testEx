import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        List<Integer> integerNumber = new ArrayList<Integer>();

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            int count = 0;
            List<Integer> listNumber = new ArrayList<>();
            while (number != 0) {
                count++;
                listNumber.add(number % 10);
                number = number / 10;

            }



            int sumNumber = 0;
            if (count <= 5) {
                for (int num : listNumber) {
                    sumNumber += num;
                }

                if (sumNumber % 5 == 0) {
                    System.out.println("The sum of the numbers is divided by 5");
                } else {
                    System.out.println("The sum of the numbers is not divisible by 5");
                }
            } else {
                System.out.println("The user entered more than 5 digits");
            }

        }


    }

}
