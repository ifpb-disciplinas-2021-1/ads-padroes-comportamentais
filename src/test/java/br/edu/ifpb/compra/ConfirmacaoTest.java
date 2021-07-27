package br.edu.ifpb.compra;

import br.edu.ifpb.domain.Compra;
import br.edu.ifpb.domain.Confirmacao;
import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.Entrega;
import br.edu.ifpb.nullObject.DescontoAbsoluto;
import br.edu.ifpb.strategy.EntregaPorCorreios;
import br.edu.ifpb.templateMethod.ConfirmacaoAVista;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConfirmacaoTest {
    @Test
    public void testDescontoAbsoluto() {
        Desconto desconto = new DescontoAbsoluto(10.0);
        Compra compra = new Compra(12);
        Entrega entrega = new EntregaPorCorreios();
        Confirmacao confirmacao = new ConfirmacaoAVista(compra, desconto);
        confirmacao.concluir(entrega);
        assertTrue(true);
    }
}
