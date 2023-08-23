package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcTest {
    Imc imc;

    @BeforeEach
    void setUp(){
        imc = new Imc();
    }

    @Test
    void deveRetornarExcecaoSexoInvalido(){
        try{
            imc.setSexo("A");
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Sexo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSexoMasculinoValido(){
        imc.setSexo("M");
        assertEquals("M", imc.getSexo());
    }

    @Test
    void deveRetornarSexoFemininoValido(){
        imc.setSexo("F");
        assertEquals("F", imc.getSexo());
    }

    @Test
    void deveRetornarFemininoAbaixoPeso(){
        imc.setPeso(19.0f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal(){
        imc.setPeso(25.7f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoAcimaPeso(){
        imc.setPeso(27.2f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoPesoIdeal(){
        imc.setPeso(32.2f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoObeso(){
        imc.setPeso(32.3f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("obeso", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso(){
        imc.setPeso(20.6f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormal(){
        imc.setPeso(26.3f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAcimaPeso(){
        imc.setPeso(27.7f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoPesoIdeal(){
        imc.setPeso(32.2f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoObeso(){
        imc.setPeso(32.3f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("obeso", imc.calcularImc());
    }
}