package com.island.timus.ihundrend;

import java.util.Scanner;

public class T1877_Bicycle_Code {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a%2==0||(a%2!=0&&b%2==1)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
