/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import Persistencia.Banco;
import Modelo.ModeloCliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
/**
 *
 * @author Alex
 */
public class ClienteDAO {
    
        public void inserirClienteNoBanco(String nome, String sobrenome, String email, String telefone, String cpf, Date dataNascimento, String sexo, int idCliente) throws ClassNotFoundException, SQLException  
{  
    Banco con = new Banco();
    try{
    con.Conecta();
               String sql = "INSERT INTO cliente(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idCliente) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            stmt.setString(2,sobrenome);
            stmt.setString(3,email);
            stmt.setString(4,telefone);
            stmt.setString(5,cpf);
            stmt.setDate(6,dataNascimento);
            stmt.setString(7,sexo);
            stmt.setInt(8, idCliente);
            stmt.execute();
            con.Desconecta();
        } 
    catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    
    public void pesquisaCliente (String cpf) throws ClassNotFoundException, SQLException{
        Banco con = new Banco();
        con.Conecta();
        Statement stmt = null;
        ResultSet rs = null;
      
        
        rs = stmt.executeQuery("SELECT * FROM Cliente");
        ResultSetMetaData metaData = rs.getMetaData();
        
        while((rs.next()))
        {
            if(metaData.getColumnName(5).equals(cpf))
                break;
                
                
        } 
               
            
             
        }        
        
    }
} 
 

