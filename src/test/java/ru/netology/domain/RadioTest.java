package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    void shouldDefaultMaxRadioStations() {
        int expectedDefaultMaxRadioStation = 9;
        Radio radio = new Radio();
        assertEquals(expectedDefaultMaxRadioStation, radio.getMaxRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStation() {

        int expectedCurrentRadioStation = 10;

        Radio radio = new Radio(55);

        radio.setCurrentRadioStation(10);

        assertEquals(expectedCurrentRadioStation, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationAboveMax() {

        int expected = 0;

        Radio radio = new Radio(60);


        radio.setCurrentRadioStation(60);

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationBelowMin() {
        Radio radio = new Radio(60);
        int indexRadioStation = -1;
        int expected = 0;

        radio.setCurrentRadioStation(indexRadioStation);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGotoMaxRadioStationAfterMin() {

        Radio radio = new Radio(60);

        int expected = 59;

        radio.setCurrentRadioStation(0);

        radio.gotoPrevRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldGotoMinRadioStationAfterMax() {

        Radio radio = new Radio(60);

        int expected = 0;

        radio.setCurrentRadioStation(59);

        radio.gotoNextRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldGotoNextRadioStation() {
        Radio radio = new Radio(35);
        int indexRadioStation = 5;
        int expected = 6;
        radio.setCurrentRadioStation(indexRadioStation);
        radio.gotoNextRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldGotoPrevRadioStation() {
        Radio radio = new Radio(35);
        int indexRadioStation = 6;
        int expected = 5;
        radio.setCurrentRadioStation(indexRadioStation);
        radio.gotoPrevRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentVolumeOverMax() {
        Radio radio = new Radio(40);
        int volume = 101;
        radio.setCurrentVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setCurrentVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeAboveVolumeMax() {
        Radio radio = new Radio(40);
        int volume = 100;
        radio.setCurrentVolume(volume);
        radio.increaseVolumeForOne();
        int expected = 100;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeBelowVolumeMin() {
        Radio radio = new Radio(40);
        int volume = 0;
        radio.setCurrentVolume(volume);
        radio.reductionVolumeForOne();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void volumeUpForOne() {
        Radio radio = new Radio(40);
        int volume = 5;
        radio.setCurrentVolume(volume);
        radio.increaseVolumeForOne();
        int expected = 6;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio(40);
        int volume = 4;
        radio.setCurrentVolume(volume);
        radio.reductionVolumeForOne();
        int expected = 3;
        assertEquals(expected, radio.getCurrentVolume());
    }


}

