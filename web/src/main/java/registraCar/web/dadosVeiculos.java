package registraCar.web;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dadosVeiculos {
	private static ArrayList<Veiculo> veiculos = new ArrayList<>();  

	public static ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void addVeiculos(Veiculo addVeiculo) {
        veiculos.add(addVeiculo);     
    }
	
	 public List<Veiculo> getEmpresas(){
	        return dadosVeiculos.veiculos;
	    }
	
//	Remove determinado objeto capato pelo ID
	public void removeV(Integer id) { 
	    Iterator<Veiculo> i = veiculos.iterator();
	    while(i.hasNext()){ 
	        Veiculo objeto = i.next();
	        if(objeto.getId() == id ) {
	            i.remove();
	        }
	    }
	}
	
	public Veiculo buscaVeiculoId(Integer id) {
		for(Veiculo carro: veiculos) {
			if(carro.getId() == id) {
				return carro;
					}
		}
		return null;
	}

}

