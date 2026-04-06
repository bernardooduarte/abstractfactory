package com.bernardoduarte.abstractfactory;

public class Euro extends TaxaCambio {

    public Euro(double valorEmReais) {
        super("EUR", valorEmReais);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moeda: " + moeda + " | Taxa: R$ " + valorEmReais);
    }
}
