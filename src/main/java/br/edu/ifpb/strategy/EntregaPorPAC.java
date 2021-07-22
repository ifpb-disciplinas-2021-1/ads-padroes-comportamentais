package br.edu.ifpb.strategy;

import br.edu.ifpb.venda.Compra;
import br.edu.ifpb.venda.Entrega;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2021, 08:58:40
 */
public class EntregaPorPAC implements Entrega{

    public double calcularTaxa(Compra compra) {
        return 0.3 * compra.peso();
    }
}
