package avaliacao2.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaVeiculos")
public class listaVeiculos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Veiculo> listaDosVeiculos = dadosVeiculos.getVeiculos();
		
		// Atráves desse metodo conseguimos setar um atriburo 
		// com nome Veículo e vincular a "listaDosVeiculos" para que "Veiculo seja chamado no JSP.

        request.setAttribute("veiculo", listaDosVeiculos); 
        RequestDispatcher rd = request.getRequestDispatcher("/listagemVeiculos.jsp");
        rd.forward(request, response);
	
	}

}
