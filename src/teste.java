import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import dao.ContatoDAO;
import model.Contato;

public class teste {
	
	public static void main(String[] args) {
		Contato contato = new Contato("testeaaaa", "92288500", "992288500", "joao.sousa@solutis.com.br");
		
		ContatoDAO dao = new ContatoDAO();
		
		
		dao.inserirContato(contato);
		dao.deletarContato(3);
		ArrayList<Contato> contatos =   dao.consultarTodos();
		
		//dao.consultarPorTelefone("92288500");
		
		for (Contato contato2 : contatos) {
			System.out.println(contato2.toString());
		}
		
		
		
	}

}
