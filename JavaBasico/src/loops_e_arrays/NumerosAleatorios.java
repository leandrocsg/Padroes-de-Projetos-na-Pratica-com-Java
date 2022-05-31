package loops_e_arrays;

import java.util.Random;

/*
Fa�a um Programa que leia 20 n�meros inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os n�meros e seus sucessores.
*/

public class NumerosAleatorios {
	public static void main(String[] args) {
		
	
	Random random = new Random();
	
	int[] numerosAleatorios = new int[20];
		
	for(int i = 0; i < numerosAleatorios.length; i++) {
		int numero = random.nextInt(100);
		numerosAleatorios[i] = numero;
	}
	
	System.out.print("Numeros Aleatorios: ");
	for (int numero : numerosAleatorios) {
		System.out.print(numero + " ");
		
	}
	
	System.out.print("\nSucessores dos Numeros Aleatorios: ");
	for (int numero : numerosAleatorios) {
		System.out.print((numero+1) + " ");
		
	}
	
	}
}
