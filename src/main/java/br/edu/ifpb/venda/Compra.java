package br.edu.ifpb.venda;

import br.edu.ifpb.nullObject.SemDesconto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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
    private Desconto desconto;// = new SemDesconto(); //padrão

    //ctor principal
    public Compra(Desconto desconto, int peso) {
        this.desconto = desconto;
        this.peso = peso;
    }
    public Compra(int peso) {
        this(new Desconto.SmartDesconto(), peso);
    }
    private int peso;
    public double desconto(){
//        if(desconto ==null) return valorTotal();
        return this.desconto.aplicar(valorTotal());
    }
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
    public List<String> lista(){
        if(desconto ==null) return  null;

        for (String a:lista()){ //NullPointerException..

        }
        return Collections.emptyList(); //vazia
    }
}
