package com.dudaenzo.tfinal.Negocio.Entidade;

@Entity
public class Cliente {
    @codigo
    private long codigo;
    private String nome;
    private String email;

    protected Cliente(){ }

    public Cliente(long codigo, String nome, String email){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }
}
