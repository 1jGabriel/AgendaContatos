import java.util.ArrayList;

import controller.AgendaController;
import controller.ContatoController;
import dao.ContatoDAO;
import model.Contato;

public class teste {
	
	public static void main(String[] args) {
		Contato contato = new Contato(6, "teste", "92288500", "992288500", "editei");
		
		ContatoDAO dao = new ContatoDAO();
		ContatoController contatoController = new ContatoController();
		
		
		//contatoController.inserirContato(contato);
		contatoController.deletarContato(contato);
		//dao.updateContato(contato);
		//dao.consultarPorTelefone("92288500");
		ArrayList<Contato> contatos =   contatoController.listarTodosContatos();
		
		for (Contato contato2 : contatos) {
			System.out.println(contato2.toString());
		}
		
		
		
	}

}
