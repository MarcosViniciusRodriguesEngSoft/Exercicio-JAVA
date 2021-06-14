import java.util.*;
import java.io.IOException;

public class Main
{
    
	public static void main(String [] args) throws IOException
	    {
	    int senha [] = {0,4,0,6,3};
	    int senhaVET [] = new int[5];
	    int i;
	
		System.out.print("Para abrir o cofre digite o segredo na sequência correta\n");
		
		for (i = 0; i < 5; i++){
		    
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nDigite um número.: ");
	    senhaVET[i] = teclado.nextInt();
		
		if (senha[i] == senhaVET[i]){
		
		
		}else if (senha[i] != senhaVET[i]){
		
		System.out.print("\nSequência incorreta\n");
		System.out.print("\n<<<tente novamente>>>\n\n");
		System.out.println("Press Enter to continue…");
        System.in.read();
        System.out.println("Finished.");
		return;
	    }
	}
	System.out.printf("\nSenha digitada com sucesso.:: 04063\n");
	System.out.printf("\nTranca destravada pode abrir a porta do cofre");
    }
}
