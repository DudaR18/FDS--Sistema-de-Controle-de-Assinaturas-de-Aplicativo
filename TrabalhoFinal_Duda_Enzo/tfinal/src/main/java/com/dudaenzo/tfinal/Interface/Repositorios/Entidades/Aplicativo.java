package com.dudaenzo.tfinal.Negocio.Entidade;

@Entity
public class Aplicativo {
    @codigo
    private long codigo;
    private String nome;
    private double custoMensal;

    protected Aplicativo(){ }

    public Aplicativo(long codigo, String nome, double custoMensal){
        this.codigo = codigo;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public double getCustoMensal(){
        return this.custoMensal;
    }
}
