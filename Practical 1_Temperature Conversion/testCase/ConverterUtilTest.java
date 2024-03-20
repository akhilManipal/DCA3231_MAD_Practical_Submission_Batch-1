package com.example.tempconversion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConverterUtilTest {
    private static final double DELTA = 0.1;

    @Test
    public void testConvertZeroCelsius() {
        assertEquals(32.0,
                ConverterUtil.convertCelsiusToFahrenheit(0),
                DELTA);
    }

    @Test
    public void testConvert100Celsius() {
        assertEquals(212.0, ConverterUtil.convertCelsiusToFahrenheit(100), DELTA);
    }

    @Test
    public void testConvertMinus40Celsius() {
        assertEquals(-40.0, ConverterUtil.convertCelsiusToFahrenheit(-40), DELTA);
    }

    @Test
    public void testConvert37Celsius() {
        assertEquals(98.6, ConverterUtil.convertCelsiusToFahrenheit(37), DELTA);
    }

    @Test
    public void testConvert25Celsius() {
        assertEquals(77.0, ConverterUtil.convertCelsiusToFahrenheit(25), DELTA);
    }

    @Test
    public void testConvertMinus10Celsius() {
        assertEquals(14.0, ConverterUtil.convertCelsiusToFahrenheit(-10), DELTA);
    }

    @Test
    public void testConvert50Celsius() {
        assertEquals(122.0, ConverterUtil.convertCelsiusToFahrenheit(50), DELTA);
    }

    @Test
    public void testConvert30Celsius() {
        assertEquals(86.0, ConverterUtil.convertCelsiusToFahrenheit(30), DELTA);
    }

    @Test
    public void testConvertMinus20Celsius() {
        assertEquals(-4.0, ConverterUtil.convertCelsiusToFahrenheit(-20), DELTA);
    }

    @Test
    public void testConvert15Celsius() {
        assertEquals(59.0, ConverterUtil.convertCelsiusToFahrenheit(15), DELTA);
    }
}