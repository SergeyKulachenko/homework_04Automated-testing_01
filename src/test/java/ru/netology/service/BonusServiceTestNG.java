package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BonusServiceTestNG {


    @org.testng.annotations.Test
    private void calculateBonus_20000_TestNG() {
        BonusService bonusService = new BonusService();
        int expected = 100;
        int actual = bonusService.calculateBonus(20000);
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateBonus_TestNG() {
        BonusService bonusService = new BonusService();
        int expected = 5;
        int actual = bonusService.calculateBonus(1566);
        assertEquals(actual, expected);
    }

}