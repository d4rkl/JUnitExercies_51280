package org.example;

public class DigitsCounter {

    public double average (int number){
        int sum = 0;
        int count = 0;

        number = Math.abs(number);

        while (number > 0) {
            sum += number % 10;
            count++;
            number /= 10;
        }

        return (double) sum / count;
    }
}