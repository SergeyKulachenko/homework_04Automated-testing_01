package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remainAt1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void remainUpTo1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    void remainMove1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(actual,expected);
    }

}