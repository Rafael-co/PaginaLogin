package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Conexao;

/**
 *
 * @author rafael
 */
public class LoginDAO {

    Connection conn;

    public ResultSet autenticacao(UsuarioDTO usuarioDto) {
        conn = new Conexao().conectaBD();

        try {
            
            String sql = " Select * from usuario where email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarioDto.getEmail());
            pstm.setString(2, usuarioDto.getSenha());
            
            ResultSet resultado = pstm.executeQuery();
            return resultado;
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos " + erro.getMessage());
            return null;
        }
    }

}
