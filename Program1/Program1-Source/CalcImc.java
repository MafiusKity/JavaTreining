/**	CalcImc.java
 * 	Autor: MafiusKity
 * 	Freatures:
 * 		Calcula imc em Kg/m e em libras/polegadas	*/

import java.util.Scanner;

public class CalcImc{
	float peso, altura, imc;
	Scanner input = new Scanner(System.in);
	
	public float CalcImc(){
	System.out.print("Peso em Kg: ");
	peso = input.nextFloat();
	System.out.print("\nAltura em metros: ");
	altura = input.nextFloat();
	imc = peso / (altura * altura);
	return imc;
	}
	public float calcImcGring(){
	System.out.print("Peso em libras: ");
	peso = input.nextFloat();
	System.out.print("\nAltura em polegadas: ");
	altura = input.nextFloat();
	imc = peso * 703 / (altura * altura);
	return imc;		
	}
	public void calcImcReport(float imc){
		System.out.printf("%s%f%n","\nIMC=",imc);
		if(imc < 18.5){
			System.out.println("Underweight (less than 18.5)");
		}
		if(imc >= 18.5 && imc <= 24.95){
			System.out.println("Normal (between 18.5 and 24.9)");			
		}
		if(imc > 24.95 && imc <=29.95){
			System.out.println("Overweigth (between 25 and 29.9)");
		}
		if(imc >= 30){
			System.out.println("Obese (30 or greater)");
		}
	}
}
