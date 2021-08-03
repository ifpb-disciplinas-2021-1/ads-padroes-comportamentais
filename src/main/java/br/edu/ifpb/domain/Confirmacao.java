package br.edu.ifpb.domain;

//Template Method

import br.edu.ifpb.templateMethod.ConfirmacaoAPrazo;
import java.util.Objects;

public abstract class Confirmacao {

    private Compra compra;
    private Desconto desconto;
    // flexibilidade e sem acoplamento
//    private Pagamento pagamento;// = new PagamentoPorCartaoDeCredito();

    public Confirmacao(Compra compra, Desconto desconto) {
                this.compra = compra;
        this.desconto = desconto;
    }

    public void concluir(Entrega entrega){
        double taxa = compra.calculaTaxa(entrega);
        double valorComDesconto = aplicarDesconto(compra);
        double valorTotal = valorComDesconto + taxa;
//        pagar(valorTotal); //hook methods
        String codigoPagamento = pagamento().pagar(valorTotal); //hook methods
        confirmar(codigoPagamento, compra); //hook methods
    }

//    protected abstract void pagar(double valor);
    protected abstract Pagamento pagamento(); // Factory Method
    protected abstract void confirmar(String codigoPagamento,Compra compra);
    private double aplicarDesconto(Compra compra) {
        return this.desconto.aplicar(compra.valorTotal());
    }
    
    // static factory method
    public static Confirmacao aPrazo(Compra compra, Desconto desconto){
        // validação
        Objects.requireNonNull(compra,"a compra não pode ser nula");
        Objects.requireNonNull(desconto,"o desconto não pode ser nulo");
        return new ConfirmacaoAPrazo(compra, desconto);
    }

//    protected abstract void confirmar(Compra compra);
//    {
//        System.out.println("Confirmando a compra");
//    }
}
