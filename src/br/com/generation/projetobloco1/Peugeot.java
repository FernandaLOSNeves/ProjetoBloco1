package br.com.generation.projetobloco1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peugeot {
	
	static Scanner sc = new Scanner(System.in);
	static String[] peugeot = { "206", "207", "208", "308", "3008" };
	static double[] litrokmpeugeot = { 9.4, 10.6, 15.1, 10.0, 9.2 };

	static int opcao1 = 0;
	static double Co2 = 0.157;
	static double resultado;

	public static void listamodelos() {

		System.out.println("===lista de modelos Peugeot===");
		System.out.println("1 - 206");
		System.out.println("2 - 207 casa");
		System.out.println("3 - 208");
		System.out.println("4-  308");
		System.out.println("5-  3008");
		

	}

	public static void escolhaopcao() {

		System.out.print("Escolha a op��o: ");
		Scanner entrada = new Scanner(System.in);
		opcao1 = sc.nextInt();

	}

	public static void lista() {
		System.out.println("===lista de modelos Peugeot===");
		System.out.println("1 - 206");
		System.out.println("2 - 207");
		System.out.println("3 - 208");
		System.out.println("4-  308");
		System.out.println("5-  3008");
		System.out.print("\nEscolha o modelo do carro: ");

	}

	public static void opcao1() {

		resultado = litrokmpeugeot[0] * Co2;

		System.out.println();
		System.out.println("A cada 9.4 rodados, o Peugeot 206 gasta " + litrokmpeugeot[0]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de g�s carb�nico na atmosfera.");

	}

	public static void opcao2() {

		resultado = litrokmpeugeot[1] * Co2;

		System.out.println();
		System.out.println("A cada 10.6km rodados, o Peugeot 207 gasta " + litrokmpeugeot[1]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de g�s carb�nico na atmosfera");

	}

	public static void opcao3() {
		resultado = litrokmpeugeot[2] * Co2;

		System.out.println();
		System.out.println("A cada 15.1km rodados, o Peugeot 208 gasta " + litrokmpeugeot[2]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}
	public static void opcao4() {
		resultado = litrokmpeugeot[3] * Co2;

		System.out.println();
		System.out.println("A cada 10.0km rodados, o Peugeot 308 " + litrokmpeugeot[3]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}
	public static void opcao5() {
		resultado = litrokmpeugeot[4] * Co2;

		System.out.println();
		System.out.println("A cada 9.2km rodados o Fiat Uno gasta " + litrokmpeugeot[4]);
		System.out.println("Jogando " + new DecimalFormat(".##").format(resultado) + "kg de carbono na atmosfera");

	}
	

}
