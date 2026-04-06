package com.bernardoduarte.abstractfactory;

public class LibraEsterlinaFactory extends TaxaCambioFactory {
    @Override
    public TaxaCambio criarTaxa(double valorEmReais) {
        return new LibraEsterlina(valorEmReais);
    }

    @Override
    public FormatadorValor criarFormatadorValor() {
        return new FormatadorLibraEsterlina();
    }
}
