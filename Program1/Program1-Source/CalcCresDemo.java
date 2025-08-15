/**	CalcCresDemo.java
	Autor: MafiusKity
	Freatures:
		Calculadora que projeta o vrescimento demográfico dos próximos
		anos	*/

import java.util.Scanner;

public class CalcCresDemo{
	int anos, s = 1;
	float porcent, populacao;
	Scanner input = new Scanner(System.in);
	public void CalcCresDemo(){
		System.out.print("População atual: ");
		populacao = input.nextFloat();
		System.out.print("\nPorcentagem de crascimento anual: ");
		porcent = input.nextFloat();
		System.out.print("\nPor quantos anos ocorrerá a simulação: ");
		anos = input.nextInt();
		while(s <= anos){
			populacao = populacao * (1 + porcent /100);
			System.out.printf("Ano %d: %f%n",s,populacao);
			s++;
		}
	}
}
