package br.edu.ifpb.venda;

public interface Desconto {

    public double aplicar(double desconto);
//        return desconto;
//    }
//    public static final Desconto EMPTY = (d)-> d;

    class SmartDesconto implements Desconto{
        @Override
        public double aplicar(double desconto) {
            return desconto;
        }
    }
}
