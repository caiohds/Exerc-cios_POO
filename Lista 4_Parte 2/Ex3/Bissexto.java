public class Bissexto{
	
	private int ano;
	
	public Bissexto(){
	
		this.ano = 2000;
	}
	public void setAno(int ano){
		
		this.ano = ano;
	}
	public int getAno(){
		
		return this.ano;
	}
	public boolean ehBissexto(){
		
		if(this.ano%100 == 0){
			
			if(this.ano%400 ==0){	
			
				return true;
			}
			return false;
		}else if(this.ano%4 ==0){
			
			return true;
		}else{
			
			return false;
		}
	}
}

