package model;

import java.util.Objects;

public class Diretor {

	public String nome;
	
	public Diretor(String nome) {
		this.nome = nome;
	}
	
	public Diretor(Diretor diretor) {
		this.nome = diretor.nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Diretor: " + nome + "\n";
	}
}
