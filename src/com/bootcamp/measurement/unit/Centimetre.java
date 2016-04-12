package com.bootcamp.measurement.unit;

public class Centimetre extends Measurement {
    private static final float conversionFactorForMillimetre = 10.0f;

    public Centimetre(float value) {
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
