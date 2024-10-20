package com.dudaenzo.tfinal.Negocio.Entidade;

public class ClienteModel {
    long codigo;
    String nome;
    String email;

    public ClienteModel(long codigo, String nome, String email){
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

    @Override
    public String toString() {
        return "{" +
            " codigo= '" + getId() + "'" +
            ", nome= '" + getNome() + "'" +
            ", email= '" + getEmail() + "'" +
            "}";
    }
}
