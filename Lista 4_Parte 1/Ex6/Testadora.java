public class Testadora{
	private int dia1;
	private int dia2;
	private int mes1;
	private int mes2;
	private int ano2;
	private int ano1;
	
	public Testadora(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2){
		
		this.dia1 = dia1;
		this.mes1 = mes1;
		this.ano1 = ano1;
		this.dia2 = dia2;
		this.mes2 = mes2;
		this.ano2 = ano2;
	}
	public String validar_datas(){
		
		if((dia1>0 && dia1<=30) &&(mes1>0 && mes1<=12) && (ano1>0) && (dia2>0 && dia2<=30) &&(mes2>0 && mes2<=12) && (ano2>0)){
			
			return "Datas valida!";
		}else{
			
			return "Datas invalidas!";
		}	
	}
	public String mostrar_datas(){
		
		return String.format("Data 1: (%d,%d,%d)",this.dia1,this.mes1,this.ano1) + String.format("\nData 2: (%d,%d,%d)",this.dia2,this.mes2,this.ano2); 
	}
	public String comparar_datas(){
		if((this.dia1 == this.dia2) && (this.mes1 == this.mes2) && (this.ano1 == this.ano2)){
			
			return "As datas sao iguais!";
		}else{
			
			return "As datas nao sao iguais!";
		}
		
	}
	public String maior(){
		if(ano1>ano2){
			
			return "A primeira data e maior!";
		}else if( ano2>ano1){
			
			return "A segunda data e maior!";
		}else if(mes1>mes2){
		
			return "A primeira data e maior!";
		}else if(mes2>mes1){
			
			return "A segunda data e maior!";
		}else if(dia1> dia2){
			
			return "A primeira data e maior!";
		}else if(dia2> dia1){
			
			return "A segunda data e maior!"; 
		}else{
			
			return "As datas sao iguais!";
		}
	}
	public String menor(){
		
		if(ano1>ano2){
			
			return "A segunda data e menor!";
		}else if( ano2>ano1){
			
			return "A primeira data e menor!";
		}else if(mes1>mes2){
		
			return "A segunda data e menor!";
		}else if(mes2>mes1){
			
			return "A primeira data e menor!";
		}else if(dia1> dia2){
			
			return "A segunda data e menor!";
		}else if(dia2> dia1){
			
			return "A primeira data e menor!"; 
		}else{
			
			return "As datas sao iguais!";
		}
	}
	public String diferenca(){
		int quantidade_dias =0;
		if(ano1> ano2){
			if(mes1>mes2){
				if(dia1>dia2){
					
					quantidade_dias =((dia1-dia2) + ((mes1-mes2)*30) + ((ano1-ano2) * 365));
				}else if(dia2>dia1){
					
					quantidade_dias = (((mes1-mes2)*30) + ((ano1-ano2) * 365) -(dia2-dia1));
				}else{
					quantidade_dias = (((mes1-mes2)*30) + ((ano1-ano2) * 365));
				}
			}else if(mes2>mes1){
				if(dia1>dia2){
					
					quantidade_dias =((dia1-dia2) + ((ano1-ano2) * 365)- ((mes2-mes1)*30));
				}else if(dia2>dia1){
					
					quantidade_dias = ((ano1-ano2) * 365) -(dia2-dia1) - ((mes2-mes1)*30);
				}else{
					quantidade_dias = (((ano1-ano2) * 365) - ((mes2-mes1)*30));
				}
			}else{
				if(dia1>dia2){
					
					quantidade_dias =((dia1-dia2) + ((ano1-ano2) * 365));
				}else if(dia2>dia1){
					
					quantidade_dias = ((ano1-ano2) * 365) -(dia2-dia1);
				}else{
					quantidade_dias = (((ano1-ano2) * 365));
				}	
			}
			
		}else if (ano2>ano1){
			if(mes2>mes1){
				if(dia2> dia1){
					
					quantidade_dias = ((dia2-dia1) + (mes2-mes1)*30 + (ano2-ano1)*365);
				}else if (dia1>dia2){
					
					quantidade_dias = ((mes2-mes1)*30 + (ano2-ano1)*365 -(dia2-dia1));
				}else{
					
					quantidade_dias = ((mes2-mes1)*30 + (ano2-ano1)*365);
				}
			}else if(mes1>mes2){
				if(dia2> dia1){
					
					quantidade_dias = ((dia2-dia1) - (mes1-mes2)*30 + (ano2-ano1)*365);
				}else if (dia1>dia2){
					
					quantidade_dias = (-(mes1-mes2)*30 + (ano2-ano1)*365 -(dia1-dia2));
				}else{
					
					quantidade_dias = (-(mes1-mes2)*30 + (ano2-ano1)*365);
				}
				
			}else{
				if(dia2> dia1){
					
					quantidade_dias = ((dia2-dia1)+ (ano2-ano1)*365);
				}else if (dia1>dia2){
					
					quantidade_dias = ((ano2-ano1)*365 -(dia1-dia2));
				}else{
					
					quantidade_dias = ( (ano2-ano1)*365);
				}
			}
			}else{
				if(mes1>mes2){
					if(dia1>dia2){
						
						quantidade_dias = ((mes1-mes2)*30 + (dia1-dia2));
					}else if(dia2>dia1){
						
						quantidade_dias = ((mes1-mes2)*30 - (dia2-dia1));
					}else{
						
						quantidade_dias = (mes1-mes2) * 30;
					}
				}else if (mes2>mes1){
					
					if(dia2>dia1){
						
						quantidade_dias = ((mes2-mes1)*30 + (dia2-dia1));
					}else if(dia1>dia2){
					
						quantidade_dias = ((mes2-mes1)*30 - (dia2-dia1));
					}else{
						
						quantidade_dias = (mes2-mes1)*30;
					}
				}else{
					if(dia2>dia1){
						
						quantidade_dias = (dia2-dia1);
					}else if( dia1>dia2){
						
						quantidade_dias = dia1-dia2;
					}
					
				}
		}
		return "Quantidade de dias: " +quantidade_dias;
	}
}

