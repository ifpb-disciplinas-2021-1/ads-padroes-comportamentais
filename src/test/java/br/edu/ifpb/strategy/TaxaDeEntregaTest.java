package br.edu.ifpb.strategy;

import br.edu.ifpb.venda.Compra;
import br.edu.ifpb.venda.Entrega;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaxaDeEntregaTest {
     
    @Test
    public void testTaxaComSedex() {
        Entrega entrega = new EntregaPorSedex();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);
        double esperado = 5.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
    @Test
    public void testTaxaComPac() {
        Entrega entrega = new EntregaPorPAC();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);
        double esperado = 3.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
    @Test
    public void testTaxaComCorreios() {
        Entrega entrega = new EntregaPorCorreios();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);
        double esperado = 2.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
    @Test
    public void testTaxaComFEDEX() {
        Entrega entrega = new EntregaPorFEDEX();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);
        double esperado = 8.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
}