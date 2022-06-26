public class Candidatos{
	private String nome;
	private int idade;
	
	public Candidatos(String nome, int idade){
			
		this.nome = nome;
		this.idade = idade;	
	}
	public String toString(){
	
		return "Nome: " + this.nome + "\nIdade: " + this.idade;
	}
	public String getNome(){
		
		return this.nome;
	}
	public int getIdade(){
		
		return this.idade;
	}
}

