import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConverterApp {

    Scanner scan = new Scanner(System.in);

    public void main(String[] args) {

        System.out.println("==== Calculator App ====");
        System.out.println("1. Length Converter");
        System.out.println("2. Weight Converter");
        System.out.println("3. Time Converter");
        System.out.println("4. Temperature Converter");
        System.out.println("5. Currency Converter");
        System.out.println("6. Grade Converter");
        System.out.println("7. Exit");

        int option = 0;
        do {
            System.out.println("Choose an option (1 to 7): ");
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
                    temperatureConverter();
                    break;
                case 5:
                    currencyConverter();
                    break;
                case 6:
                    gradeConverter();
                    break;
                case 7:
                    System.out.println("Thanks for using the Converter App.");
                    break;
                default:
                    System.out.println("Please enter the correct options from 1 to 7.");
            }
        } while (option != 7);
    }

    /*
    This method used to convert the length from meter into kilometer.
     */
    public void lengthConverter() {

        double meter = getValidInput("Enter length in meter: ");
        double kilometer = meter/1000;
        System.out.println("Result: " +meter+ "m = " + kilometer +"km");
        convertedTime();
    }

    /*
    This method used to convert the weight from kilograms into grams.
     */
    public void weightConverter() {
        double kilograms = getValidInput("Enter weight in kilograms: ");
        double grams = kilograms*1000;
        System.out.println("Result: " +kilograms+ "kg = " + grams +"g");
        convertedTime();
    }

    /*
    This method used to convert the time from hours into minutes.
     */
    public void timeConverter() {
        int hours = (int) getValidInput("Enter time in hours: ");
        int minutes = hours*60;
        System.out.println("Result: " +hours+ "hrs = " + minutes +"mins");
        convertedTime();
    }

    /*
    This method used to convert the temperature from Celsius into Fahrenheit.
     */
    public void temperatureConverter() {
        double tempInCel = getValidInput("Enter temperature in celsius: ");
        double tempInFah = (tempInCel * 9/5) + 32;
        System.out.println("Result: " +tempInCel+ "C = " + tempInFah +"F");
        convertedTime();
    }

    /*
    This method used to convert the currency from SEK into USD.
     */
    public void currencyConverter() {
        double curSEK = getValidInput("Enter currency in SEK: ");
        double curUSD = curSEK * 0.1058;
        System.out.printf("%.2f SEK = %.2f USD%n", curSEK, curUSD);
        convertedTime();
    }

    /*
    This method used to convert the mark from percentage to grade.
     */
    public void gradeConverter() {
        double percentage = getValidInput("Enter grade in Percentage: ");
        if(percentage >= 90) {
            System.out.println("Result: " +percentage+ " % = " +"Grade A");
        } else if(percentage >= 80) {
            System.out.println("Result: " +percentage+ " % = " +"Grade B");
        } else if (percentage >= 70) {
            System.out.println("Result: " +percentage+ " % = " +"Grade C");
        } else if (percentage >= 60) {
            System.out.println("Result: " +percentage+ " % = " +"Grade D");
        } else {
            System.out.println("Result: " +percentage+ " % = " +"Grade E");
        }
        convertedTime();
    }

    /*
    This method validates the user input and accepts only positive numbers.
     */
    public double getValidInput(String message) {
        double input;
        while(true)
        {
            System.out.println(message);
            if(scan.hasNextDouble()) {
                input = scan.nextDouble();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Values can't be negative. Try again.");
                }
            } else {
                System.out.println("Invalid input. Enter a number.");
                scan.next();
            }
        }
        return input;
    }

    /*
     This method displays the current date and time in the formatted pattern.
     */
    public void convertedTime() {
        LocalDateTime dateTime = LocalDateTime.now();   //Get the current time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd HH:mm");
        System.out.println("Converted at: " + dateTime.format(formatter));
    }
}
