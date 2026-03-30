package com.bernardoduarte.factorymethod;

public class DolarAmericanoFactory extends TaxaCambioFactory {
    @Override
    public TaxaCambio criarTaxa(double valorEmReais) {
        return new DolarAmericano(valorEmReais);
    }
}
