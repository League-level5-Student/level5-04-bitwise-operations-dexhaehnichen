package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void printByteBinary(byte b) {
		//bytes can only hold 8 bits. 
		String result = "";
		byte input = b;
		
//		while(input != 0) {
//			result += (input & 1);
//			input = (byte) (input >> 1);
//		}
		
		int position = 1;
		
		while(position <= 8) {
			result += (input & position);
			position = position * 2;
		}
		
		System.out.println(result);
	}
	
	public void printShortBinary(short s) {
		//max 16
	}
	
	public void printIntBinary(int i) {
		// max 32
	}
	
	public void printLongBinary(long l) {
		// max 64
	}
	
	public static void main(String[] args) {
		printByteBinary((byte) 16);
	}
}
