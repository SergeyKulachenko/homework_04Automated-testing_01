package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest_JUnit_4 {

    @org.junit.Test
    public void ddd() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed = 95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(executed, actual);
    }

    @Test
    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int executed = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(executed, actual);
    }
}