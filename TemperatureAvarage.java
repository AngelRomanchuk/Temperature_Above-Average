import java.util.Scanner;

public class TemperatureAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input from the user for the number of temperature values
        System.out.print("Enter the number of temperature values: ");
        int numTempValues = scanner.nextInt();

        // Prompt the user to enter the temperature values
        double[] temperatures = new double[numTempValues];
        System.out.println("Enter the " + numTempValues + " temperature values:");
        for (int i = 0; i < numTempValues; i++) {
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate the average temperature
        double sum = 0;
        for (int i = 0; i < numTempValues; i++) {
            sum += temperatures[i];
        }
        double average = sum / numTempValues;

        // Count how many temperatures are above the average
        int countAboveAverage = 0;
        for (int i = 0; i < numTempValues; i++) {
            if (temperatures[i] > average) {
                countAboveAverage++;
            }
        }

        // Output results
        System.out.println("Average temperature: " + average);
        System.out.println("Number of days with temperatures above the average: " + countAboveAverage);

        scanner.close();
    }
}
