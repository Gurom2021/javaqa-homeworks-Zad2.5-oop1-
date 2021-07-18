package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
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

