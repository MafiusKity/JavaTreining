/**	CalcEcoSol.java
	Autor: MafiusKity
	Freatures:
		Calcula despesa mensal de automóvel */

import java.util.Scanner;

public class CalcEcoSol{
	float precoCombus, kilometragemCarro, distancia, estacionamento;
	float pedagio;
	Scanner input = new Scanner(System.in);
	public void CalcEcoSol(){
			System.out.print("Preço do combustível por litro: ");
			precoCombus = input.nextFloat();
			System.out.print("\nGasto diário com estacionamento: ");
			estacionamento = input.nextFloat();
			System.out.print("\nPreço do pedágio (unitário): ");
			pedagio = input.nextFloat();
			System.out.print("\nQuantos kilometros seu automóvel faz por litro? ");
			kilometragemCarro = input.nextFloat();
			System.out.print("\nDistância percorrida diariamente (Km): ");
			distancia = input.nextFloat();
			System.out.println("\n----------------------------------------------------");
			System.out.println("\nConsiderando um mês com 30 dias...");
			System.out.printf("Seu gasto com o veículo é de %f.2 por mês%n",
				(2 * pedagio + estacionamento) * 30 + (distancia * 30 / kilometragemCarro) * precoCombus);
	}
}
