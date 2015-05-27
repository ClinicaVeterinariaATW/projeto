/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author William
 */
public class ModeloGerente extends ModeloPessoa {
    


    public ModeloGerente() {
    }

    public ModeloGerente(String nome, String sobrenome, String cpf, String email, String sexo, Date dataNascimento) {
        super(nome, sobrenome, cpf, email, sexo, dataNascimento);
    }
    
    
    
}
