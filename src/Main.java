import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int counter = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        // take five valid input from user
        while (counter < 6) {
            System.out.println("Enter number #" + counter + ":");
            String inputNumber = scanner.nextLine();

            // Give error to user if the number is not valid
            try {
                int number = Integer.parseInt(inputNumber);
                sum += number;
                counter++;
            } catch (Exception ex) {
                System.out.println("Invalid Number");
            }
        }

        System.out.println("Sum of five numbers entered is " + sum);
    }
}