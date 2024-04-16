package org.rock.paper.scissors;

import org.junit.Test;
import org.rock.paper.scissors.mock.MockBuilder;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsWorkerTest {

    private final static String LOSE = "You lose!";
    private final static String WIN = "You win!";
    private final static String TIED = "Match tied!";

    @Test
    public void matchTied() {
        MockBuilder.setMockSelection("mockedValue", "r");

        String result = getResult("r");

        assertEquals(result, TIED);

        MockBuilder.setMockSelection("mockedValue", "p");

        result = getResult("p");

        assertEquals(result, TIED);

        MockBuilder.setMockSelection("mockedValue", "s");

        result = getResult("s");

        assertEquals(result, TIED);
    }

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

    @Test
    public void startRpsWithPaperRockSelection() {
        MockBuilder.setMockSelection("mockedValue", "p");

        String result = getResult("r");

        assertEquals(result, LOSE);
    }

    @Test
    public void startRpsWithScissorsRockSelection() {
        MockBuilder.setMockSelection("mockedValue", "s");

        String result = getResult("r");

        assertEquals(result, WIN);
    }

    private String getResult(String yourSelection) {
        RockPaperScissorsWorker worker = new RockPaperScissorsWorker();
        return worker.startRps(null, yourSelection);
    }
}