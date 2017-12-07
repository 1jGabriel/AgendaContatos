package controller;

import java.util.ArrayList;

import dao.ContatoDAO;
import model.Contato;

public class ContatoController {

		private ContatoDAO dao = new ContatoDAO();
		private AgendaController agendaController = new AgendaController();
		
		public void inserirContato(Contato contato){
			dao.inserirContato(contato);
			agendaController.inserirContato(dao.consultar(contato.getNome()).get(0));
			
		}
		
		public ArrayList<Contato> listarTodosContatos(){
			return dao.consultarTodos();
		}
		
		public void updateContato(Contato contato){
			dao.updateContato(contato);
			
		}
		
		public void deletarContato(Contato contato){
			agendaController.deletarContato(contato);
			dao.deletarContato(contato.getId());
		}

		
		public ArrayList<Contato> listarPorNome(String nome){
			return dao.consultar(nome);
		}
		

	}