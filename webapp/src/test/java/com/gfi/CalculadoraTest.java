package com.gfi;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class CalculadoraTest 
{

    @Test
    public void testSumarPositivos()
    {
        int resultadoEsperado=14;
        int resultado=Calculadora.suma(9,5);
        assertEquals(resultado,resultadoEsperado );
    }
    @Test
    public void testSumarNegativos()
    {
        int resultadoEsperado=14;
        int resultado=Calculadora.suma(19,-5);
        assertEquals(resultado,resultadoEsperado );
    }
    @Test
    public void testSumarCero()
    {
        int resultadoEsperado=14;
        int resultado=Calculadora.suma(14,0);
        assertEquals(resultado,resultadoEsperado );
    }
    @Test
    public void testSumarDosNegativos()
    {
        int resultadoEsperado=-14;
        int resultado=Calculadora.suma(-9,-5);
        assertEquals(resultado,resultadoEsperado );
    }
}
