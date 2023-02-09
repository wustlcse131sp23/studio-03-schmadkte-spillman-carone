package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input Number Range:");
		int n = in.nextInt();
		boolean[]IsPrime = new boolean [n];
		for (int i=0; i<IsPrime.length; i++) {
			IsPrime[i] = true;
		}
		int[]number = new int[n];
		for (int i=0; i<number.length; i++) {
			number[i] = i;
		}
		for (int i=2; i<Math.sqrt(number.length); i++) {
			for (int j=0; j<(number.length); j++) {
				if ((i*i)+(j*i)<number.length){
				IsPrime[((i*i)+(j*i))]= false;
				}	
		}
		}
		for (int i=2; i<IsPrime.length;i++){
			if (IsPrime[i] == true) {
				System.out.println(i+ " Is Prime!!");
			}
		}
				
	}
	

}
