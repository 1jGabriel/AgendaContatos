package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDAO;
import model.Contato;

@WebServlet(urlPatterns = { "/BuscarNome" })
public class BuscarPorNome extends HttpServlet {

	private static final long serialVersionUID = -9169126319537685677L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			String nome = request.getParameter("buscarNome");
			
			ArrayList<Contato> contato = new ContatoDAO().consultar(nome);
			
			request.getSession().setAttribute("buscarNomeId", contato.get(0).getId());
			response.sendRedirect("/projeto-agenda/buscarContato.jsp");

		} catch (Exception e) {
			e.printStackTrace();
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
