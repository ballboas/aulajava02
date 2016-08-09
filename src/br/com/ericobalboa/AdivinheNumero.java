package br.com.ericobalboa;

import java.util.Scanner;

public class AdivinheNumero {
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
		
	int tentativas = 0;
	int numero;
	int numerochute;
	
	System.out.println("Diga o Numero: ");
	numero = entrada.nextInt();

	do{
		tentativas += 1;
		System.out.println("Chute o Numero: ");
		numerochute = entrada.nextInt();
		
		if (numero > numerochute){
			System.out.println("Chute Baixo");
		}else if (numero < numerochute){
			System.out.println("Chute Alto");
		}	
	}while (numero != numerochute);
	
	System.out.println("Acertou o numero na tentativa "+tentativas);

}
}