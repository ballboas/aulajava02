package br.com.ericobalboa;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite o Numero: ");		
		int numero = Integer.parseInt(entrada.nextLine());
		
		int resultado = numero%2;
		
		if (resultado == 0){
			System.out.println("Par");
			
		}else{
			System.out.println("Impar");
		}
    }
}