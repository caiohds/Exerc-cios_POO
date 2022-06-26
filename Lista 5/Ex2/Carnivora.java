public class Carnivora extends Planta{
	private boolean venenosa;
	public Carnivora(boolean venenosa, String nome, String especie){
		
		super(nome,especie);
		this.venenosa = venenosa;	
	}
	public String toString(){
		
		return "" + (venenosa ? "Venosa": "Nao e venenosa") + " Nome: " + this.getNome() + " Especie: " + this.getEspecie();
	}
	
}
