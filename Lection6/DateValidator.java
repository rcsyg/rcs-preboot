import java.util.Scanner;

public class DateValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date: ");
        int date = scanner.nextInt();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        if (date > 0 && month > 0) {

            int maxDays = 31;
            String monthName = "";
            boolean invalidInput = false;

            switch (month) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
					/* if (year % 4 == 0) {
						maxDays = 29;
					} else {
						maxDays = 28;
					} */
                    maxDays = (year % 4 == 0) ? 29 : 28;
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    maxDays = 30;
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    maxDays = 30;
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    maxDays = 30;
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    maxDays = 30;
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    invalidInput = true;
            }

            if (!invalidInput && date <= maxDays) {

                if (year < 0) {
                    year = year * -1;
                    System.out.println(date + ". " + monthName + ", " + year + " BC");
                } else {
                    System.out.println(date + ". " + monthName + ", " + year);
                }

            } else {
                System.out.println("Invalid request");
            }
        } else {
            System.out.println("Invalid request");
        }


    }

}
