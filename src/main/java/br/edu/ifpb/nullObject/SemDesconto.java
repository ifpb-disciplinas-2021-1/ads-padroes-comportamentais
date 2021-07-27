package br.edu.ifpb.nullObject;

import br.edu.ifpb.venda.Desconto;

public class SemDesconto implements Desconto {
    @Override
    public double aplicar(double desconto) {
        return desconto;
    }
}
