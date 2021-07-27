package br.edu.ifpb.venda;

import br.edu.ifpb.nullObject.DescontoAbsoluto;
import br.edu.ifpb.nullObject.DescontoPercentual;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DescontosTest {
    @Test
    public void testDescontoAbsoluto() {
        Desconto desconto = new DescontoAbsoluto(10.0);
        double retorno = desconto.aplicar(100.0);
        double esperado = 90.0;
        assertEquals(retorno, esperado, 0.0001);
    }

    @Test
    public void testDescontoPercentual() {
        Desconto desconto = new DescontoPercentual(15.0);
        double retorno = desconto.aplicar(100.0);
        double esperado = 85.0;
        assertEquals(retorno, esperado, 0.0001);
    }
    @Test
    public void testSemDescontoNaCompra() {
        Desconto desconto = new DescontoPercentual(15.0);
        Compra compra = new Compra(12);
//        Compra compra = new Compra(desconto, 12);
        compra.adicionar(1, new Produto("TV", 100.0));
        double retorno = compra.desconto();
        double esperado = 100.0;
        assertEquals(retorno, esperado, 0.0001);
    }
    @Test
    public void testComDescontoNaCompra() {
        Desconto desconto = new DescontoPercentual(15.0);
        Compra compra = new Compra(desconto, 12);
        compra.adicionar(1, new Produto("TV", 100.0));
        double retorno = compra.desconto();
        double esperado = 85.0;
        assertEquals(retorno, esperado, 0.0001);
    }
}
