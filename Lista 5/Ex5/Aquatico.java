public class Aquatico extends Animal{
	private boolean respirar;
	
	public Aquatico(String nome, String especie,boolean respirar){
		super(nome,especie);
		this.respirar = respirar;
		
	}
	public String toString(){
		
		return "Nome: " + getNome() + " Especie: " + getEspecie() + "  " + (this.respirar ? "Respira fora da agua":"Nao respira fora da agua");
	}
}

