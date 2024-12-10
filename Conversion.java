import javax.swing.*;

public class Conversion {
    // Length  
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }
    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }
    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }
    public static double metersToYards(double meters) {
        return meters / 0.9144;
    }

    // Weight 
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }
    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000;
    }
    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }
    public static double gramsToOunces(double grams) {
        return grams / 28.3495;
    }
    public static double stonesToKilograms(double stones) {
        return stones * 6.35029;
    }
    public static double kilogramsToStones(double kilograms) {
        return kilograms / 6.35029;
    }

    // Temperature 
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Time 
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }
    public static double hoursToSeconds(double hours) {
        return hours * 3600;
    }
    public static double secondsToHours(double seconds) {
        return seconds / 3600;
    }
    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }
    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }
    public static double daysToHours(double days) {
        return days * 24;
    }
    public static double hoursToDays(double hours) {
        return hours / 24;
    }

    public void conversionCalculator() {
        while (true) {
            String category = JOptionPane.showInputDialog(null, 
                "Enter the conversion category (length, weight, temperature, time) or 'exit' to quit:");

            if (category == null || category.equalsIgnoreCase("exit")) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }

            switch (category.toLowerCase()) {
                case "length" -> handleLengthConversion();
                case "weight" -> handleWeightConversion();
                case "temperature" -> handleTemperatureConversion();
                case "time" -> handleTimeConversion();
                default -> JOptionPane.showMessageDialog(null, "Invalid category. Please try again.");
            }
        }
    }

    private void handleLengthConversion() {
        String lengthOption = JOptionPane.showInputDialog(null, """
            Enter a conversion option:
            "M2F" for metersToFeet ; "F2M" for feetToMeters
            "M2KM" for metersToKilometers ; "KM2M" for kilometersToMeters
            "CM2IN" for centimetersToInches ; "IN2CM" for inchesToCentimeters
            "MI2KM" for milesToKilometers ; "KM2MI" for kilometersToMiles
            "YD2M" for yardsToMeters ; "M2YD" for metersToYards
            """);

        if (lengthOption == null) return;

        try {
            double lengthValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value:"));
            double lengthResult = switch (lengthOption.toUpperCase()) {
                case "M2F" -> metersToFeet(lengthValue);
                case "F2M" -> feetToMeters(lengthValue);
                case "M2KM" -> metersToKilometers(lengthValue);
                case "KM2M" -> kilometersToMeters(lengthValue);
                case "CM2IN" -> centimetersToInches(lengthValue);
                case "IN2CM" -> inchesToCentimeters(lengthValue);
                case "MI2KM" -> milesToKilometers(lengthValue);
                case "KM2MI" -> kilometersToMiles(lengthValue);
                case "YD2M" -> yardsToMeters(lengthValue);
                case "M2YD" -> metersToYards(lengthValue);
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    yield Double.NaN;
                }
            };
            if (!Double.isNaN(lengthResult)) {
                JOptionPane.showMessageDialog(null, "Result: " + lengthResult);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }

    private void handleWeightConversion() {
        String weightOption = JOptionPane.showInputDialog(null, """
            Enter a conversion option:
            "KG2LB" for kilogramsToPounds ; "LB2KG" for poundsToKilograms
            "G2KG" for gramsToKilograms ; "KG2G" for kilogramsToGrams
            "OZ2G" for ouncesToGrams ; "G2OZ" for gramsToOunces
            "ST2KG" for stonesToKilograms ; "KG2ST" for kilogramsToStones
            """);

        if (weightOption == null) return;

        try {
            double weightValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value:"));
            double weightResult = switch (weightOption.toUpperCase()) {
                case "KG2LB" -> kilogramsToPounds(weightValue);
                case "LB2KG" -> poundsToKilograms(weightValue);
                case "G2KG" -> gramsToKilograms(weightValue);
                case "KG2G" -> kilogramsToGrams(weightValue);
                case "OZ2G" -> ouncesToGrams(weightValue);
                case "G2OZ" -> gramsToOunces(weightValue);
                case "ST2KG" -> stonesToKilograms(weightValue);
                case "KG2ST" -> kilogramsToStones(weightValue);
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    yield Double.NaN;
                }
            };
            if (!Double.isNaN(weightResult)) {
                JOptionPane.showMessageDialog(null, "Result: " + weightResult);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }

    private void handleTemperatureConversion() {
        String tempOption = JOptionPane.showInputDialog(null, 
            "Enter a conversion option:\nF2C for Fahrenheit to Celsius ; C2F for Celsius to Fahrenheit");
        if (tempOption == null) return;

        try {
            double tempValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value:"));
            double tempResult = switch (tempOption.toUpperCase()) {
                case "F2C" -> fahrenheitToCelsius(tempValue);
                case "C2F" -> celsiusToFahrenheit(tempValue);
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    yield Double.NaN;
                }
            };
            if (!Double.isNaN(tempResult)) {
                JOptionPane.showMessageDialog(null, "Result: " + tempResult);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }

    private void handleTimeConversion() {
        String timeOption = JOptionPane.showInputDialog(null, """
            Enter a conversion option:
            "H2M" for hoursToMinutes ; "M2H" for minutesToHours
            "H2S" for hoursToSeconds ; "S2H" for secondsToHours
            "M2S" for minutesToSeconds ; "S2M" for secondsToMinutes
            "D2H" for daysToHours ; "H2D" for hoursToDays
            """);
        if (timeOption == null) return;

        try {
            double timeValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value:"));
            double timeResult = switch (timeOption.toUpperCase()) {
                case "H2M" -> hoursToMinutes(timeValue);
                case "M2H" -> minutesToHours(timeValue);
                case "H2S" -> hoursToSeconds(timeValue);
                case "S2H" -> secondsToHours(timeValue);
                case "M2S" -> minutesToSeconds(timeValue);
                case "S2M" -> secondsToMinutes(timeValue);
                case "D2H" -> daysToHours(timeValue);
                case "H2D" -> hoursToDays(timeValue);
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    yield Double.NaN;
                }
            };
            if (!Double.isNaN(timeResult)) {
                JOptionPane.showMessageDialog(null, "Result: " + timeResult);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }
}