package com.proyecto.arabicnumerals;

// Estas importaciones son necesarias para usar JUnit 4

import org.junit.Assert; // Para hacer comparaciones entre lo esperado y lo real
import org.junit.Before; // Se usa para preparar el entorno antes de cada prueba
import org.junit.Test;   // Sirve para indicar que un método es de prueba

// Esta es la clase de prueba para verificar que ArabicToRoman funciona bien
public class ArabicToRomanTest {

    private ArabicToRoman converter; // Aquí guardo el objeto que voy a probar

    // Este método se ejecuta antes de cada prueba
    @Before
    public void setUp() {
        converter = new ArabicToRoman();
    }
    // Esta prueba revisa que convertir 1 me dé "I"
    @Test
    public void testToRoman_I() {
        Assert.assertEquals("I", converter.toRoman(1));
    }
    // Esta prueba revisa que 4 se convierta en "IV"
    @Test
    public void testToRoman_IV() {
        Assert.assertEquals("IV", converter.toRoman(4));
    }
    // Aquí pruebo el 10, que debe ser "X"
    @Test
    public void testToRoman_X() {
        Assert.assertEquals("X", converter.toRoman(10));
    }
   // Esta prueba es para un número más grande, 1999
    @Test
    public void testToRoman_MCMXCIX() {
        Assert.assertEquals("MCMXCIX", converter.toRoman(1999));
    }
    // Y esta es para el número más grande permitido, 3999
    @Test
    public void testToRoman_MMMCMXCIX() {
        Assert.assertEquals("MMMCMXCIX", converter.toRoman(3999));
    }
}
