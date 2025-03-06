package model;

public class Produto {
	
	private String name;
	private String localizacao;
	private int quantidade;
	
	public Produto(String name, String localizacao, int quantidade) {
		this.name = name;
		this.localizacao = localizacao;
		this.quantidade = quantidade;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Produto [name=" + name + 
				", localizacao=" + localizacao + 
				", quantidade=" + quantidade + "]";
	}
	
	

}
