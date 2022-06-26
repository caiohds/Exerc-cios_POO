public class Computador{
	private String placa_mae;
	private String processador;
	private String memoria;
	private String disco;
	private String monitor;
	private int valor_final;
	
	public Computador(){
		
		placa_mae = "nenhum";
		processador = "nenhum";
		memoria = "nenhum";
		disco = "nenhum";
		monitor = "nenhum";
		valor_final = 0;
	}
	public void setPlaca_mae(String placa_mae,int valor){
		this.valor_final +=valor;
		this.placa_mae = placa_mae;
	}
	public String getPlaca_mae(){
		
		return "Placa mae: " + placa_mae;
	}
	public void setProcessador(String processador,int valor){
		this.valor_final +=valor;
		this.processador = processador;
	}
	public String getProcessador(){
		
		return "Processador: " + processador;
	}
	public void setMemoria(String memoria,int valor){
		this.valor_final +=valor;
		this.memoria = memoria;
	}
	public String getMemoria(){
		
		return "Memoria: " + memoria;
	}
	public void setDisco(String disco,int valor){
		this.valor_final +=valor;
		this.disco = disco;
	}
	public String getDisco(){
		
		return "Disco: " + disco;
	}
	public void setMonitor(String monitor,int valor){
		this.valor_final +=valor;
		this.monitor = monitor;
	}
	public String getMonitor(){
		
		return "Monitor: " + monitor;
	}
	public String toString(){
		
		return getPlaca_mae() 
		+ "\n" + getProcessador()
		+"\n" + getMemoria() 
		+"\n" + getDisco() 
		+"\n" + getMonitor()
		+"\n" + valor_final;  
	}
}

