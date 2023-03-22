package vetor;
import java.util.Scanner;
import java.util.Random;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] x = new int[15];
				
		
		
		for(int i=0; i<x.length; i++) {
			x[i] = rd.nextInt(100);
				
			if(x[i]<0) {
				x[i]=0;
				
			
			}
			System.out.println(x[i]);
			
		}
		sc.close();

	}

}
