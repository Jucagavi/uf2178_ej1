package garciavillalonjuancarlos_UF2178_ej1;

import java.util.Scanner;

public class Ej1_garciavillalon_juancarlos {

	public static void main(String[] args) {
		
		double peso, altura, imc;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Programa para calcular el IMC.");
		System.out.println("Introduce peso en kg:");
		peso = teclado.nextDouble();

		System.out.println("Introduce altura en metros:");
		altura = teclado.nextDouble();
		
		imc = peso/(Math.pow(altura, 2));
		String diagnostico="";
		
		if (imc<18.5){
			diagnostico="Bajo peso";
		} else if (imc>=18.5 && imc<=24.9){
			diagnostico="Peso normal (saludable)";
		} else if (imc>=25 && imc<=29.9) {
			diagnostico="Sobrepeso";
		} else if (imc>=30 && imc<=40) {
			diagnostico="Obesidad premórbida";
		} else if (imc>40) {
			diagnostico="Obesidad mórbida";
		}
		
		System.out.printf("El paciente de %.2f kg y %.2f metros de altura tiene un IMC de %.2f y tiene un diagnostico de %s.",peso,altura,imc,diagnostico);
		
		teclado.close();
	}

}
