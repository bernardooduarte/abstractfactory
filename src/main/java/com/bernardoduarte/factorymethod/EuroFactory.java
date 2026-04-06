package com.bernardoduarte.factorymethod;

public class EuroFactory extends TaxaCambioFactory {
    @Override
    public TaxaCambio criarTaxa(double valorEmReais) {
        return new Euro(valorEmReais);
    }

    @Override
    public FormatadorValor criarFormatadorValor() {
        return new FormatadorEuro();
    }
}
