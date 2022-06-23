package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    public void validateChangFields() {
        Radio radio = new Radio (5);
        assertEquals(0,radio.getCurrentRadioStation());
    } // проверить поля изменения

    @Test
    public void changeAfterLastRadioStation() {
        Radio radio = new Radio (9);
        radio.pressNextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    } // изменить после последней радиостанции

    @Test
    public void changeUnderInitialRadioStation() {
        Radio radio = new Radio (5);
        radio.pressPrevStation();
        assertEquals(4, radio.getCurrentRadioStation());
    } // изменить в соответствии с начальной радиостанцией

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio (7);
        radio.pressNextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    } // следующая радиостанция

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio (5);
        radio.pressPrevStation();
        assertEquals(4, radio.getCurrentRadioStation());
    } //

    @Test
    public void afterInitialRadioStation() {
        Radio radio = new Radio (1);
        assertEquals(0, radio.getMaxRadioStation());
    }

    @Test
    public void underInitialRadioStation() {
        Radio radio = new Radio (9);
        assertEquals(0, radio.getMinRadioStation());
    }

    // volume
    @Test
    public void volumeOverMax() {
        Radio radio = new Radio (101);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio (-1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void plusVolume() {
        Radio radio = new Radio (5);
        radio.pressPlusVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio (5);
        radio.pressMinusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
