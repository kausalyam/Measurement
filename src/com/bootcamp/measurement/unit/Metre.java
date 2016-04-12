package com.bootcamp.measurement.unit;

import com.bootcamp.measurement.unit.Measurement;

public class Metre extends Measurement {
    private static final float conversionFactorForMillimetre = 1000.0f;

    public Metre(float value) {
        this.value = value;
    }

    @Override
    public float convertToMilliMetres() {
        return this.value * conversionFactorForMillimetre;
    }

    @Override
    public float convertMilliMetreToOriginalUnit(float milliMetres) {
        return milliMetres / conversionFactorForMillimetre;
    }

}
