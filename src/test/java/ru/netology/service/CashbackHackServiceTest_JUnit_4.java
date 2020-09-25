package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest_JUnit_4 {

    @org.junit.Test
    public void cashbackHackService_1905_JUnit_4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed = 95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(executed, actual);
    }

    @org.junit.Test
    public void cashbackHackService_1000_JUnit_4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int executed = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(executed, actual);
    }

    @Test
    public void cashbackHackService_1000_APIJUnitJupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int executed = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(executed, actual);
    }

}