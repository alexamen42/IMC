package com.alexamen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/**
		 * Programa que calcula el IMC con la altura y peso que introduce el usuario.
		 * Ademas indica si tiene sobrepeso, obesidad...etc
		 * 
		 * @author AlexEsteban
		 * @version 2.0
		 * @since 2021-April-05
		 */

		// 1)Pedimos al usuario su altura en metros y despues su altura
		System.out.println("### Calculadora IMC ###");
		System.out.println("Por favor introduzca su altura en metros");
		System.out.println("(Por ejemplo: 1,80)");
		System.out.print("\nAltura--> ");
		// Usando "\n" dentro de syso me sirve como Enter sin crear otro syso más

		Scanner scan1 = new Scanner(System.in);
		double altura = scan1.nextDouble();

		System.out.println("\nPor favor introduzca su peso en Kgs");
		System.out.print("Peso--> ");
		Scanner scan2 = new Scanner(System.in);
		double peso = scan2.nextDouble();

		/*
		 * 2) Calculamos el IMC teniendo en cuenta la fórmula IMC = Peso/ (Altura al
		 * cuadrado) Lo 1º calculamos el cuadrado con el método Math.pow(), aunque
		 * podría hacerse simplemente multiplicando por si mismo.
		 */

		altura = Math.pow(altura, 2);
		double imc = 0.0;
		imc = peso / altura;

		/*
		 * 3) Con el método DecimalFormat() reduzco a 1 los decimales que tenga imc. Así
		 * no tendré problemas después en los múltiples if de cada peso.
		 */
		DecimalFormat imc_ = new DecimalFormat("###.#");

		System.out.println("\n///////////////////");
		System.out.println("Su IMC es: " + imc_.format(imc));
		System.out.println("///////////////////");

		/*
		 * 4) Condicionales if y else if para todos los IMC posibles, indicando con un
		 * texto a que equivale cada IMC
		 */

		if (imc < 18.5) {
			System.out.println("Peso insuficiente"); // IMC <18,5

		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso ideal"); // IMC {18,5-24,9}

		} else if (imc >= 25 && imc <= 26.9) {
			System.out.println("Sobrepeso grado 1"); // IMC {25-26,9}

		} else if (imc >= 27 && imc <= 29.9) {
			System.out.println("Sobrepeso grado 2"); // IMC {27-29,9}

		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidad de tipo 1"); // IMC {30-34,9}

		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidad de tipo 2"); // IMC {35-39,9}

		} else if (imc >= 40 && imc <= 49.9) {
			System.out.println("Obesidad de tipo 3"); // IMC {40-49,9}

		} else if (imc >= 50) {
			System.out.println("Obesidad de tipo 4"); // IMC >50
		}

		/*
		 * 5) Recomenda litros de agua en base al peso: Multiplico por 35 el peso y
		 * obtengo los mililitros. Divido entre 1000 para obtener los litros. Si tiene
		 * decimales se redondean con Math.round() y ajusta nº de vasos.
		 */

//			double litros;
//			litros = peso * 35;
//			litros = litros / 1000;

		// peso= (peso*35)/1000; Podría haberlo usado esto para ahorrar una línea.

		int contador;
		contador = 0;
		if (imc < 18.5) {

			while (imc != 18.5) {
				System.out.println(peso);
				System.out.println(contador);
				imc = peso / altura;
				peso = peso + 1;
				contador = contador + 1;
			}
			System.out.println(contador);
			System.out.println("imc ideal" + imc);
		}
//			System.out.println("Deberias pesar ");

//			System.out.println("\nDebería beber " + Math.round(litros) + " litros de agua al día");
//			litros = litros * 4;
//			int vasos = (int) litros;
		/*
		 * Uso un parse para convertir el double a int, y así evitar decimales en la
		 * cantidad de vasos Debe haber algun problema por los decimales que tenía...
		 */

//			System.out.println("Es decir, " + vasos + " vasos");

//			try {
//				/*
//				 * 5) He añadido más info que aparezca poco despues "rodeandolos" con surround
//				 * Try catch, que está temporizado a 4 segundos con Thread.sLeep.
//				 */
		//
//				System.out.println("\n\n< En 4 segundos +Info >");
//				Thread.sleep(4 * 1000);
		//
//				System.out.println("---------------------------------------------------------------------------------------------------------");
//				System.out.println("\nLa info está extraida de:");
		//
//				System.out.println("\ta) https://www.seedo.es/index.php/pacientes/calculo-imc");
//				System.out.println(
//						"\tb) https://aprende.com/blog/bienestar/nutricion/aprende-como-calcular-tu-ingesta-diaria-de-agua/");
//				System.out.println("\tc) https://brainly.lat/tarea/5340256");
//				System.out.println("\t* es.stackoverflow.com && https://guru99.es/java-tutorial/...etc");
		//
//			} catch (Exception e) {
//				System.out.println(e);
//			}
	}
}
