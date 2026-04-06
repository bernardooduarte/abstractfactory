package com.bernardoduarte.abstractfactory;

public class DolarAmericano extends TaxaCambio {

    public DolarAmericano(double valorEmReais) {
        super("USD", valorEmReais);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moeda: " + moeda + " | Taxa: R$ " + valorEmReais);
    }
}
