package com.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init() {

        this.example = new Example();
    }


    @Test
    public void testSumar() {
        
        assertEquals(5, example.sumar(2, 3));
    }

    @Test
    public void testCheckPositivo() {

        assertTrue(example.checkPositivo(5));
    }

    @Test
    public void testCheckPositivoError(){

        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(-5));
    }


    @Test
    public void testContarLetrasA() {

        assertEquals(6, example.contarLetrasA("anita lava la tina"));
    }

    @Test
    public void testContieneElemento() {

        assertTrue(example.contieneElemento(List.of("a", "b", "c"), "a"));
    }

    @Test
    public void testRevertirCadena() {

        assertEquals("anit", example.revertirCadena("tina"));
    }

    @Test
    public void testFactorial() {

        assertEquals(120, example.factorial(5));
    }

    @Test
    public void testFactorialError() {

        assertThrows(IllegalArgumentException.class, () -> example.factorial(-5));
    }

    @Test
    public void testEsPrimo() {

        assertTrue(example.esPrimo(7));
    }

    @Test
    public void testEsPrimoMenorQueUno() {

        assertFalse(example.esPrimo(1));
    }

    @Test
    public void testNoEsPrimo() {

        assertFalse(example.esPrimo(8));
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {

        assertEquals("Listo después de retraso", example.mensajeConRetraso());
    }

    @Test
    public void testConvertirAString(){
        assertEquals(List.of("1","2","3","4","5"), example.convertirAString(List.of(1,2,3,4,5)));
    }

    @Test
    public void testCalcularMedia(){
        assertEquals(3.0, example.calcularMedia(List.of(1,2,3,4,5)));
    }

    @Test
    public void testCalcularMediaEmpty(){
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(List.of()));
    }

    @Test
    public void testConvertirListaAString() {
        assertEquals("1,2,3,4,5", example.convertirListaAString(List.of("1", "2", "3", "4", "5")));
    }










}
