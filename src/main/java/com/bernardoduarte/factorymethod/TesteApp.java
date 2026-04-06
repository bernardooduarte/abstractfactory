package com.bernardoduarte.factorymethod;

public class TesteApp {

    public static void main(String[] args) {
        executarFactory(new DolarAmericanoFactory(), 5.17);
        executarFactory(new EuroFactory(), 5.62);
        executarFactory(new LibraEsterlinaFactory(), 6.55);
    }

    private static void executarFactory(TaxaCambioFactory factory, double valorEmReais) {
        TaxaCambio taxa = factory.criarTaxa(valorEmReais);
        FormatadorValor formatador = factory.criarFormatadorValor();

        taxa.exibirInfo();
        System.out.println("Formatado: " + formatador.formatar(taxa.getValorEmReais()));
        System.out.println("-------------------------------");
    }
}
