package com.company;

import DisplayClasses.CurrentConditionDisplay;
import WeatherData.WeatherData;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //FROM WORKSTATION DATA IS PASSED TO WEATHER DATA

        WeatherData weatherData = new WeatherData();
        weatherData.measurementIsChanged(1,1,1);

        //New Subscriber
        CurrentConditionDisplay sub1 = new CurrentConditionDisplay(weatherData);

        weatherData.measurementIsChanged(2,2,2);
        Thread.sleep(5000);

        //New Subscriber
        CurrentConditionDisplay sub2 = new CurrentConditionDisplay(weatherData);
        Thread.sleep(5000);

        weatherData.measurementIsChanged(3,3,3);

        //Subscriber UnSubscribed
        weatherData.removeObserver(sub1);
        Thread.sleep(5000);

        weatherData.measurementIsChanged(4,4,4);
    }

}
