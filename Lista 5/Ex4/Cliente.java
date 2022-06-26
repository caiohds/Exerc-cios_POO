public class Cliente {
	private int codigo;
	private String nome;
	private int idade;
	
	public Cliente(int codigo,String nome,int idade){
		
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}
	public int getCodigo(){
		
		return this.codigo;
	}
	public String toString(){
		
		return this.codigo + "- " + " Nome: " + this.nome + " Idade: " + this.idade;
	}
}

