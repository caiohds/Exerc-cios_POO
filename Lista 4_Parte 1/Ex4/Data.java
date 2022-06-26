public class Data{
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void setDia(int dia){
	
		this.dia = dia;
	}
	public int getDia(){
		
		return dia;
	}
	public void setMes(int mes){
		
		this.mes = mes;
	}
	public int getMes(){
		
		return mes;
	}
	public void setAno(int ano){
		
		this.ano = ano;
	}
	public int getAno(){
		
		return ano;
	}
	public boolean validarData(){
		
		if((dia>0 && dia<=30) && (mes>0 && mes<=12) && (ano>0)){
			
			return true;
		}else{
		
			return false;
		}
	}
	public String mostrarData(){
		
		return String.format("Data inserida: (%d/%d/%d) ", this.dia, this.mes, this.ano)	;
	}
	
}
