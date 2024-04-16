package org.rock.paper.scissors;

import org.rock.paper.scissors.mock.MockBuilder;

public class RockPaperScissorsWorker {
    private static final String MOCK_KEY = "mockedValue";

    public String startRps(String computerSelection, String yourSelection) {

        String computerTurn = MockBuilder.containsGet(MOCK_KEY, computerSelection);

        if (yourSelection.equals("r") || yourSelection.equals("p") || yourSelection.equals("s")) {
            if (!MockBuilder.contains(MOCK_KEY)) {
                System.out.println("Computer's choice : " + computerTurn);
            }

            if (computerTurn.equals(yourSelection)) {
                return printResult(3);
            }

            switch (computerTurn) {
                case "r" -> {
                    if (yourSelection.equals("p")) {
                        return printResult(1);
                    } else {
                        return printResult(2);
                    }
                }
                case "p" -> {
                    if (yourSelection.equals("s")) {
                        return printResult(1);
                    } else {
                        return printResult(2);
                    }
                }
                case "s" -> {
                    if (yourSelection.equals("r")) {
                        return printResult(1);
                    } else {
                        return printResult(2);
                    }
                }
                default -> {
                    return null;
                }
            }
        } else {
            return "Invalid selection!";
        }
    }

    private String printResult(int isWin) {
        if (isWin == 1) {
            return "You win!";
        } else if (isWin == 2) {
            return "You lose!";
        } else {
            return "Match tied!";
        }
    }
}
