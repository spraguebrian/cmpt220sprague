
public class ArrayInsert {

	public static void main(String[] args) {
		int[] numbers = new int[102];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*100 + 1);
		}
		numbers[101] = -1;
		firstMethod(numbers);
		System.out.println("");
		secondMethod(numbers);
	}
	
	public static int[] firstMethod(int[] a) {
		for(int i = 0; i < 10; i++) {
			a[i] = a[i];
		}
		System.out.print("The array consists of: " );
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		return a;
	}
	
	public static int[] secondMethod(int[] b) {
		b[2] = b[9];
		b[6] = b[99];
		System.out.print("The array consists of: " );
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
		return b;
	}

}
