package dao;
import controller.ConnectionMySQL;
import model.UsuarioModel;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDao {
    private Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = new ConnectionMySQL().getConnection();
    }
    
    public void adicionar(UsuarioModel usuario){
        String sql = "INSERT INTO jogo(nome,plataforma,preco)VALUES(?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getPlataforma());
            ps.setDouble(3, usuario.getPreco());
            
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            throw new RuntimeException(e);
        }
    }
    
    public List<UsuarioModel> leitura(){
        
        connection = new ConnectionMySQL().getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        List<UsuarioModel> usuarioArray = new ArrayList<>();
        
        try {
            ps = connection.prepareStatement("SELECT * FROM jogo");
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
               UsuarioModel u = new UsuarioModel();
               
               u.setIdJogo(rs.getInt          ("idJogo"));
               u.setNome(rs.getString         ("nome"));
               u.setPlataforma(rs.getString   ("plataforma"));
               u.setPreco(rs.getDouble        ("preco"));
               
               
               usuarioArray.add(u);
               
            }
            JOptionPane.showMessageDialog(null,"Lista DAO funcionou");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro listar DAO");
            throw new RuntimeException();
            
        }
        return usuarioArray;
    } 
    
     public void atualizar(UsuarioModel usuario) {
        String sql = "UPDATE jogo SET nome = ?, plataforma = ?, preco = ?, WHERE idJogo = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getPlataforma());
            ps.setDouble(3, usuario.getPreco());
            ps.setInt(4, usuario.getIdJogo());
            
            ps.execute();
            ps.close();

        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! ERRO DAO "
//                    + "Classe UsuarioDAO");
            throw new RuntimeException(e);
        }
     }
      
     public void deletar(UsuarioModel usuario){
                String sql = "DELETE FROM jogo WHERE idJogo = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, usuario.getIdJogo());
            
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Deu Bom");
            ps.close();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Deu Ruim - Classe DAO");
             throw new RuntimeException(e);
        }
    }
}
