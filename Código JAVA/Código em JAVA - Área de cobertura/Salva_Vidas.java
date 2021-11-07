import java.util.Scanner;
import java.lang.Math. *;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        double area, raio;
  
		System.out.print("Informe a área para o cálculo.: ");
		
		raio = teclado.nextDouble();
		area = Math.PI*Math.pow(raio,2);
		
		System.out.printf("O valor da area é %,.2f \n", area);
		
		if ((area > 0) && (area <= Math.pow(1000,2))){
		    System.out.println("Para a área de cobertura 1 salva-vidas");
		    
		}else if ((area >= Math.pow(1001,2)) && (area <= Math.pow(10000,2))){
		    System.out.println("Para a área de cobertura 2 salva-vidas");
		    
		}else if ((area >= Math.pow(10001,2)) && (area <= Math.pow(100000,2))){
		    System.out.println("Para a área de cobertura 3 salva-vidas");
		    
		}else if (area > Math.pow(100001,2)){
		    System.out.println("Para a área de cobertura 4 salva-vidas");
		    
		}
	}
}