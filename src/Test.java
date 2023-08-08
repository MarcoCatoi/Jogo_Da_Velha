
public class Test {
	static boolean win = true;
	static boolean hash = true;
	
	public Test() {
		
	}
	public static void RunTest() {
		
		if (FrameHash.getMold()[0][0]=='X' && FrameHash.getMold()[1][0]=='X' && FrameHash.getMold()[2][0]=='X' ||
			FrameHash.getMold()[0][1]=='X' && FrameHash.getMold()[1][1]=='X' && FrameHash.getMold()[2][1]=='X' ||
			FrameHash.getMold()[0][2]=='X' && FrameHash.getMold()[1][2]=='X' && FrameHash.getMold()[2][2]=='X' ||
			FrameHash.getMold()[0][0]=='X' && FrameHash.getMold()[0][1]=='X' && FrameHash.getMold()[0][2]=='X' ||
			FrameHash.getMold()[1][0]=='X' && FrameHash.getMold()[1][1]=='X' && FrameHash.getMold()[1][2]=='X' ||
			FrameHash.getMold()[2][0]=='X' && FrameHash.getMold()[2][1]=='X' && FrameHash.getMold()[2][2]=='X' ||
			FrameHash.getMold()[0][0]=='X' && FrameHash.getMold()[1][1]=='X' && FrameHash.getMold()[2][2]=='X' ||
			FrameHash.getMold()[0][2]=='X' && FrameHash.getMold()[1][1]=='X' && FrameHash.getMold()[2][0]=='X') {	
				
				Algorithm.setWin(win);
				System.out.print("X Vence!");
		}
		
		else if(FrameHash.getMold()[0][0]=='O' && FrameHash.getMold()[1][0]=='O' && FrameHash.getMold()[2][0]=='O' ||
				FrameHash.getMold()[0][1]=='O' && FrameHash.getMold()[1][1]=='O' && FrameHash.getMold()[2][1]=='O' ||
				FrameHash.getMold()[0][2]=='O' && FrameHash.getMold()[1][2]=='O' && FrameHash.getMold()[2][2]=='O' ||
				FrameHash.getMold()[0][0]=='O' && FrameHash.getMold()[0][1]=='O' && FrameHash.getMold()[0][2]=='O' ||
				FrameHash.getMold()[1][0]=='O' && FrameHash.getMold()[1][1]=='O' && FrameHash.getMold()[1][2]=='O' ||
				FrameHash.getMold()[2][0]=='O' && FrameHash.getMold()[2][1]=='O' && FrameHash.getMold()[2][2]=='O' ||
				FrameHash.getMold()[0][0]=='O' && FrameHash.getMold()[1][1]=='O' && FrameHash.getMold()[2][2]=='O' ||
				FrameHash.getMold()[0][2]=='O' && FrameHash.getMold()[1][1]=='O' && FrameHash.getMold()[2][0]=='O') {	
					Algorithm.setWin(win);
					System.out.print("O Vence!");
			}
		else if(FrameHash.getMold()[0][0]!=' ' && FrameHash.getMold()[1][0]!=' ' && FrameHash.getMold()[2][0]!=' ' &&
				FrameHash.getMold()[0][1]!=' ' && FrameHash.getMold()[1][1]!=' ' && FrameHash.getMold()[2][1]!=' ' &&
				FrameHash.getMold()[0][2]!=' ' && FrameHash.getMold()[1][2]!=' ' && FrameHash.getMold()[2][2]!=' '){
			Algorithm.setHash(hash);
			System.out.print("Velha!");
		}
	}
}
