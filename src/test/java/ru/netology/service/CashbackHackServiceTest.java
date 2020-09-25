package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        BonusService bonusService = new BonusService();
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(executed,actual);
    }
}