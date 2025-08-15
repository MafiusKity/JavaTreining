/**	Program1.java
	Autor: MAfiusKity
	* Freatures:
	* 	Área de círculo
	* 	Calaculadora de IMC em libras/polegadas e em Kg/m
	* 	Calculadora de crscimento demográfico mundial
	* 	Calculadora de despesas com automóvel
	* 	Resolução de equações do 2°Grau	*/

import java.util.Scanner;

public class Program1{
	public static void main(String[] args){
		Scanner menusInput = new Scanner(System.in);
		int menu1Decision = 0, menu2Decision;
		
		//Loop menu:
		while(menu1Decision != 6){
			System.out.println("=============================================");
			System.out.println("Use , como separador decimal!");
			System.out.println("O programa retorna . como separador decimal\n");
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Área de um círculo");
			System.out.println("[2] Calculadora IMC");
			System.out.println
				("[3] Calculadora de crescimento demográfico mundial");
			System.out.println
				("[4] Calculadora de economia da faixa solidária");
			System.out.println
				("[5] Resolução de EDO linear ordinária de 2°Ordem");
			System.out.println("[6] Exit...");
			System.out.print("Número da opção: ");
			menu1Decision = menusInput.nextInt();
			System.out.println("\n----------------------------------------");
			
			//Executando Ações do menú
			if(menu1Decision == 1){
				AreaCirculo action = new AreaCirculo();
				action.AreaCirculo();
			}
			
			if(menu1Decision == 2){
				float imc = 0;
				System.out.println("[1] IMC usando Libras e Polegadas");
				System.out.println("[2] IMC usando Quilogramas e Metros");
				System.out.println("[0] Exit...");
				System.out.print("Número da opção: ");
				menu2Decision = menusInput.nextInt();
				System.out.println("\n------------------------------------");
				CalcImc action = new CalcImc();
				if(menu2Decision == 1){
					imc = action.calcImcGring();
				}
				if(menu2Decision == 2){
					imc = action.CalcImc();
				}
				if(imc != 0){
					action.calcImcReport(imc);
				}
			}
			
			if(menu1Decision == 3){
				CalcCresDemo action = new CalcCresDemo();
				action.CalcCresDemo();
			}
			
			if(menu1Decision == 4){
				CalcEcoSol action = new CalcEcoSol();
				action.CalcEcoSol();
			}
			
			if(menu1Decision == 5){
				Edo2 action = new Edo2();
				action.Edo2();
			}
		}
		System.out.println("=============================================");
	}
}
