package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldReturn999IfAmounstIs1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturn998IfAmountsIs1002() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1002;

        int expected = 998;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturn1IfAmountsIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturn2IfAmountsIs998() {
        CashbackHackService service = new CashbackHackService();
        int amount = 998;

        int expected = 2;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturn100IfAmountsIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturn1000IfAmountsIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    // тест падает, сервис выдает неверный результат
    public void ShouldReturn0IfAmountsIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    // тест падает, сервис выдает неверный результат
    public void ShouldReturn0IfAmountsIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
}