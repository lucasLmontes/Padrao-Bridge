package com.resumo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorOfficeTest {

    @Test
    public void deveRetornarDesempenhoComputadorOfficeComHardwareRuim() {
        Hardware hardware = new HardwareRuim();
        Computador computador = new ComputadorOffice(hardware);
        assertEquals(1.25f, computador.calcularDesempenho(), 0.01f);
    }

    @Test
    public void deveRetornarDesempenhoComputadorOfficeComHardwareMedio() {
        Hardware hardware = new HardwareMedio();
        Computador computador = new ComputadorOffice(hardware);
        assertEquals(2.5f, computador.calcularDesempenho(), 0.01f);
    }

    @Test
    public void deveRetornarDesempenhoComputadorOfficeComHardwareBom() {
        Hardware hardware = new HardwareBom();
        Computador computador = new ComputadorOffice(hardware);
        assertEquals(3.75f, computador.calcularDesempenho(), 0.01f);
    }
}