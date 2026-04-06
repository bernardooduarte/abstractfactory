package com.bernardoduarte.factorymethod;

public class DolarAmericanoFactory extends TaxaCambioFactory {
    @Override
    public TaxaCambio criarTaxa(double valorEmReais) {
        return new DolarAmericano(valorEmReais);
    }

    @Override
    public FormatadorValor criarFormatadorValor() {
        return new FormatadorDolarAmericano();
    }
}
