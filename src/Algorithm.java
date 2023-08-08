
public class Algorithm {
	static boolean win = false, hash = false;
	
	public Algorithm() {
		PlayerX x = new PlayerX();
		PlayerO o = new PlayerO();
				
		FrameHash.CleanArray();
		FrameHash.PrintFrame();
		
		while(win == false && hash == false) {
			x.Alg();
			FrameHash.PrintFrame();
			Test.RunTest();
			if(win==true || hash==true) {
				break;
			}
			
			o.Alg();
			FrameHash.PrintFrame();
			Test.RunTest();
			if(win==true || hash==true) {
				break;
			}
		}		
	}
	public static void setWin(boolean win) {
		Algorithm.win = win;
	}
	public static void setHash(boolean hash) {
		Algorithm.hash = hash;
	}
	
	

}
