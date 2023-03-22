package vetor;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double maiorTemp=0, menorTemp=999;
		String maiorMes="", menorMes="";
		
		double[] temperatura = new double[12];
		String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};		
		
		
		for(int i=0; i<12; i++) {
			System.out.println("Digite a temperatura do mês "+(i+1));
			temperatura[i] = sc.nextDouble();
			
			if(temperatura[i]>maiorTemp) {
				
				maiorTemp = temperatura[i];
				
				maiorMes = meses[i];
				
			}
			if(temperatura[i]<menorTemp) {
				menorTemp = temperatura[i];
				menorMes = meses[i];
				
			}
		}
		System.out.println("A maior temperatura é "+maiorTemp+" do mês de "+maiorMes);
		System.out.println("A menor temperatura é "+menorTemp+" do mês de "+menorMes);
		
		sc.close();
	}

}
