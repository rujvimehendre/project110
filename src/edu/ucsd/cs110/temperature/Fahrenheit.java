package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    Temperature temp;
    @Override
    public Temperature toCelsius() {
        float val = 5/9*(getValue()- 32);
        return new Celsius(val);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public Fahrenheit(float t)
    {
        super(t);
    }
    public String toString()
    {
        return this.getValue() + " F";
    }
}
