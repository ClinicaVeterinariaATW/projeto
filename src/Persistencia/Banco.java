/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Alex
 */
public class Banco {

    private String host;
    private String nomeBanco;
    private String url;
    private String login;
    private String senha;
    private Connection conexao;
    private Statement stmt;



    public void setHost(String host) {
        this.host = host;
    }

    public void setNomebanco(String nomebanco) {
        this.nomeBanco = nomebanco;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public String getHost() {
        return host;
    }

    public String getNomebanco() {
        return nomeBanco;
    }

    public String getUrl() {
        return url;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Connection getConexao() {
        return conexao;
    }

    public Statement getStmt() {
        return stmt;
    }

public Banco(){
        host = "localhost";
        nomeBanco = "clinica";
        url = "jdbc:mysql://localhost/clinica";
        login = "root";
        senha = "alex123";
        conexao = null;
        stmt = null;
    }

    public void Conecta() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = (Connection) DriverManager.getConnection(url,login,senha);
            
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    
    }     

    public void Desconecta(){
        try
        {
        conexao.close();
        }
        catch(Exception exception)
        {
        exception.printStackTrace();
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
      stmt = (Statement) conexao.createStatement();
        return null;
    }

    
}
