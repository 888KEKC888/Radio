package ru.netology.radio;

public class Radio {
    private int numberStation; // переменная отвечающая за номер станции
    private int currentVolume; // переменная отвечающая за громкость

    public int getCurrentVolume() { //
        return currentVolume;
    }

    public int getNumberStation() { // переменная хранящая данные о присвоении и номере текущей станции
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) { //функция отвечает за минимально и максимално допустимый диапозон станций
        if (newNumberStation < 0) {
            numberStation = 9;
            return;
        }
        if (newNumberStation > 9) {
            numberStation = 0;
            return;
        }
        numberStation = newNumberStation;

    }

    public void next() { //функция отвечает за переключение станций на 1 вверх
        int target = numberStation + 1;
        setNumberStation(target);
    }

    public void prev() { //функция отвечает за переключение станций на 1 вниз
        int target = numberStation - 1;
        setNumberStation(target);
    }

    public void setCurrentVolume(int newCurrentVolume) { //определение максимальных значений громкости
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() { //увеличение громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() { //уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
