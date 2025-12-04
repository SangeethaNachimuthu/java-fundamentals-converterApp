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
    This method used to convert the length from meter into kilometer
    and kilometer to meter.
     */
    public void lengthConverter() {

        System.out.println("a. Meter to Kilometer");
        System.out.println("b. Kilometer to Meter");
        String selectedOption = scan.next();
        double meter, kilometer;

        if(selectedOption.equals("a")) {
            meter = getValidInput("Enter length in meter: ");
            kilometer = meter/1000;
            System.out.println("Result: " +meter+ "m = " + kilometer +"km");
        } else if (selectedOption.equals("b")) {
            kilometer = getValidInput("Enter length in kilometer: ");
            meter = kilometer * 1000;
            System.out.println("Result: " +kilometer+ "km = " + meter +"m");
        } else {
            System.out.println("Invalid input. Choose 'a' or 'b'.");
        }
        convertedTime();
    }

    /*
    This method used to convert the weight from kilograms into grams
    and grams to kilograms.
     */
    public void weightConverter() {

        System.out.println("a. Kilograms to Grams");
        System.out.println("b. Grams to Kilograms");
        String selectedOption = scan.next();
        double grams, kilograms;

        if(selectedOption.equals("a")) {
            kilograms = getValidInput("Enter weight in kilograms: ");
            grams = kilograms * 1000;
            System.out.println("Result: " +kilograms+ "km = " + grams +"g");
        } else if (selectedOption.equals("b")) {
            grams = getValidInput("Enter weight in grams: ");
            kilograms = grams / 1000;
            System.out.println("Result: " +grams+ "g = " + kilograms +"kg");
        } else {
            System.out.println("Invalid input. Choose 'a' or 'b'.");
        }
        convertedTime();
    }

    /*
    This method used to convert the time from hours into minutes
    and minutes to hours.
     */
    public void timeConverter() {

        System.out.println("a. Hours to Minutes");
        System.out.println("b. Minutes to Hours");
        String selectedOption = scan.next();
        int hours , minutes;

        if (selectedOption.equals("a")) {
            hours = (int) getValidInput("Enter time in hours: ");
            minutes = hours * 60;
            System.out.println("Result: " + hours + "hrs = " + minutes + "mins");
        } else if (selectedOption.equals("b")) {
            minutes = (int) getValidInput("Enter time in minutes: ");
            hours = minutes / 60;
            System.out.println("Result: " + minutes + "mins = " + hours + "hrs");
        } else {
            System.out.println("Invalid input. Choose 'a' or 'b'.");
        }
        convertedTime();
    }

    /*
    This method used to convert the temperature from Celsius into Fahrenheit
    and Fahrenheit into Celsius.
     */
    public void temperatureConverter() {

        System.out.println("a. Celsius to Fahrenheit");
        System.out.println("b. Fahrenheit to Celsius");
        String selectedOption = scan.next();
        double tempInCel, tempInFah;

        if (selectedOption.equals("a")) {
            tempInCel = getValidInput("Enter temperature in celsius: ");
            tempInFah = (tempInCel * 9 / 5) + 32;
            System.out.printf("Result: %.2fF = %.2fC%n", tempInCel, tempInFah);
        } else if (selectedOption.equals("b")) {
            tempInFah = getValidInput("Enter temperature in fahrenheit: ");
            tempInCel = (tempInFah - 32) * 5 / 9;
            System.out.printf("Result: %.2fF = %.2fC%n", tempInFah, tempInCel);
        } else {
            System.out.println("Invalid input. Choose 'a' or 'b'.");
        }
        convertedTime();
    }

    /*
    This method used to convert the currency from SEK into USD
    and USD to SEK.
     */
    public void currencyConverter() {

        System.out.println("a. SEK to USD");
        System.out.println("b. USD to SEK");
        String selectedOption = scan.next();
        double curSEK, curUSD;

        if (selectedOption.equals("a")) {
            curSEK = getValidInput("Enter currency in SEK: ");
            curUSD = curSEK * 0.1058;
            System.out.printf("Result: %.2f SEK = %.2f USD%n", curSEK, curUSD);
        } else if (selectedOption.equals("b")) {
            curUSD = getValidInput("Enter currency in USD: ");
            curSEK = curUSD / 0.1058;
            System.out.printf("Result: %.2f USD = %.2f SEK%n", curUSD, curSEK);
        } else {
            System.out.println("Invalid input. Choose 'a' or 'b'.");
        }
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
