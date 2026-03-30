package com.bernardoduarte.factorymethod;

public class TesteApp {

    public static void main(String[] args) {

        TaxaCambioFactory factory;

        factory = new DolarAmericanoFactory();
        TaxaCambio taxaDolar = factory.criarTaxa(5.17);
        taxaDolar.exibirInfo();

        factory = new EuroFactory();
        TaxaCambio taxaEuro = factory.criarTaxa(5.62);
        taxaEuro.exibirInfo();

        factory = new LibraEsterlinaFactory();
        TaxaCambio taxaLibra = factory.criarTaxa(6.55);
        taxaLibra.exibirInfo();
    }
}
