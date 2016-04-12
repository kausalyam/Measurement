package com.bootcamp.measurement;

public abstract class Measurement {

    float value;

    public abstract float convertToMilliMetres();

    public abstract float convertMilliMetreToOriginalUnit(float milliMetres);
}
