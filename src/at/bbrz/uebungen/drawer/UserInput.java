package at.bbrz.uebungen.drawer;

import java.util.Scanner;
public class UserInput {
    private int width;
    private int height;
    private final Scanner sc = new Scanner(System.in);
    public void doInput() {
        width = userInput(1, 40, "Enter width as integer between 1 and 40!");
        height = userInput(1, 20, "Enter height as integer between 1 and 20!");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int userInput(int cLow, int cHigh, String prompt) {
        int num;
        do {
            System.out.println(prompt);
            while(!sc.hasNextInt()) {
                sc.next();
                System.err.println("Invalid Input!");
            }
            num = sc.nextInt();
            if(num == -1) {
                System.out.println("Exiting Program!");
                System.exit(0);
            }
            if(num < cLow || num > cHigh) {
                System.err.println("Invalid Input!");
            }
        } while(num < cLow || num > cHigh);
        return num;
    }
}