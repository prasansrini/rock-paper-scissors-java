package org.rock.paper.scissors;

import org.junit.Test;
import org.rock.paper.scissors.mock.MockBuilder;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsWorkerTest {

    private final static String LOSE = "You lose!";
    private final static String WIN = "You win!";
    private final static String TIED = "Match tied!";

    @Test
    public void startRpsWithRockScissorsSelection() {
        MockBuilder.setMockSelection("mockedValue", "r");

        String result = getResult("s");

        assertEquals(result, LOSE);
    }

    @Test
    public void startRpsWithPaperScissorsSelection() {
        MockBuilder.setMockSelection("mockedValue", "p");

        String result = getResult("s");

        assertEquals(result, WIN);
    }

    @Test
    public void startRpsWithRockPaperSelection() {
        MockBuilder.setMockSelection("mockedValue", "r");

        String result = getResult("p");

        assertEquals(result, WIN);
    }

    @Test
    public void startRpsWithScissorsPaperSelection() {
        MockBuilder.setMockSelection("mockedValue", "s");

        String result = getResult("p");

        assertEquals(result, LOSE);
    }

    private String getResult(String yourSelection) {
        RockPaperScissorsWorker worker = new RockPaperScissorsWorker();
        return worker.startRps(null, yourSelection);
    }
}