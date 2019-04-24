
public class Problem3 {
	public int bin2Dec(String binaryString) {
		int number = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1')
				number += 2;
			else if(binaryString.charAt(i)!='0')
				throw new NumberFormatException();
			number *= 2;
		}
		number /= 2;
		return number;
	}
}
