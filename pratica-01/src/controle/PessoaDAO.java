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
	
	public boolean inserir(Pessoa p) {
		
		//Instacia Conexao//
		con = Conexao.getInstancia();
		
		//Abrir Conexao//
		Connection c = con.conectar();
		try { 
			String 	query = "UPDATE pessoa SET nome = ? WHERE cpf = ?";
			PreparedStatement stm = c.prepareStatement(query);
			stm.setString(1,  p.getNome());
			stm.setString(2,  p.getNome());
			stm.executeUpdate();
			return true;
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return false;
	}
		
	
	public boolean atualizar(Pessoa p) {
		return false;
	}
	
	public boolean deletar(Pessoa p) {
		return false;
		
	}
	public ArrayList<Pessoa> listarPessoa(){
		//Instacia Conexao//
		con = Conexao.getInstancia();
		
		//Abrir Conexao//
		Connection c = con.conectar();
		try { 
			Statement stm = c.createStatement();
			String query = "DELETE FROM PESSOA where cpf = ?";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				
			}
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return null;
	}


}
