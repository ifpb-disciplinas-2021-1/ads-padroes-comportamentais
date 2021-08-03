package br.edu.ifpb.main;

import br.edu.ifpb.domain.Compra;
import br.edu.ifpb.domain.Confirmacao;
import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.Entrega;
import br.edu.ifpb.domain.Produto;
import br.edu.ifpb.nullObject.DescontoAbsoluto;
import br.edu.ifpb.strategy.EntregaPorCorreios;
import br.edu.ifpb.templateMethod.ConfirmacaoAPrazo;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:57:59
 */
public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto(
            "arroz", 2.65
        );
        Produto leite = new Produto(
            "leite", 6.89
        );
        Compra compra =new Compra(10);
        compra.adicionar(3, arroz);
        compra.adicionar(2, leite);
            
        double valorTotal = compra.valorTotal();
        System.out.println("valorTotal = " + valorTotal);
                
        Desconto desconto = new DescontoAbsoluto(10.0);
        Entrega entrega = new EntregaPorCorreios();
        Confirmacao confirmacao = new ConfirmacaoAPrazo(compra, desconto);
        confirmacao.concluir(entrega);
        
        //static-factory method
        Confirmacao aPrazo = Confirmacao.aPrazo(compra, desconto);
        
    }
}
