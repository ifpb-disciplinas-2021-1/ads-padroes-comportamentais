package br.edu.ifpb.domain;

//Template Method
public abstract class Confirmacao {

    private Compra compra;
    private Desconto desconto;

    public Confirmacao(Compra compra, Desconto desconto) {
        this.compra = compra;
        this.desconto = desconto;
    }

    public void concluir(Entrega entrega){
        double taxa = compra.calculaTaxa(entrega);
        double valorComDesconto = aplicarDesconto(compra);
        double valorTotal = valorComDesconto + taxa;
        pagar(valorTotal); //hook methods
        confirmar(compra);
    }

    protected abstract void pagar(double valor);
//    protected abstract void confirmar(Compra compra);

    private double aplicarDesconto(Compra compra) {
        return this.desconto.aplicar(compra.valorTotal());
    }

    protected void confirmar(Compra compra) {
        System.out.println("Confirmando a compra");
    }
}
