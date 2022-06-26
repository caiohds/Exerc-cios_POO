public class Main_calculadora{
	
	public static void main (String[] args) {
		Calculadora calculo = new Calculadora();
		calculo.setNumero1(10);
		calculo.setNumero2(5);
		System.out.println(calculo.getNumero1());
		System.out.println(calculo.getNumero2());
		System.out.println("Soma: " + calculo.somar());
		System.out.println("Subtracao: " + calculo.subtrair());
		System.out.println("Multiplicacao: " + calculo.multiplicar());
		System.out.println("Divisao: " + calculo.dividir());
	}
}

