package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import configuration.ConnectionFactory;
import model.Contato;

public class AgendaDAO {
	private Connection con;
	private Statement comando;
	
	private static final String INSERIR_CONTATO_NA_AGENDA = " INSERT INTO agenda (id_contato) VALUES (?)";
	
	private static final String DELETAR_CONTATO_NA_AGENDA = "DELETE FROM agenda where agenda.id_contato= ? ";
	
	//deleta primeiro em agenda, depois na tabela de contato em contato
	
	
	public void inserirContato(Contato contato) {

		con = ConnectionFactory.getConnection();

		try {
			con.prepareStatement(INSERIR_CONTATO_NA_AGENDA);
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(INSERIR_CONTATO_NA_AGENDA);

			preparedStmt.setInt(1, contato.getId());

			preparedStmt.execute();

			con.close();
		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}
	
	public void deletarContatoNaAgenda(int id) {
		con = ConnectionFactory.getConnection();
		try {
			con.prepareStatement(DELETAR_CONTATO_NA_AGENDA);
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(DELETAR_CONTATO_NA_AGENDA);

			preparedStmt.setInt(1, id);

			preparedStmt.execute();

			con.close();
		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}
	
	
}
