package ru.netology.domain;

public class Radio {
    private int amountRadioStation = 10;
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = amountRadioStation - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
        this.maxRadioStation = amountRadioStation - 1;
    }


    public int getMaxRadioStation() {
        return this.maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void gotoPrevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void gotoNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeForOne() {

        if (currentVolume < maxVolume) {
            this.currentVolume++;

        }

    }

    public void reductionVolumeForOne() {

        if (currentVolume > minVolume) {
            this.currentVolume--;

        }

    }


}

