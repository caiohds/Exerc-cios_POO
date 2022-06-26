public class Arvore extends Planta{
	private boolean frutifera;
	public Arvore(boolean frutifera, String nome, String especie){
		
		super(nome,especie);
		this. frutifera = frutifera;	
	}
	public String toString(){
		
		return "" + (this.frutifera ? "Frutifera": "Nao e frutifera") + " Nome: " + this.getNome() + " Especie: " + this.getEspecie();
	}
	
}

