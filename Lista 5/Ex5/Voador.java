public class Voador extends Animal{
	private String cor;
	
	public Voador(String nome, String especie,String cor){
		super(nome,especie);
		this.cor = cor;
		
	}
	public String toString(){
		
		return "Nome: " + getNome() + "  Especie: " + getEspecie() + "  Cor da pena: " + this.cor;
	}
}

