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
			String 	query = "INSERT INTO pessoa" + "(cpf,nome) VALUES (?,?);";
			PreparedStatement stm = c.prepareStatement(query);
			stm.setInt(1, 123);
			stm.setString(2, "joana");
			
			stm.executeUpdate();
		
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
			String query = "SELECT * FROM pessoa";
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
