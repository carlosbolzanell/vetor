package vetor;
import java.util.Scanner;

public class vetores1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		double[] numeros = new double[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o numero "+(i+1));
			numeros[i] = sc.nextDouble();
		}
		for (int i=9; i>=0; i--) {
			System.out.println("A sequencia invertida é: " +numeros[i]);
		}
	}

}
