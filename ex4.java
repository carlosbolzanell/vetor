package vetor;
import java.util.Random;

public class ex4 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
			vetor1[i] = rd.nextInt(100);
			vetor2[j] = rd.nextInt(100);
			
			if(vetor1[i]==vetor2[j]) {
				System.out.println("possuem conteudos iguais!");
			}
			
			
		}
			
		}
		//opa
	}
}


