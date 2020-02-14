package ScrabbleCalculator;


import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                System.out.println("Enter a word (type 'q' to quit): ");
                String input = br.readLine();
                if (input.equals("q")) {
                    break;
                }
                Calculation w1 = new Calculation(input);
                System.out.println(input + " = " + w1.calculateScore() + " points");
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

}
