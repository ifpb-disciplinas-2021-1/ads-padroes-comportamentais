package br.edu.ifpb.nullObject;

import br.edu.ifpb.domain.Desconto;

public class DescontoPercentual implements Desconto {
    private final double desconto;
    public DescontoPercentual(double desconto) { //10%
        this.desconto = desconto;
    }
    @Override
    public double aplicar(double valor) {
        return ((100-this.desconto)*valor/100);
    }
}
