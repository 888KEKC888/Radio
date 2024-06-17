package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouleSedNumberRadiostation() {
        Radio cond = new Radio();

        cond.setNumberStation(9);

        int expected = 9;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNotSetNumberRadiostationAboveMax() {
        Radio cond = new Radio();

        cond.setNumberStation(10);

        int expected = 0;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberStationUp1() {
        Radio cond = new Radio();
        cond.setNumberStation(9);

        cond.next();

        int expected = 0;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNumberStationDown1() {
        Radio cond = new Radio();
        cond.setNumberStation(0);

        cond.prev();

        int expected = 9;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleIncreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(99);

        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleReduceVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        cond.reduceVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNotSetVolumeAboveMax() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNotSetVolumeAboveMin() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleIncreaseVolumeNotMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleReduceVolumeNotMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.reduceVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
