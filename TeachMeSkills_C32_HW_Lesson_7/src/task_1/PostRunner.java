package task_1;
import task_1.Accountant;
import task_1.Director;
import task_1.Worker;

import java.util.Scanner;

/**
 * 1. Create classes "Director", "Worker", "Accountant".
 * Implement an interface with a method that sets the behavior for displaying the job title on the screen.
 * Implement this method in the created classes.
 * Create a runner class with a main method to run the program.
 * Request the job code from the console and display the job title on the screen.
 */
public class PostRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter post number (1 - Accountant,2 - Director, 3 - Worker):");
        int PostNumber = scanner.nextInt();

        switch (PostNumber) {
            case 1:
            Accountant accountant = new Accountant();
                accountant.ShowPostName();
                break;
            case 2:
                Director director = new Director();
                director.ShowPostName();
                break;
            case 3:
                Worker worker = new Worker();
                worker.ShowPostName();
                break;
            default:
                System.out.println("Cant find such post number");
        }
    }
}
