public class Desempregados extends Candidatos{
	private int tempo;
	
	public Desempregados(String nome, int idade,int tempo){
			
		super(nome,idade);
		this.tempo = tempo;
	}
	public String toString(){
	
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTempo Desempregado: " + this.tempo;
	}
}

