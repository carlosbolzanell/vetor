package vetor;
import java.util.Scanner;
import java.util.Random;

public class ex2 {

	public static void main(String[] args) {
		
		double maior=-999, segundoMaior= -999, terceiroMaior= -999;
		int cdg1=0, cdg2=0, cdg3=0;
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] artigos = new int[10];
		int[] codigo = new int[10];
		
		
		for(int i=0; i<10; i++) {
			codigo[i] = i+1;
			artigos[i] = rd.nextInt(100)+1;
			
			
				if (artigos[i] > maior) {
			        terceiroMaior = segundoMaior;
			        cdg3 = codigo[i];
			        segundoMaior = maior;
			        cdg2 = codigo[i];
			        maior = artigos[i];
			        cdg1 = codigo[i];
			        
			    } else if (artigos[i] > segundoMaior) {
			        terceiroMaior = segundoMaior;
			        cdg3 = codigo[i];
			        segundoMaior = artigos[i];
			        cdg2 = codigo[i];
			        
			    } else if (artigos[i] > terceiroMaior) {
			        terceiroMaior = artigos[i];
			        cdg3 = codigo[i];
			    }
			System.out.println(artigos[i]);
				
		}
		System.out.println("O mais caro custa R$"+maior+" com o código "+cdg1);
		System.out.println("O segundo mais caro custa R$"+segundoMaior+" com o código "+cdg2);
		System.out.println("O terceiro mais caro custa R$"+terceiroMaior+" com o código "+cdg3);
		
		sc.close();
	}

}
