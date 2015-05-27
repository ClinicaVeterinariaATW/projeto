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
public class ModeloFuncionario extends ModeloPessoa implements InterfaceControleDados{
    private int idFuncionario;
    private int senhaFuncionario;

    public ModeloFuncionario() {
    }

    public ModeloFuncionario(int idFuncionario, int senhaFuncionario, String nome, String sobrenome, String cpf, String email, String sexo, Date dataNascimento) {
        super(nome, sobrenome, cpf, email, sexo, dataNascimento);
        this.setIdFuncionario(idFuncionario);
        this.setSenhaFuncionario(senhaFuncionario);
    }
    
    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public int getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setSenhaFuncionario(int senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
    
    
}
