/**	AreaCirculo.java
	Autor: MafiusKity
	Freatures:
		Calcula a área de um círculo
	*/

import java.util.Scanner;

public class AreaCirculo{
	double pi = 3.14159;
	double diameter;
	double circunfer;
	double area;
	double r;
	Scanner input = new Scanner(System.in);
	
	public void AreaCirculo(){
		System.out.print("Raio do círculo: ");
		r = input.nextDouble();
		diameter = 2 * r;
		circunfer = diameter * pi;
		area = pi * r * r;
		System.out.printf("%n%s%E%s%E%s%E%s%E%n",
			"Para uma raio ",r,":\nDiâmetro: ",diameter,
			"\nCircunferência: ",circunfer,"\nÁrea: ",area);
	}
}
