import java.util.ArrayList;


import dao.ContatoDAO;
import model.Contato;

public class teste {
	
	public static void main(String[] args) {
		Contato contato = new Contato(5, "joao", "92288500", "992288500", "editei");
		
		ContatoDAO dao = new ContatoDAO();
		
		
		//dao.inserirContato(contato);
		//dao.deletarContato(3);
		dao.updateContato(contato);
		//dao.consultarPorTelefone("92288500");
		ArrayList<Contato> contatos =   dao.consultarTodos();
		
		for (Contato contato2 : contatos) {
			System.out.println(contato2.toString());
		}
		
		
		
	}

}
