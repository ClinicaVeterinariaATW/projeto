/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Alessandro
 */
public class ModeloCliente extends ModeloPessoa implements InterfaceControleDados{
    private int idCliente;

    public ModeloCliente() {

    }

    public ModeloCliente(int idCliente, String nome, String sobrenome, String cpf, String email, String sexo, Date dataNascimento) {
        super(nome, sobrenome, cpf, email, sexo, dataNascimento);
        this.setIdCliente(idCliente);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
