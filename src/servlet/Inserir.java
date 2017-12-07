package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import dao.ContatoDAO;
import model.Contato;

@WebServlet(urlPatterns = { "/Inserir" })
public class Inserir extends HttpServlet {

	private static final long serialVersionUID = -9169126319537685677L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String celular = request.getParameter("celular");
			String telefone = request.getParameter("telefone");
			String email = request.getParameter("email");

			Contato contato = new Contato(nome, telefone, celular, email);

			new ContatoDAO().inserirContato(contato);
			
			JOptionPane.showMessageDialog(null, "This language just gets better and better!");

			//response.sendRedirect("/projeto-agenda/ok.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("/projeto-agenda/erro.jsp");
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}

}
