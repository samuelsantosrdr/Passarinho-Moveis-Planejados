package DAO;

import DTO.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Funcionario> lista = new ArrayList<>();

    public ResultSet autenticarUsuario(Funcionario func) {
        conn = new ConexaoBD().conectaBD();

        try {
            String sql = "select * from funcionario where nomeCompleto = ? and senha = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, func.getNomeCompleto());
            pstm.setString(2, func.getSenha());

            rs = pstm.executeQuery();

            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario DAO" + e);
            return null;
        }
    }

    public void cadastrarFuncionario(Funcionario func) {
        String sql = "INSERT INTO funcionario (nomeCompleto, cpf, email, cargo, dtAdmissao, situacao, telefone, salario, senha, cep, rua, cidade, numero, bairro, estado)\n"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        conn = new ConexaoBD().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, func.getNomeCompleto());         // nomeCompleto
            pstm.setString(2, func.getCpf());       // cpf
            pstm.setString(3, func.getEmail());    // email
            pstm.setString(4, func.getCargo());           // cargo
            pstm.setDate(5, func.getDtAdmissao());  // dtAdmissao
            pstm.setBoolean(6, func.isSituacao());             // situacao
            pstm.setString(7, func.getTelefone());         // telefone
            pstm.setDouble(8, func.getSalario());             // salario
            pstm.setString(9, func.getSenha());          // senha
            pstm.setString(10, func.getCep());        // cep
            pstm.setString(11, func.getRua());   // rua
            pstm.setString(12, func.getCidade());        // cidade
            pstm.setInt(13, func.getNumero());              // numero
            pstm.setString(14, func.getBairro());           // bairro
            pstm.setString(15, func.getEstado());               // estado

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario Insert " + e);
        }
    }

    public ArrayList<Funcionario> listarFuncionario() {
        String sql = "select * from funcionario";
        conn = new ConexaoBD().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario func = new Funcionario();
                func.setId(rs.getInt("id"));
                func.setBairro(rs.getString("bairro"));
                func.setCargo(rs.getString("CARGO"));
                func.setCep(rs.getString("cep"));
                func.setCidade(rs.getString("cidade"));
                func.setCpf(rs.getString("cpf"));
                func.setDtAdmissao(rs.getDate("dtAdmissao"));
                func.setEmail(rs.getString("email"));
                func.setEstado(rs.getString("estado"));
                func.setNomeCompleto(rs.getString("nomeCompleto"));
                func.setNumero(rs.getInt("numero"));
                func.setRua(rs.getString("Rua"));
                func.setSalario(rs.getDouble("salario"));
                func.setSenha(rs.getString("senha"));
                func.setSituacao(rs.getBoolean("situacao"));
                func.setTelefone(rs.getString("telefone"));

                lista.add(func);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Listar Func " + e);
        }

        return lista;
    }

    public void alterarFuncionario(Funcionario func) {

        String sql = "UPDATE funcionario SET nomeCompleto=?, cpf=?, email=?, cargo=?, dtAdmissao=?, situacao=?, telefone=?, salario=?, senha=?, cep=?, rua=?, cidade=?, numero=?, bairro=?, estado=? WHERE id=?";

        conn = new ConexaoBD().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, func.getNomeCompleto());         // nomeCompleto
            pstm.setString(2, func.getCpf());       // cpf
            pstm.setString(3, func.getEmail());    // email
            pstm.setString(4, func.getCargo());           // cargo
            pstm.setDate(5, func.getDtAdmissao());  // dtAdmissao
            pstm.setBoolean(6, func.isSituacao());             // situacao
            pstm.setString(7, func.getTelefone());         // telefone
            pstm.setDouble(8, func.getSalario());             // salario
            pstm.setString(9, func.getSenha());          // senha
            pstm.setString(10, func.getCep());        // cep
            pstm.setString(11, func.getRua());   // rua
            pstm.setString(12, func.getCidade());        // cidade
            pstm.setInt(13, func.getNumero());              // numero
            pstm.setString(14, func.getBairro());           // bairro
            pstm.setString(15, func.getEstado());
            pstm.setInt(16, func.getId());              // estado

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario Update " + e);
        }

    }
    
    public void excluirFuncionario(Funcionario func){
        String sql = "delete from funcionario where id = ?";
        
        conn = new ConexaoBD().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, func.getId());           
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Funcionario Excluir " + e);
        }

    }

}
