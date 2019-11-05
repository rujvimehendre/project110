package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {

        float value = (9/5*getValue()) + 32;
        return new Fahrenheit(value);
    }

    public Celsius(float t)
    {
        super(t);
    }
    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}
