package com.island.timus.hhundrend;

import java.util.Scanner;

public class T1785_Lost_In_Localization {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int number = in.nextInt();
			if (number >= 1 && number <= 4) {
				System.out.println("few");
			}else if(number >=5 && number <=9){
				System.out.println("several");
			}else if(number >=10 && number <=19){
				System.out.println("pack");
			}else if(number >=20 && number <=49){
				System.out.println("lots");
			}else if(number >=50 && number <=99){
				System.out.println("horde");
			}else if(number >=100 && number <=249){
				System.out.println("throng");
			}else if(number >=250 && number <=499){
				System.out.println("swarm");
			}else if(number >=500 && number <=999){
				System.out.println("zounds");
			}else if(number >=1000){
				System.out.println("legion");
			}

		}

	}
}
