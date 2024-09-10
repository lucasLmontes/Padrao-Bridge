package com.resumo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorEscolaTest {

    @Test
    public void deveRetornarDesempenhoComputadorEscolaComHardwareRuim() {
        Hardware hardware = new HardwareRuim();
        Computador computador = new ComputadorEscola(hardware);
        assertEquals(1.0f, computador.calcularDesempenho(), 0.01f);
    }

    @Test
    public void deveRetornarDesempenhoComputadorEscolaComHardwareMedio() {
        Hardware hardware = new HardwareMedio();
        Computador computador = new ComputadorEscola(hardware);
        assertEquals(2.0f, computador.calcularDesempenho(), 0.01f);
    }

    @Test
    public void deveRetornarDesempenhoComputadorEscolaComHardwareBom() {
        Hardware hardware = new HardwareBom();
        Computador computador = new ComputadorEscola(hardware);
        assertEquals(3.0f, computador.calcularDesempenho(), 0.01f);
    }
}