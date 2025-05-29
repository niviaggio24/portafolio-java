package com.proyecto.arabicnumerals;
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToArabicTest {

    private RomanToArabic converter;

    @Before
    public void setUp() {
        converter = new RomanToArabic();
    }

    @Test
    public void test_I() {
        Assert.assertEquals(1, converter.toArabic("I"));
    }

    @Test
    public void test_III() {
        Assert.assertEquals(3, converter.toArabic("III"));
    }

    @Test
    public void test_IV() {
        Assert.assertEquals(4, converter.toArabic("IV"));
    }

    @Test
    public void test_V() {
        Assert.assertEquals(5, converter.toArabic("V"));
    }

    @Test
    public void test_IX() {
        Assert.assertEquals(9, converter.toArabic("IX"));
    }

    @Test
    public void test_X() {
        Assert.assertEquals(10, converter.toArabic("X"));
    }

    @Test
    public void test_L() {
        Assert.assertEquals(50, converter.toArabic("L"));
    }

    @Test
    public void test_C() {
        Assert.assertEquals(100, converter.toArabic("C"));
    }

    @Test
    public void test_D() {
        Assert.assertEquals(500, converter.toArabic("D"));
    }

    @Test
    public void test_M() {
        Assert.assertEquals(1000, converter.toArabic("M"));
    }

    @Test
    public void test_complex() {
        Assert.assertEquals(1984, converter.toArabic("MCMLXXXIV"));
        Assert.assertEquals(3999, converter.toArabic("MMMCMXCIX"));
        Assert.assertEquals(2786, converter.toArabic("MMDCCLXXXVI"));
    }
}
