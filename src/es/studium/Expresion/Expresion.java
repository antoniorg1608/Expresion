package es.studium.Expresion;

import java.util.Scanner;

public class Expresion
{

	public static void main(String[] args)
	{
		int a, b, c;
		double r;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero equivalente a a:");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo numero equivalente a b:");
		b = teclado.nextInt();
		System.out.println("Introduce el tercer numero equivalente a c:");
		c = teclado.nextInt();
		teclado.close();
		r = expresion(a, b, c);
		System.out.println("El resultado de aplicar la expresion los numeros dados es: " + r);
	}

	public static double expresion(int a, int b, int c)
	{
		double resultado;
		resultado = (double) ((b * b) - (4 * a * c)) / (double) (2 * a);
		return resultado;
	}

}
