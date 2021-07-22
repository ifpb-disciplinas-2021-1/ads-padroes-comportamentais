package br.edu.ifpb.venda;

//import br.edu.ifpb.venda.TaxaDeEntrega.Tipo;
import br.edu.ifpb.strategy.EntregaPorCorreios;
import br.edu.ifpb.strategy.EntregaPorSedex;
import br.edu.ifpb.strategy.EntregaPorFEDEX;
import br.edu.ifpb.strategy.EntregaPorPAC;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaxaDeEntregaTest {
     
    @Test
    public void testTaxaComSedex() {
//        TaxaDeEntrega calcula = new TaxaDeEntrega();
        Entrega entrega = new EntregaPorSedex();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);//calcula.calcularTaxaDeEntrega(compra,entrega);
        double esperado = 5.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
    @Test
    public void testTaxaComPac() {
//        TaxaDeEntrega calcula = new TaxaDeEntrega();
        Entrega entrega = new EntregaPorPAC();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);//calcula.calcularTaxaDeEntrega(compra,entrega);
        double esperado = 3.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
    @Test
    public void testTaxaComCorreios() {
//        TaxaDeEntrega calcula = new TaxaDeEntrega();
        Entrega entrega = new EntregaPorCorreios();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);//calcula.calcularTaxaDeEntrega(compra,entrega);
        double esperado = 2.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
    @Test
    public void testTaxaComFEDEX() {
//        TaxaDeEntrega calcula = new TaxaDeEntrega();
        Entrega entrega = new EntregaPorFEDEX();
        Compra compra = new Compra(10);
        double taxa = compra.calculaTaxa(entrega);//calcularTaxaDeEntrega(compra,entrega);
        double esperado = 8.0;
        assertEquals(taxa,esperado, 0.0001);
    }    
}
