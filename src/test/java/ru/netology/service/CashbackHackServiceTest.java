package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldReturn999IfAmountsIs1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn998IfAmountsIs1002() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1002;

        int actual = service.remain(amount);
        int expected = 998;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn1IfAmountsIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn2IfAmountsIs998() {
        CashbackHackService service = new CashbackHackService();
        int amount = 998;

        int actual = service.remain(amount);
        int expected = 2;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn100fAmountsIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    //тест падает, сервис выдает неверный результат
    public void ShouldReturn0fAmountsIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn1000fAmountsIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    //тест падает, сервис выдает неверный результат
    public void ShouldReturn0fAmountsIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
