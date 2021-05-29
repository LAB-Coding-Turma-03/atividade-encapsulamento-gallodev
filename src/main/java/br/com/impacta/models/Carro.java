package br.com.impacta.models;

public class Carro {
    private String cor;
    private int ano;
    private double valor;
    
    public double getValor() {
        return valor;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
