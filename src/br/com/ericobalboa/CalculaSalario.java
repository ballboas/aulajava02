package br.com.ericobalboa;

import java.util.Scanner;

public class CalculaSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o Salario do Funcionario " + nome +": ");
		double salario = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o departamento do Funcionario " + nome + ": ");
		String depto = entrada.nextLine();
		
		if (depto.equals("TI") ){
			System.out.println("O Novo salario do Funcionario " + nome + " é " + (salario*1.1) );
		}else{
			System.out.println("O Salario do Funcionario " + nome + " permanece como " + salario );
		}
	}

}
