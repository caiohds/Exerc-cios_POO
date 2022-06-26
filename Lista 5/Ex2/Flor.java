public class Flor extends Planta{
	private String cor;
	public Flor(String cor, String nome, String especie){
		super(nome,especie);
		this.cor = cor;	
	}
	public String toString(){
		
		return "Cor: " + this.cor + " Nome: " + this.getNome() + " Especie: " + this.getEspecie();
	}
	
}
