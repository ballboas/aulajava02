package br.com.ericobalboa;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Menu {
	
	public final static int CADASTROPRODUTO = 1;
	public final static int EMISSAONOTA 	= 2;
	public final static int CANCELARCOMPRA  = 3;
	public final static int EFETUARVENDA 	= 4;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Menu Principal");
		System.out.println("1 - Cadastro de Produtos");
		System.out.println("2 - Emitir Nota Fiscal");
		System.out.println("3 - Cancelar Compra");
		System.out.println("4 - Efetuar Venda");
		
		System.out.println("Digite a Opcao desejada: ");
		
		int opcao = entrada.nextInt();
		
		switch(opcao){
		case CADASTROPRODUTO:
			System.out.println("Cadastro de Produtos");
			break;
		case EMISSAONOTA:
			System.out.println("Emitir Nota Fiscal");
			break;
		case CANCELARCOMPRA:
			System.out.println("Cancelar Compra");
			break;
		case EFETUARVENDA:
			System.out.println("Efetuar Venda");
			break;
		default:
			System.out.println("Opcao Invalida");
			break;
		}
	}

}
