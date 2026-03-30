package com.bernardoduarte.factorymethod;

public class LibraEsterlina extends TaxaCambio {

    public LibraEsterlina(double valorEmReais) {
        super("GBP", valorEmReais);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moeda: " + moeda + " | Taxa: R$ " + valorEmReais);
    }
}
