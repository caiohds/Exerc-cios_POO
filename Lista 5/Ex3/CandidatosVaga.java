public class CandidatosVaga{
	private Candidatos candidatos;
	private Vagas vagas;
	
	public CandidatosVaga(Vagas vagas,Candidatos candidatos){
		
		this.candidatos = candidatos;
		this.vagas = vagas;
	}
	public String toString(){
		
		return "-------Candidatos-------" + "\n" + this.candidatos + "\n-------Vagas--------"+"\n" + this.vagas;
	}
	public int getId(){
		
		return vagas.getId();	
	}
	public Candidatos getCandidatos(){
		
		return this.candidatos;
	}
}

