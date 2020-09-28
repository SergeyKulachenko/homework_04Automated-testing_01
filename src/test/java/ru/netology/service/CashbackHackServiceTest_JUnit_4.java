package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest_JUnit_4 {

    @org.junit.Test
    public void cashbackHackService_1905_JUnit_4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void cashbackHackService_1000_JUnit_4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void cashbackHackService_650_JUnit_4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=650;
        int expected = 350;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

}