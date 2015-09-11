package com.island.timus.khundrend;

import java.util.Scanner;

public class T2020_Traffic_Jam_in_Flower_Town {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String south = in.nextLine();
		String north = in.nextLine();
		int southLength = south.length();
		int northLength = north.length();
		int southPosition = 0;
		int northPosition = 0;
		int time = 0;
		while (southPosition < southLength && northPosition < northLength) {
			char southChar = south.charAt(southPosition);
			char northChar = north.charAt(northPosition);
			if (southChar == 'R' && (northChar == 'F' || northChar == 'R')) {
				time++;
				southPosition++;
				northPosition++;
			}
			if (southChar == 'R' && northChar == 'L') {
				time++;
				southPosition++;
			}
			if (southChar == 'F' && (northChar == 'F' || northChar == 'R')) {
				time++;
				southPosition++;
				northPosition++;
			}
			if (southChar == 'F' && northChar == 'L') {
				time++;
				southPosition++;
			}
			if (southChar == 'L' && northChar == 'L') {
				time++;
				southPosition++;
				northPosition++;
			}
			if (southChar == 'L' && (northChar == 'F' || northChar == 'R')) {
				time++;
				northPosition++;
			}
		}
		while (southPosition < southLength) {
			time++;
			southPosition++;
		}
		while (northPosition < northLength) {
			time++;
			northPosition++;
		}
		System.out.println(time);
	}
}
