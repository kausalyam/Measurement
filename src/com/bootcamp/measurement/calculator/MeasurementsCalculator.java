package com.bootcamp.measurement.calculator;

import com.bootcamp.measurement.Measurement;

public class MeasurementsCalculator {

    public static boolean isEqual(Measurement firstMeasurement, Measurement secondMeasurement) {
        return firstMeasurement.convertToMilliMetres() == secondMeasurement.convertToMilliMetres();
    }

    public static float getSum(Measurement firstMeasurement, Measurement secondMeasurement) {
        float sumValueAsMillimetre;

        sumValueAsMillimetre = firstMeasurement.convertToMilliMetres() + secondMeasurement.convertToMilliMetres();
        return firstMeasurement.convertMilliMetreToOriginalUnit(sumValueAsMillimetre);
    }
}
