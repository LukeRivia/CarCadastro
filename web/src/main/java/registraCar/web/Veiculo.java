package registraCar.web;

import java.util.Date;

public class Veiculo {
	private Integer id;
	private String nome;
	private String Marca;
	private Date dataAbertura = new Date();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;		
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public void SETDATA() {
		dataAbertura = new Date();
	}
}
