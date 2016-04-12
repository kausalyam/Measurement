package com.bootcamp.measurement.calculator;

import com.bootcamp.measurement.unit.Measurement;

public class MeasurementsCalculator {

    public static boolean isEqual(Measurement firstMeasurement, Measurement secondMeasurement) {
        return firstMeasurement.convertToMilliMetres() == secondMeasurement.convertToMilliMetres();
    }

    public static float getSumInTermsOfFirstMeasurementUnit(Measurement firstMeasurement, Measurement secondMeasurement) {
        float sumValueAsMillimetre;

        sumValueAsMillimetre = firstMeasurement.convertToMilliMetres() + secondMeasurement.convertToMilliMetres();
        return firstMeasurement.convertMilliMetreToOriginalUnit(sumValueAsMillimetre);
    }
}
