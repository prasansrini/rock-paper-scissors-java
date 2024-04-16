package org.rock.paper.scissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] rps = new String[]{"r", "p", "s"};

        RockPaperScissorsWorker worker = new RockPaperScissorsWorker();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String computerTurn = rps[random.nextInt(rps.length)];

            System.out.println("Computer has played. It is your turn.");

            System.out.print("Please enter your options (r/p/s): ");
            String yourSelection = scanner.next();
            String result = worker.startRps(computerTurn, yourSelection);

            System.out.println(result);

            System.out.print("Do you want to continue? (n|N to exit [or] any other key to continue...): ");

            String continueToPlay = scanner.next();

            if (continueToPlay.equals("n") || continueToPlay.equals("N")) {
                System.exit(0);
            }
        }
    }
}