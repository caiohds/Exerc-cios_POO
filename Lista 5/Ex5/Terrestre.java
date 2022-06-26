public class Terrestre extends Animal{
	private int quantidade_patas;
	
	public Terrestre(String nome, String especie,int quantidade_patas){
		super(nome,especie);
		this.quantidade_patas = quantidade_patas;
		
	}
	public String toString(){
		
		return "Nome: " + getNome() + "  Especie: " + getEspecie() + "  Quantidade de patas: " + this.quantidade_patas;
	}
}
