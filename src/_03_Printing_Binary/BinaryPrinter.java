package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Use bit shifting and bit masking to print the binary numbers.
	// Do not use the Integer.toBinaryString method!
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public static void printByteBinary(byte b) {
		// bytes can only hold 8 bits.
		String result = "";
		byte input = b;

		for (int i = 0; i < 8; i++) {
			if(i % 4 == 0 && i > 1) {
				result = "-" + result;
			}
			result = (input & 1) + result;
			input = (byte) (input >> 1);
		}

		System.out.println(result);
	}

	public static void printShortBinary(short s) {
		// max 16
		String result = "";
		short input = s;

		for (int i = 0; i < 16; i++) {
			if(i % 4 == 0 && i > 1) {
				result = "-" + result;
			}
			result = (input & 1) + result;
			input = (short) (input >> 1);
		}
		System.out.println(result);
	}

	public static void printIntBinary(int i) {
		// max 32
		String result = "";
		int input = i;

		for (int j = 0; j < 32; j++) {
			if(j % 4 == 0 && j > 1) {
				result = "-" + result;
			}
			result = (input & 1) + result;
			input = (int) (input >> 1);
		}
		System.out.println(result);
	}

	public static void printLongBinary(long l) {
		// max 64
		String result = "";
		long input = l;

		for (int i = 0; i < 64; i++) {
			if(i % 4 == 0 && i > 1) {
				result = "-" + result;
			}
			result = (input & 1) + result;
			input = (long) (input >> 1);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		printByteBinary((byte) 225);
		printShortBinary((short) 64535);
		printIntBinary(2147383647);
		printLongBinary((long) Long.MAX_VALUE);
	}
}
