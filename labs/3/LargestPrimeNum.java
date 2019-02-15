
public class LargestPrimeNum {

	public static void main(String[] args) {
		int n = 14999;
		boolean prime = true;
		while(n>0) {
			for(int i = 2; i< n/2; i++) {
				if(n % i == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println("The greatest prime number less than 15,000 is "+n);
				break;
			}
			n--;
			prime = true;
		}
		
		
	}

}
