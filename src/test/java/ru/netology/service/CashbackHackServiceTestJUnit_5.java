package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTestJUnit_5 {

    @Test
    void cashbackHackService_1000_JUnit_5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void cashbackHackService_1005_JUnit_5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1005;
        int expected = 995;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void cashbackHackService_905_JUnit_5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=905;
        int expected = 95;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

}