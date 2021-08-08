package DisplayClasses;

import DisplayInterface.Display;
import ObservableInterface.Observer;
import SubjectInterface.Subject;

public class CurrentConditionDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.println(this + " Temp :" + temperature + " Humidity :"+humidity + " Pressure :" + pressure);
    }
}
