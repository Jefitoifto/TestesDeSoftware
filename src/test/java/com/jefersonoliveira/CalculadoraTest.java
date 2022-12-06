package com.jefersonoliveira;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
   @Test
   @DisplayName("Soma de dois inteiros")
   void deveriaSomarInteiros(){
    Calculadora calculadora = new Calculadora();
    assertEquals(2, calculadora.soma(1, 1));
   }
   @Test
   @DisplayName("Subtração de dois inteiros")
   void subtrairInteiros(){
    Calculadora calculadoraSub = new Calculadora();
    assertEquals(2, calculadoraSub.Subtrair(4, 2));
   } 
   @Test
   @DisplayName("Multiplicação de dois inteiros")
   void MultiplicarInteiros(){
    Calculadora calculadoraMult = new Calculadora();
    assertEquals(8, calculadoraMult.Multiplica(4, 2));
   } 
   @Test
   @DisplayName("Divisão de dois inteiros")
   void DividirInteiros(){
    Calculadora calculadoraDiv = new Calculadora();
    assertEquals(2, calculadoraDiv.Dividir(4, 2));
   } 
}
