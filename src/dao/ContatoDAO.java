package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import configuration.ConnectionFactory;
import model.Contato;

public class ContatoDAO {
	
	private Connection con;
	private Statement comando;

	private static final String INSERIR_CONTATO = " INSERT INTO contato (nome, telefone, email, celular) VALUES (?, ?, ?, ?);";

	private static final String CONSULTA_TODOS = "SELECT * FROM CONTATO";

	private static final String DELETAR_ID = "DELETE FROM Contato where id = ?";

	private static final String UPDATE_CONTATO = "UPDATE contato SET nome = ?, telefone = ?, email = ?, celular = ? WHERE contato.id = ?";

	private static final String CONSULTA_POR_NOME = "SELECT * FROM contato where nome like ?";
	
	private static final String CONSULTA_POR_NUMERO = "SELECT * FROM contato where celular like ? or telefone like ?";
	
	
	public ArrayList<Contato> consultar(String nome) {
		con = ConnectionFactory.getConnection();
		ArrayList<Contato> contatos = new ArrayList<Contato>();

		try {
			con.prepareStatement(CONSULTA_POR_NOME);
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(CONSULTA_POR_NOME);

			preparedStmt.setString(1, nome+ "%");

			ResultSet resultado = preparedStmt.executeQuery();
			while (resultado.next()) {
				contatos.add(new Contato(resultado.getInt("id"), resultado.getString("nome"),
						resultado.getString("telefone"), resultado.getString("celular"), resultado.getString("email")));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return contatos;
	}
	
	
	
	public ArrayList<Contato> consultarPorTelefone(String telefone) {
		con = ConnectionFactory.getConnection();
		ArrayList<Contato> contatos = new ArrayList<Contato>();

		try {
			con.prepareStatement(CONSULTA_POR_NUMERO);
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(CONSULTA_POR_NUMERO);

			preparedStmt.setString(1, telefone+ "%");
			preparedStmt.setString(2, telefone+ "%");

			ResultSet resultado = preparedStmt.executeQuery();
			while (resultado.next()) {
				contatos.add(new Contato(resultado.getInt("id"), resultado.getString("nome"),
						resultado.getString("telefone"), resultado.getString("celular"), resultado.getString("email")));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return contatos;
	}

	public void inserirContato(Contato contato) {

		con = ConnectionFactory.getConnection();

		try {
			con.prepareStatement(INSERIR_CONTATO);
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(INSERIR_CONTATO);

			preparedStmt.setString(1, contato.getNome());
			preparedStmt.setString(2, contato.getTelefone());
			preparedStmt.setString(3, contato.getEmail());
			preparedStmt.setString(4, contato.getCelular());

			preparedStmt.execute();

			con.close();
		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}

	public ArrayList<Contato> consultarTodos() {
		con = ConnectionFactory.getConnection();

		ArrayList<Contato> contatos = new ArrayList<Contato>();

		try {
			comando = con.createStatement();

			ResultSet resultado = comando.executeQuery(CONSULTA_TODOS);

			while (resultado.next()) {
				contatos.add(new Contato(resultado.getInt("id"), resultado.getString("nome"),
						resultado.getString("telefone"), resultado.getString("celular"), resultado.getString("email")));
			}
			comando.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contatos;
	}

	public void deletarContato(int id) {
		con = ConnectionFactory.getConnection();
		try {
			con.prepareStatement(DELETAR_ID);
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(DELETAR_ID);

			preparedStmt.setInt(1, id);

			preparedStmt.execute();

			con.close();
		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}

	public void updateContato(Contato contato) {
		con = ConnectionFactory.getConnection();

		try {
			con.prepareStatement(UPDATE_CONTATO);
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(UPDATE_CONTATO);
			preparedStmt.setString(1, contato.getNome());
			preparedStmt.setString(2, contato.getEmail());
			preparedStmt.setString(3, contato.getCelular());
			preparedStmt.setString(4, contato.getTelefone());
			preparedStmt.setInt(5, contato.getId());
			preparedStmt.executeUpdate();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
