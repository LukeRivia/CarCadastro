package avaliacao2.web;
import java.util.ArrayList;

public class dadosVeiculos {
	private static ArrayList<Veiculo> veiculos = new ArrayList<>();  
	
	

	public static ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void addVeiculos(Veiculo addVeiculo) {
        veiculos.add(addVeiculo);    
        
       
    }
	
}

