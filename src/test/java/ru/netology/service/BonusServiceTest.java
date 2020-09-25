package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus_1566() {
        BonusService bonusService = new BonusService();
        int expected = 5;
        int actual = bonusService.calculateBonus(1566);
        assertEquals(expected,actual);
    }
    @Test
    void calculateBonus_20000() {
        BonusService bonusService = new BonusService();
        int expected = 100;
        int actual = bonusService.calculateBonus(20000);
        assertEquals(expected,actual);
    }

}