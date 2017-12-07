package controller;

import dao.AgendaDAO;
import model.Contato;

public class AgendaController {
	private AgendaDAO dao = new AgendaDAO();

	public void inserirContato(Contato contato){
		dao.inserirContato(contato);
	}
	
	public void deletarContato(Contato contato){
		dao.deletarContatoNaAgenda(contato.getId());
	}
	
	
}
