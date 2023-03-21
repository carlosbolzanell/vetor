package vetor;
import java.util.Scanner;
import java.util.Random;

public class vetor2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numero;
		
		int[] valores = new int[10];
		
		for(int i=0; i<valores.length ; i++) {
			valores[i] = random.nextInt(20);
			System.out.println(valores[i]);
			
		}
		System.out.println("Escreva um número para procurar na lista");
		numero = sc.nextInt();
		
		for(int i=0; i<valores.length; i++) {
		if(valores[i]==numero) {
			System.out.println("O número está na lista na posição: "+i);
		}else if (i== valores.length-1){
			System.out.println("O número não está na lista");
		}
		
		}
		
	}

}
