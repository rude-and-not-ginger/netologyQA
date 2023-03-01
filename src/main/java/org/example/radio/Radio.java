package org.example.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume= 0;

    public int setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return minStation;
        }
        if (currentStation < minStation) {
            return minStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }
    public int nextStation(int setCurrentStation) {
        if (setCurrentStation < maxStation && setCurrentStation >= minStation) {
            setCurrentStation ++;
        }
        if (setCurrentStation == maxStation) {
            setCurrentStation = minStation;
        }
        return setCurrentStation;
        }
    public int previousStation(int setCurrentStation) {
        if (setCurrentStation <= maxStation && setCurrentStation > minStation) {
            setCurrentStation --;
        }
        if (setCurrentStation == minStation) {
            setCurrentStation = maxStation;
        }
        return setCurrentStation;
    }
    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return maxVolume;
        }
        if (currentVolume < minVolume) {
            return minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }
    public int increaseVolume(int setCurrentVolume) {
        if (setCurrentVolume < maxVolume) {
            setCurrentVolume ++;
        }
        return setCurrentVolume;
    }
    public int decreaseVolume(int setCurrentVolume) {
        if (setCurrentVolume > minVolume) {
        setCurrentVolume --;
        }
        return setCurrentVolume;
        }
}