package br.com.generation.heranca;

public class animal {

	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void emitirSom() {
		System.out.println("Som do animal: ");
	}
}

