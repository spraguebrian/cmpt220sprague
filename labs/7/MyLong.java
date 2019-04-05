
public class MyLong {
	long value;
	MyLong(long value){
		this.value = value;
	}
	long getValue() {
		return value;
	}
	boolean isEven() {
		if(value%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isOdd() {
		if(value%2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isPrime() {
		for(long i = value-1; i > 0; i--) {
			if(value%i==0) {
				return false;
			}
		}
		return true;
	}
	static boolean isEven(MyLong value) {
		if(value.getValue()%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isOdd(MyLong value) {
		if(value.getValue()%2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isPrime(MyLong value) {
		for(long i = value.getValue()-1; i > 0; i--) {
			if(value.getValue()%i==0) {
				return false;
			}
		}
		return true;
	}
	boolean equals(long value) {
		return this.value == value;
	}
	boolean equals(MyLong value) {
		return this.value == value.getValue();
	}
	/*long parseLong(char[] array) {
		
	}
	long parseString(String s) {
		
	}*/

}
