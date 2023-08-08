import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerO {
	final String name;
	int lin, col;
		
	public PlayerO() {
		@SuppressWarnings("resource")
		Scanner tc = new Scanner(System.in);
			System.out.print("Jogador O escreva seu name: ");
			this.name = tc.nextLine();
	}
	
	public void Alg() {
		@SuppressWarnings("resource")
		Scanner tc = new Scanner(System.in);
		
		char array[][] = FrameHash.getMold();
		
		try{
			System.out.print(name+" digite qual linha voce pretende colocar a 'O': ");
			lin = tc.nextInt();
			System.out.print(name+" digite qual coluna voce pretende colocar a 'O': ");
			col = tc.nextInt();
			if ((FrameHash.getMold()[lin-1][col-1] != 'X') && (FrameHash.getMold()[lin-1][col-1]!='O')) {
				array[lin-1][col-1] = 'O';
				FrameHash.setMold(array);
			}else {
				System.out.println("Voce esta tentando preencher um espaço ocupado. Tente de novo!");
				this.Alg();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Valor Invalido. Tente de novo!");
			this.Alg();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Voce esta tentando preencher um espaco inexistente. Tente de novo!");
			this.Alg();
		}
		
	}
}
