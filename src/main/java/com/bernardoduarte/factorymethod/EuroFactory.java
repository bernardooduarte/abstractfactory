package com.bernardoduarte.factorymethod;

public class EuroFactory extends TaxaCambioFactory {
    @Override
    public TaxaCambio criarTaxa(double valorEmReais) {
        return new Euro(valorEmReais);
    }
}
