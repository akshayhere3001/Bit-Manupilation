import java.util.*;

public class BitManupilation {
	public static void main(String[] args) {
		
		
		// Get Bit Operation
		int n = 5;
		int pos = 2;
		int bitMask = 1<<pos;
		
		if((bitMask & n) == 0) {
			System.out.println("Bit is 0");
		}else {
			System.out.println("Bit is 1");
		}
		
		
		// Set Bit Operation
		int n2 = 5;
		int pos2 = 1;
		int bitMask2 = 1<<pos2;
		
		int newNumber = bitMask2 | n2;
		System.out.println(newNumber);
		
		
		// Clear Bit Operation
		int n3 = 5;
		int pos3 = 2;
		int bitMask3 = 1<<pos3;
		
		// ~   ->   symbol performs the NOT operation
		int notBitMask = ~(bitMask3);
		
		int result = notBitMask & n3;
		System.out.println(result);
		
		
		
		// Update Bit Operation
		// Updating 1 to 0 -> Clear Bit Operation
		// Updating 0 to 1 -> Set Bit Operation
		
		
		
		// 1 to 0
		int n4 = 5;
		int pos4 = 2;
		int bitMask4 = 1<<pos4;
		
		int notBitMask4 = ~(bitMask4);
		
		int result4 = notBitMask4 & n4;
		System.out.println("clear bit Operation" + result4);
		
		
		// 0 to 1
		int result5 = bitMask4 | n4;
		System.out.println(result5);
		
	
		
				
		
		
	}
}
