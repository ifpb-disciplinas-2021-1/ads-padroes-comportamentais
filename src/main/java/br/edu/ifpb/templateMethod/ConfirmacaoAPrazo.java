package br.edu.ifpb.templateMethod;

import br.edu.ifpb.domain.Compra;
import br.edu.ifpb.domain.Confirmacao;
import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.Pagamento;
import br.edu.ifpb.factory.PagamentoPorCartaoDeCredito;

public class ConfirmacaoAPrazo extends Confirmacao {
    public ConfirmacaoAPrazo(Compra compra, Desconto desconto) {
        super(compra, desconto);
    }

//    @Override
//    public void pagar(double valor) {
////        double valor = compra.valorTotal();
//        System.out.println("Pagando a prazo: "+valor);
//    }

    @Override
    public Pagamento pagamento(){
        return new PagamentoPorCartaoDeCredito(); //criar objetos
    }
    @Override
    protected void confirmar(String codigoPagamento,Compra compra) {
        System.out.println("incluir na fila para processamento: "+codigoPagamento);
    }

}
