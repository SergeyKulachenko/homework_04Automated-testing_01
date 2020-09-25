package ru.netology.service;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest_JUnit_4 {

    @org.junit.Test
    public void ddd() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed = 95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(executed, actual);
    }

    @org.junit.Test
    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int executed = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(executed, actual);
    }
}