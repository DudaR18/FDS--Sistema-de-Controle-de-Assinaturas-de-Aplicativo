package com.dudaenzo.tfinal.Dominio.InterfaceRepositorio;

import java.util.List;

import com.dudaenzo.tfinal.Dominio.entidades.ClienteModel;

public interface IClienteRepositorio {
    List<ClienteModel> todos();
    ClienteModel consultaPorId(long codigo);
}
