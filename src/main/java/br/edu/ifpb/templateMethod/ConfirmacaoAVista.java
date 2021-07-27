package br.edu.ifpb.templateMethod;

import br.edu.ifpb.domain.Compra;
import br.edu.ifpb.domain.Confirmacao;
import br.edu.ifpb.domain.Desconto;

public class ConfirmacaoAVista extends Confirmacao {

    public ConfirmacaoAVista(Compra compra, Desconto desconto) {
        super(compra, desconto);
    }

    @Override
    public void pagar(double valor) {
//        double valor = compra.valorTotal();
        System.out.println("Pagando a vista: "+valor);
    }
//
//    @Override
//    protected void confirmar(Compra compra) {
//        System.out.println("Confirmação feita com sucesso!!");
//    }


}
