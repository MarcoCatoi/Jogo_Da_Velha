
public class FrameHash {
	
	private static char array[][] = new char [3][3];
	public FrameHash() {
				
	}
	
	public static void CleanArray(){
		for (int y = 0; y < 3; y++ ) {
			for (int z = 0; z < 3; z++) {
				array[y][z] = ' ';
			}
		}
	}
	public static void PrintFrame() {
		System.out.println("   1   2   3");
		System.out.println("1 _"+array[0][0]+"_|_"+array[0][1]+"_|_"+array[0][2]+"_");
		System.out.println("2 _"+array[1][0]+"_|_"+array[1][1]+"_|_"+array[1][2]+"_");
		System.out.println("3  "+array[2][0]+" | "+array[2][1]+" | "+array[2][2]+" ");
		System.out.println("");
		
	}
	
	public static void setMold(char[][] array) {
		FrameHash.array = array;
	}

	static char[][] getMold() {
		return array;
	}

}
