package ocp.exam.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PromotionsTest {
    @Test
    public void testPromotions1() {
        long ear = 4;
        /*int */long hearing = 2 * ear;
    }

    @Test
    public void testOperators() {
        int ticketsSold = 2, ticketsTaken = 4;
        ticketsSold = 1 + ticketsTaken--;
        ticketsTaken *= 2;

        Assertions.assertEquals(5, ticketsSold);
        Assertions.assertEquals(6, ticketsTaken);

    }
}
