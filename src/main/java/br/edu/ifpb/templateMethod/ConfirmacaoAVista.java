package br.edu.ifpb.templateMethod;

import br.edu.ifpb.factory.Boleto;
import br.edu.ifpb.domain.Compra;
import br.edu.ifpb.domain.Confirmacao;
import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.Pagamento;

public class ConfirmacaoAVista extends Confirmacao {

    public ConfirmacaoAVista(Compra compra, Desconto desconto) {
        super(compra, desconto);
    }

//    @Override
//    public void pagar(double valor) {
////        double valor = compra.valorTotal();
//        System.out.println("Pagando a vista: "+valor);
//    }

    public Pagamento pagamento(){
        return new Boleto(); // concreto de pagamento
    }
    
    @Override
    protected void confirmar(String codigoPagamento, Compra compra) {
        System.out.println("código de pagamento: "+codigoPagamento);
        System.out.println("Confirmação feita com sucesso!!");
    }


}
