package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJUnit_5 {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int executed = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(executed, actual);
    }
}