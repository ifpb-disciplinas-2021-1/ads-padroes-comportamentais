package br.edu.ifpb.venda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:44:37
 */
public class Compra {
    private List<ItemDeVenda> itens = new ArrayList<>();
    private LocalDate criadaEm = LocalDate.now();
    private String cupomDesconto;
    private Pagamento pagamento;

    public Compra(int peso) {
        this.peso = peso;
    }
    private int peso;
    
    public void adicionar(int quantidade, Produto produto){
        ItemDeVenda item = new ItemDeVenda( 
            quantidade,produto
        );
        if(!itens.contains(item)) 
            itens.add(item);
    }
   public double valorTotal() {
        return itens.stream()
            .mapToDouble(ItemDeVenda::subTotal)
            .sum();
        
    }
    public double calculaTaxa(Entrega entrega){
        return entrega.calcularTaxa(this);
    }
    public int peso(){
        return this.peso;
    }
}
