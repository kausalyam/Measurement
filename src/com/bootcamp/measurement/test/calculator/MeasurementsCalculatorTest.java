package com.bootcamp.measurement.test.calculator;

import com.bootcamp.measurement.calculator.MeasurementsCalculator;
import com.bootcamp.measurement.unit.Centimetre;
import com.bootcamp.measurement.unit.Measurement;
import com.bootcamp.measurement.unit.Metre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementsCalculatorTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testValidEquivalence() throws Exception {
        Measurement metre = new Metre(2);
        Measurement centiMetre = new Centimetre(200);

        assertTrue(MeasurementsCalculator.isEqual(metre, centiMetre));
    }

    @Test
    public void testInValidEquivalence() throws Exception {
        Measurement metre = new Metre(200);
        Measurement centiMetre = new Centimetre(200);

        assertFalse(MeasurementsCalculator.isEqual(metre, centiMetre));
    }

    @Test
    public void testSumOfMetreAndCentimeterAsMetreIsCorrect() throws Exception {
        Measurement metre = new Metre(20);
        Measurement centiMetre = new Centimetre(200);
        float expectedValue = 22.0f;
        float incorrectValue = 2200.0f;

        float actualValue = MeasurementsCalculator.getSumInTermsOfFirstMeasurementUnit(metre, centiMetre);

        assertEquals(expectedValue, actualValue, 0);
        assertNotEquals(incorrectValue, actualValue, 0);
    }

    @Test
    public void testSumOfCentiMeterAndMetreAsCentiMetreIsCorrect() throws Exception {
        Measurement centiMetre = new Centimetre(200);
        Measurement metre = new Metre(20);
        float expectedValue = 2200.0f;
        float incorrectValue = 22.0f;

        MeasurementsCalculator measurementCalc = new MeasurementsCalculator();
        float actualValue = MeasurementsCalculator.getSumInTermsOfFirstMeasurementUnit(centiMetre, metre);

        assertEquals(expectedValue, actualValue, 0);
        assertNotEquals(incorrectValue, actualValue, 0);
    }

    @Test
    public void testSumOfCentiMeterAndCentiMetreAsCentiMetreIsCorrect() throws Exception {
        Measurement firstCentiMetre = new Centimetre(20);
        Measurement secondCentiMetre = new Centimetre(20);
        float expectedValue = 40.0f;
        float incorrectValue = 400.0f;

        float actualValue = MeasurementsCalculator.getSumInTermsOfFirstMeasurementUnit(firstCentiMetre, secondCentiMetre);

        assertEquals(expectedValue, actualValue, 0);
        assertNotEquals(incorrectValue, actualValue, 0);
    }

    @Test
    public void testSumOfMeterAndMetreAsMetreIsCorrect() throws Exception {
        Measurement firstMetre = new Metre(2);
        Measurement secondMetre = new Metre(1);
        float expectedValue = 3.0f;
        float incorrectValue = 3000.0f;

        float actualValue = MeasurementsCalculator.getSumInTermsOfFirstMeasurementUnit(firstMetre, secondMetre);

        assertEquals(expectedValue, actualValue, 0);
        assertNotEquals(incorrectValue, actualValue, 0);
    }
}