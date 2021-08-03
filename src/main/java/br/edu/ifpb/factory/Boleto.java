package br.edu.ifpb.factory;

import br.edu.ifpb.domain.Pagamento;
import java.util.UUID;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/08/2021, 10:19:46
 */
public class Boleto implements Pagamento{

    @Override
    public String pagar(double valor) {
        return UUID.randomUUID().toString();
    }

}
