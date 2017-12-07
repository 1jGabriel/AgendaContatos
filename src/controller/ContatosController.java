package controller;

import java.util.ArrayList;

import dao.ContatoDAO;
import model.Contato;

public class ContatosController {

		private ContatoDAO dao = new ContatoDAO();
		
		public void inserirContato(Contato contato){
			dao.inserirContato(contato);
		}
		
		public ArrayList<Contato> listarTodosContatos(){
			return dao.consultarTodos();
		}
		
		public void updateContato(Contato contato){
			dao.updateContato(contato);
			
		}
		
		public void deletarContato(Contato contato){
			dao.deletarContato(contato.getId());
		}

		
		public ArrayList<Contato> listarPorNome(String nome){
			return dao.consultar(nome);
		}
		

	}