
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaDAO {

	private Conexao con;

	public boolean Inserir(Pessoa pessoa) {
		con = Conexao.getInstancia();
		Connection c = con.conectar();
		try {
			String query = "INSERT into pessoa(cpf, nome) VALUES(?,?);";
			PreparedStatement stm = c.prepareStatement(query);
			stm.setLong(1, pessoa.getCpf());
			stm.setString(2, pessoa.getNome());
			int valida = stm.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.fecharConexao();
		return false;
	}

	public boolean alterar(Pessoa pessoa) {
		Connection conn = Conexao.getInstancia().conectar();
		try {
			String query = "UPDATE pessoa SET nome = ? WHERE cpf = ?";
			PreparedStatement stm = conn.prepareStatement(query);
			stm.setString(1, "Leonardo Ribeiro");
			stm.setLong(2, pessoa.getCpf());
			int valida = stm.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.fecharConexao();
		return false;
	}

	public boolean deletar(Pessoa pessoa) {
		Connection conn = Conexao.getInstancia().conectar();
		try {
			String query = "DELETE FROM pessoa WHERE cpf = ?";
			PreparedStatement stm = conn.prepareStatement(query);
			stm.setLong(1, pessoa.getCpf());
			int valida = stm.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.fecharConexao();
		return false;
	}

	public ArrayList<Pessoa> listarPessoas() {
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		con = Conexao.getInstancia();
		Connection c = con.conectar();
		try {
			Statement stm = c.createStatement();
			String query = "Select * from pessoa";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				int cpf = rs.getInt("cpf");
				String nome = rs.getString("nome");
				Pessoa p = new Pessoa();
				p.setCpf(cpf);
				p.setNome(nome);
				pessoas.add(p);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.fecharConexao();
		return pessoas;
	}

}