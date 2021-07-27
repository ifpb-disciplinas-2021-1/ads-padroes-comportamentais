package br.edu.ifpb.strategy;

import br.edu.ifpb.domain.Compra;
import br.edu.ifpb.domain.Entrega;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2021, 08:58:40
 */
public class EntregaPorFEDEX implements Entrega{

    public double calcularTaxa(Compra compra) {
        return 0.8 * compra.peso();
    }
}
