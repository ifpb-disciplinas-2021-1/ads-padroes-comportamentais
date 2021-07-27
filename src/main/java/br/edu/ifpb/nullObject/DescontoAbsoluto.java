package br.edu.ifpb.nullObject;

import br.edu.ifpb.domain.Desconto;

public class DescontoAbsoluto implements Desconto {

    private final double desconto;

    public DescontoAbsoluto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double aplicar(double valor) {
        return valor - this.desconto;
    }
}
