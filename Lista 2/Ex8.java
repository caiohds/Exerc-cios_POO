import java.util.Random;
public class Ex8{
	
	public static void main (String[] args) {
		System.out.println(Dado());
	}
	
	static String Dado(){
		Random random = new Random();
		double lados[] = new double[6];
		lados[0] = 0;
		lados[1] = 0;
		lados[2] = 0;
		lados[3] = 0;
		lados[4] = 0;
		lados[5] = 0;
		int num;
		for(int i = 0;i<1000000;i++){
			num = random.nextInt(6)+1;
			if(num == 1){
				
				lados[0]++;
				
			}
			if(num == 2){
				
				lados[1]++;
				
			}
			if(num == 3){
				
				lados[2]++;
				
			}
			if(num == 4){
				
				lados[3]++;
				
			}
			if(num == 5){
				
				lados[4]++;
				
			}
			if(num == 6){
				
				lados[5]++;
				
			}
		}
		
		return "1: " + (int)lados[0] + "  - "+ (((lados[0]*100)/1000000)) + "%"
		+ "\n2: " +(int)lados[1]+ " - "+ (((lados[1]*100)/1000000)) + "%"
		+ "\n3: " + (int)lados[2] +  " - "+ (((lados[2]*100)/1000000)) + "%" 
		+ "\n4: " + (int)lados[3] + " - "+ (((lados[3]*100)/1000000)) + "%"
		+ "\n5: " + (int)lados[4] + " - "+ (((lados[4]*100)/1000000)) + "%" 
		+ "\n6: " + (int)lados[5] + " - "+ (((lados[5]*100)/1000000)) + "%";
	}
}

