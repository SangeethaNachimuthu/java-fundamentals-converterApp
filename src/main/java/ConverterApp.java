import java.util.Scanner;

public class ConverterApp {

    Scanner scan = new Scanner(System.in);

    public void main(String[] args) {

        System.out.println("==== Calculator App ====");
        System.out.println("1. Length Converter");
        System.out.println("2. Weight Converter");
        System.out.println("3. Time Converter");
        System.out.println("4. Exit");

        int option = 0;
        do {
            System.out.println("Choose an option (1 to 4): ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    lengthConverter();
                    break;
                case 2:
                    weightConverter();
                    break;
                case 3:
                    timeConverter();
                    break;
                case 4:
                    System.out.println("Thanks for using the Converter App.");
                    break;
                default:
                    System.out.println("Please enter the correct options from 1 to 4.");
            }
        } while (option < 4);
    }

    /*
    This method used to convert the meter into kilometer.
     */
    public void lengthConverter() {
        System.out.println("Enter length in meter: ");
        double meter = scan.nextDouble();
        double kilometer = meter/1000;
        System.out.println("Result: " +meter+ "m = " + kilometer +"km");
    }

    /*
    This method used to convert the kilograms into grams.
     */
    public void weightConverter() {
        System.out.println("Enter weight in kilograms: ");
        double kilograms = scan.nextDouble();
        double grams = kilograms*1000;
        System.out.println("Result: " +kilograms+ "kg = " + grams +"g");
    }

    /*
    This method used to convert the hours into minutes.
     */
    public void timeConverter() {
        System.out.println("Enter time in hours: ");
        int hours = scan.nextInt();
        int minutes = hours*60;
        System.out.println("Result: HH:" +hours+ " = mm:" + minutes);
    }
}
