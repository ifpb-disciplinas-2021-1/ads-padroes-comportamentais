package br.edu.ifpb.venda;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2021, 08:32:50
 */
public class TaxaDeEntrega {

//    enum Tipo{
//        SEDEX,
//        PAC,
//        CORREIOS
//    }
    public double calcularTaxaDeEntrega(Compra compra, Entrega entrega){ //tipo sedex, pac, correios
//        Entrega entrega = null;
//        if(Tipo.SEDEX.equals(tipo)){
//        entrega = new EntregaPorSedex();
//        }
//        if(Tipo.PAC.equals(tipo)){
//            entrega =  new EntregaPorPAC();
//        }
//        if(Tipo.CORREIOS.equals(tipo)){
//            entrega = new EntregaPorCorreios();
//        }
        return entrega.calcularTaxa(compra);
    }
//
//    private double correios(int peso) {
//        
//    }
//
//    private double pac(int peso) {
//        
//    }
//
//    private double sedex(int peso) {
//        
//    }
}
