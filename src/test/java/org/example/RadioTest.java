package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldCreateRadioWithStation() {
        Radio service = new Radio(12);
        int actual = service.getQuantityOfStations();

        assertEquals(12, actual);
    }

    @Test
    void checkGetStation() {
        Radio service = new Radio();
        int actual = service.getCurrentStation();

        assertEquals(0, actual);
    }
    @Test
    void shouldSetNewStation() {
        Radio service = new Radio();

        int currentStation = 6;
        int expected = 6;
        int actual = service.setCurrentStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldNotSetNewStation() {
        Radio service = new Radio();

        int currentStation = 16;
        int expected = 0;
        int actual = service.setCurrentStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldNotSetNegativeStation() {
        Radio service = new Radio();

        int currentStation = -10;
        int expected = 0;
        int actual = service.setCurrentStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetNextStation() {
        Radio service = new Radio();

        int currentStation = 1;
        int expected = 2;
        int actual = service.nextStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetNextAfterFirstStation() {
        Radio service = new Radio();

        int currentStation = 0;
        int expected = 1;
        int actual = service.nextStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldNotSetNextStationEdgeCase() {
        Radio service = new Radio();

        int currentStation = -16;
        int expected = -16;
        int actual = service.nextStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetNextFirstStation() {
        Radio service = new Radio();

        int currentStation = 9;
        int expected = 0;
        int actual = service.nextStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetPreviousLastStation() {
        Radio service = new Radio();

        int currentStation = 0;
        int expected = 9;
        int actual = service.previousStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetPreviousBeforeLastStation() {
        Radio service = new Radio();

        int currentStation = 9;
        int expected = 8;
        int actual = service.previousStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetPreviousStation() {
        Radio service = new Radio();

        int currentStation = 2;
        int expected = 1;
        int actual = service.previousStation(currentStation);

        assertEquals(expected,actual);
    }
    @Test
    void shouldNotSetPreviousStationEdge() {
        Radio service = new Radio();

        int currentStation = 12;
        int expected = 12;
        int actual = service.previousStation(currentStation);

        assertEquals(expected, actual);
    }
    @Test
    void shouldSetNewVolume() {
        Radio service = new Radio();

        int currentVolume = 6;
        int expected = 6;
        int actual = service.setCurrentVolume(currentVolume);

        assertEquals(expected, actual);
    }
    @Test
    void shouldNotSetNewVolume() {
        Radio service = new Radio();

        int currentVolume = 160;
        int expected = 100;
        int actual = service.setCurrentVolume(currentVolume);

        assertEquals(expected, actual);
    }
    @Test
    void shouldNotSetNegativeVolume() {
        Radio service = new Radio();

        int currentVolume = -10;
        int expected = 0;
        int actual = service.setCurrentVolume(currentVolume);

        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolume() {
        Radio service = new Radio();

        int currentVolume = 2;
        int expected = 3;
        int actual = service.increaseVolume(currentVolume);

        assertEquals(expected, actual);
    }
    @Test
    void shouldNotIncreaseVolume() {
        Radio service = new Radio();

        int currentVolume = 100;
        int expected = 100;
        int actual = service.increaseVolume(currentVolume);

        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolume() {
        Radio service = new Radio();

        int currentVolume = 11;
        int expected = 10;
        int actual = service.decreaseVolume(currentVolume);

        assertEquals(expected, actual);
    }
    @Test
    void shouldNotDecreaseVolume() {
        Radio service = new Radio();

        int currentVolume = -10;
        int expected = 0;
        int actual = service.decreaseVolume(currentVolume);

        assertEquals(expected, actual);
    }
}