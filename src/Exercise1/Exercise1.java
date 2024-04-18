import java.io.*;

public class Exercise1 {
    public static void main(String[] args) {
        final int divisor = 10;
        try(BufferedReader br = new BufferedReader(new FileReader("src/Book1.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("stats.txt")))
        {
            String line = br.readLine();

            String[] numbers = line.split(",");
            int sum = 0;
            int max = Integer.parseInt(numbers[0]);
            int min = Integer.parseInt(numbers[0]);

            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            for (int i = 1; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) > max) {
                    max = Integer.parseInt(numbers[i]);
                }
            }
            for (int i = 1; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) < min) {
                    min = Integer.parseInt(numbers[i]);
                }
            }

            double avg = sum / divisor;

            bw.write(String.format("The sum of the numbers is: %d\n", sum));
            bw.write(String.format("The lowest number is: %d\n", min));
            bw.write(String.format("The highest number is: %d\n", max));
            bw.write(String.format("The average of the numbers is: %.2f\n", avg));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}