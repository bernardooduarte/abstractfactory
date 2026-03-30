package com.bernardoduarte.factorymethod;

public class LibraEsterlinaFactory extends TaxaCambioFactory {
    @Override
    public TaxaCambio criarTaxa(double valorEmReais) {
        return new LibraEsterlina(valorEmReais);
    }
}
