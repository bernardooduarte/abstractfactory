package com.bernardoduarte.abstractfactory;

public abstract class TaxaCambio {

    protected String moeda;
    protected double valorEmReais;

    public TaxaCambio(String moeda, double valorEmReais) {
        this.moeda = moeda;
        this.valorEmReais = valorEmReais;
    }

    public String getMoeda() {
        return moeda;
    }

    public double getValorEmReais() {
        return valorEmReais;
    }

    public abstract void exibirInfo();
}
