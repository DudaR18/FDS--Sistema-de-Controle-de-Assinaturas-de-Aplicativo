package com.dudaenzo.tfinal.Negocio.Entidade;

@Entity
public class Usuario {
    private String usuario;
    private String senha;

    protected Usuario(){ }

    public Usuario(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario(){
        return this.usuario;
    }

    public String getSenha(){
        return this.senha;
    }
}
