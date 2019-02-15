
public class PrintASCII {
	
	public static void main(String[] args) {
		int count = 0;
		for(int i = 50; i < 101; i++) {
			System.out.print((char)i + " ");
			count++;
			if(count == 20) {
				System.out.println("");
				count = 0;
			}
		}
	}

}
