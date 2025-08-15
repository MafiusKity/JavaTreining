/**	Edo2.java
	Author: MafiusKity
	Freatures:
		Resolução de equações do 2°Grau	*/

import java.util.Scanner;

public class Edo2{
	
	public static void Edo2(){
		Scanner input = new Scanner(System.in);
		double a, b, c, delta;
		System.out.println("Uma EDO linear ordinária de 2°Ordem pode ser descrita como:");
		System.out.println("aX² + bX + c = 0");
		System.out.println("Forneça os valores:");
		System.out.print("a: ");
		a = input.nextFloat();
		System.out.print("\nb: ");
		b = input.nextFloat();
		System.out.print("\nc: ");
		c = input.nextFloat();
		delta = b * b - 4 * a * c;
		if(delta < 0){
			System.out.println("As raízes para essa equação não são reais!");
		}
		if(delta == 0){
			double x = (- b / (2 * a));
			System.out.printf("A raiz da equação é %g%n",x);
		}
		if(delta > 0){
			double x1 = (- b + Math.sqrt(delta)) / (2 * a);
			double x2 = (- b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("As raízas da equação são %g e %g%n",x1,x2);
		}
	}
}
