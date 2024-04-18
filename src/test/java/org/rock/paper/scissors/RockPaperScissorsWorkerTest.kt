package org.rock.paper.scissors

import org.junit.Assert
import org.junit.Test
import org.rock.paper.scissors.mock.MockBuilder

class RockPaperScissorsWorkerTest {
    @Test
    fun matchTied() {
        MockBuilder.setMockSelection("mockedValue", "r")

        var result = getResult("r")

        Assert.assertEquals(result, TIED)

        MockBuilder.setMockSelection("mockedValue", "p")

        result = getResult("p")

        Assert.assertEquals(result, TIED)

        MockBuilder.setMockSelection("mockedValue", "s")

        result = getResult("s")

        Assert.assertEquals(result, TIED)
    }

    @Test
    fun startRpsWithRockScissorsSelection() {
        MockBuilder.setMockSelection("mockedValue", "r")

        val result = getResult("s")

        Assert.assertEquals(result, LOSE)
    }

    @Test
    fun startRpsWithPaperScissorsSelection() {
        MockBuilder.setMockSelection("mockedValue", "p")

        val result = getResult("s")

        Assert.assertEquals(result, WIN)
    }

    @Test
    fun startRpsWithRockPaperSelection() {
        MockBuilder.setMockSelection("mockedValue", "r")

        val result = getResult("p")

        Assert.assertEquals(result, WIN)
    }

    @Test
    fun startRpsWithScissorsPaperSelection() {
        MockBuilder.setMockSelection("mockedValue", "s")

        val result = getResult("p")

        Assert.assertEquals(result, LOSE)
    }

    @Test
    fun startRpsWithPaperRockSelection() {
        MockBuilder.setMockSelection("mockedValue", "p")

        val result = getResult("r")

        Assert.assertEquals(result, LOSE)
    }

    @Test
    fun startRpsWithScissorsRockSelection() {
        MockBuilder.setMockSelection("mockedValue", "s")

        val result = getResult("r")

        Assert.assertEquals(result, WIN)
    }

    private fun getResult(yourSelection: String): String {
        return RockPaperScissorsWorker().startRps(null, yourSelection)
    }

    companion object {
        private const val LOSE = "You lose!"
        private const val WIN = "You win!"
        private const val TIED = "Match tied!"
    }
}