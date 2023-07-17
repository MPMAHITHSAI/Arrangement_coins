package Coinarrangement;

import java.util.Scanner;

class Solution {
	 
    public  static int arrangeCoins(int n) {
    	
        int i = 0; 
		while(n >= i+1){ 
			
			n = n-(i+1); 
			i++; 
		}
		return i; 
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int value=arrangeCoins(n);
		System.out.println(value);
    	
    }
}
