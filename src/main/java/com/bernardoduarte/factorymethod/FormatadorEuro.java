package com.bernardoduarte.factorymethod;

public class FormatadorEuro extends FormatadorValor {

    @Override
    public String formatar(double valor) {
        return String.format("EUR %.2f", valor);
    }
}
