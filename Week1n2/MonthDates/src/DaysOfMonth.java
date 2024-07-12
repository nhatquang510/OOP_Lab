import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0, year = 0;
        boolean validYear = false, validMonth = false;
        boolean isLeapYear;
        int days = 0;

        while (!validYear) {
            try {
                System.out.print("Enter the year: ");
                year = Integer.parseInt(scanner.nextLine());
                validYear = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid year.");
            }
        }

        while (!validMonth) {
            try {
                System.out.print("Enter the month: ");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 1 || month > 12) {
                    System.out.println("Invalid month.");
                }
                else {
                    validMonth = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid month.");
            }
        }

        isLeapYear = (year % 4 == 0 && (year % 100 != 0)) || (year % 400 == 0);

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }

        System.out.println("The number of days in month " + month + " of year " + year + " is " + days);
    }
}
