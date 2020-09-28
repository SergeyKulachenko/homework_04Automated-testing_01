package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainAt1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(executed,actual);
    }

    @Test
    void remainUpTo1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=1;
        int actual = cashbackHackService.remain(999);
        assertEquals(executed,actual);
    }

    @Test
    void remainMove1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int executed=95;
        int actual = cashbackHackService.remain(1905);
        assertEquals(executed,actual);
    }

}