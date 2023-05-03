/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Conexao;

/**
 *
 * @author rafael
 */
public class CrudCadastroDAO {

    Connection connect;
    PreparedStatement pstm;

    public void cadastrarNovoUsuario(UsuarioDTO novoUsu) {
        String sql = "insert into usuario(nome,cpf,email,senha,telefone) values(?,?,?,?,?)";
        connect = new Conexao().conectaBD();
        try {
            pstm = connect.prepareStatement(sql);
            pstm.setString(1, novoUsu.getNome());
            pstm.setString(2, novoUsu.getcPF());
            pstm.setString(3, novoUsu.getEmail());
            pstm.setString(4, novoUsu.getSenha());
            pstm.setString(5, novoUsu.getTelefone());
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso" );
             pstm.execute();
             pstm.close();
            
        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro" + Erro);
        }

    }
  public void atualizarUsuario(UsuarioDTO dadosAtualizados){
        String sql = " Update usuario set nome = ?,cpf = ?,email = ?,senha= ? ,telefone = ? where id_usuario = ?;";
        connect = new Conexao().conectaBD();
        try {
            pstm = connect.prepareStatement(sql);
            pstm.setString(1, dadosAtualizados.getNome());
            pstm.setString(2, dadosAtualizados.getcPF());
            pstm.setString(3, dadosAtualizados.getEmail());
            pstm.setString(4, dadosAtualizados.getSenha());
            pstm.setString(5, dadosAtualizados.getTelefone());
            pstm.setInt(6,dadosAtualizados.getIdUsuario());
            JOptionPane.showMessageDialog(null,"Cadastrado atualizado com sucesso" );
             pstm.execute();
             pstm.close();
            
        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o  cadastro" + Erro);
        }
  }
   public void delatarUsuario(Integer id){
        String sql = " delete from usuario where id_usuario = ?;";
        connect = new Conexao().conectaBD();
        try {
            pstm = connect.prepareStatement(sql);
            pstm.setInt(1, id);
          
            JOptionPane.showMessageDialog(null,"Cadastrado excluido com sucesso" );
             pstm.execute();
             pstm.close();
            
        } catch (SQLException Erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o  cadastro" + Erro);
        }
  }
}
