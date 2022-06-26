public class Habitat{
	private String nome;
	private int comprimento;
	private int largura;
	
	
	public Habitat(String nome, int comprimento, int largura){
		
		this.nome = nome;
		this.comprimento = comprimento;
		this.largura = largura;
	}
	public int getAreaTotal(){
		
		return largura*comprimento;
	}
	public String toString(){
	
		return "Habitat: " + this.nome + "\nComprimento: " + this.comprimento + "\nLargura: " + this.largura + "\nArea total: " + getAreaTotal();
	}
}
