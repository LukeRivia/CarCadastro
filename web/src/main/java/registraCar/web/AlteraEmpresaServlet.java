package registraCar.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//alterar dados
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Parametros para capturar ID
		String paramID = request.getParameter("id");
		Integer ID = Integer.valueOf(paramID);
		
//		Parâmetros para capturar nome e marca.
		String paramName = request.getParameter("nome");
		String paramBrand = request.getParameter("marca");
		
// 		Criando instãncias de objeto para poder acessar e modificar os dados do nosso "BANCO"
		dadosVeiculos banco = new dadosVeiculos();
		Veiculo carro = banco.buscaVeiculoId(ID);

//		Set novos valores do objeto encontrado por sua ID, com novos valores capturados pelo reques.Get
		carro.setId(ID);
		carro.setNome(paramName);
		carro.setMarca(paramBrand);	
		
		response.sendRedirect("listaVeiculos");
	}

}
