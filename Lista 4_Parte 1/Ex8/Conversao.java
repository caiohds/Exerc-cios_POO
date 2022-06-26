public class Conversao{
	
	public double conversao(double unidade1,int tipo_conversao){
		
		if(tipo_conversao == 1){
			
			return unidade1*10.76;
		}if(tipo_conversao == 2){
			
			return unidade1/10.76;
		}if(tipo_conversao == 3){
			
			return unidade1*929;
		}if(tipo_conversao == 4){
		
			return unidade1/929;
		}if(tipo_conversao == 5){
			
			return unidade1*640;
		}if(tipo_conversao == 6){
			
			return unidade1/640;
		}if(tipo_conversao == 7){
		
			return unidade1*43.560;
		}if(tipo_conversao == 8){
			
			return unidade1/43.560;
		}
		return 0;
	}
}

