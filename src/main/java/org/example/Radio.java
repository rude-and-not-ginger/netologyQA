package org.example;

public class Radio {

    private int quantityOfStations = 9;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume= 0;

    public Radio(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
    }

    public Radio() {
    }

    public int getQuantityOfStations() {
        return quantityOfStations;
    }

    public void setQuantityOfStations(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return minStation;
        } else {
            if (currentStation < minStation) {
                return minStation;
            }
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
        if (setCurrentVolume > maxVolume) {
            return maxVolume;
        }
        return setCurrentVolume;
    }
    public int decreaseVolume(int setCurrentVolume) {
        if (setCurrentVolume > minVolume) {
        setCurrentVolume --;
        }
        if (setCurrentVolume < minVolume) {
            return minVolume;
        }
        return setCurrentVolume;
        }
}