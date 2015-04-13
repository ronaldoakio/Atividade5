/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.fci.ticketmachine.core;

import br.mackenzie.fci.ticketmachine.exception.PapelMoedaInvalidaException;
import br.mackenzie.fci.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 41242076
 */
public class TestSucess {
     @Test
    public void success() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(2);
        Assert.assertEquals(0, tm.getSaldo());
        tm.inserir(10);
        tm.inserir(20);
        tm.inserir(100);
        Assert.assertEquals(130, tm.getSaldo());
        String aux = tm.imprimir();
        Assert.assertEquals(
                "*****************\n*** R$ 130,00 ****\n*****************\n",
                aux);

        PapelMoeda pm;
        Iterator<PapelMoeda> itTroco;
        itTroco = tm.getTroco();
    }
}
