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
public abstract class ModeloPessoa {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String sexo;
    private Date dataNascimento; 
    private int idCliente;


    
    public ModeloPessoa() {
    }

    public ModeloPessoa(String nome, String sobrenome, String cpf, String email, String sexo, Date dataNascimento) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
        this.setIdCliente(idCliente);
    }

    public String getNome() {
        return nome;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    @Override
    public String toString() {
        return "ModeloPessoa{" + "nome=" + this.getNome() + ", sobrenome=" + this.getSobrenome() + ", cpf=" + this.getCpf() + ", email=" + this.getEmail() + ", sexo=" + this.getSexo() + ", dataNascimento=" + this.getDataNascimento() + '}';
    }
}
