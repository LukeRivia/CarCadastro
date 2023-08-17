package registraCar.web;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/cadastraVeiculos")
public class cadastraVeiculosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Usado metodo doGet para "capturar" as informações que serão submetidas no form do arquivo "formVeiculos.JSP"
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 	
		 	// Captando informações dos parameter do forms "formVeiculos.jsp"
		 	String idV = request.getParameter("id");
		 	Integer id = Integer.valueOf(idV);
		 	
	        String nameV = request.getParameter("nome");
	        String marcaV = request.getParameter("marca");
	        
	        
	        
	        // Criação de novo objeto e set de atribuições da classe
	        dadosVeiculos verifica = new dadosVeiculos();
	        Veiculo veiculo = new Veiculo();
			
			if(verifica.VerificaId(id) == true){
				boolean verificaID = true;
				RequestDispatcher rd = request.getRequestDispatcher("/formVeiculos.jsp");
				rd.forward(request, response);
			}
			else{

	        veiculo.setNome(nameV);
	        veiculo.setMarca(marcaV);
	        veiculo.setId(id);
	        
	        // Instacia um novo objeto para classe DadosVeiculos onde ficaram armazenados os arrays dos objs veiculos
	        dadosVeiculos bancoVeiculos = new dadosVeiculos();
	        bancoVeiculos.addVeiculos(veiculo);
	        
//	        response.sendRedirect("listagemVeiculos.jsp");
	        
	        // Chama os veiculos do array de veiculos da classe "CadastraVeiculos.java" e envia para /listagem JSP onde os arquivos serão trabalhados
	        List<Veiculo> listaDosVeiculos = dadosVeiculos.getVeiculos();
	        request.setAttribute("veiculo", listaDosVeiculos);
	        RequestDispatcher rd = request.getRequestDispatcher("/listagemVeiculos.jsp");
	        rd.forward(request, response);
	    }


	 }
}
