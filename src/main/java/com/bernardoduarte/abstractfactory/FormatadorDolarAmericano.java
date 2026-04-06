package com.bernardoduarte.abstractfactory;

public class FormatadorDolarAmericano extends FormatadorValor {

    @Override
    public String formatar(double valor) {
        return String.format("US$ %.2f", valor);
    }
}
