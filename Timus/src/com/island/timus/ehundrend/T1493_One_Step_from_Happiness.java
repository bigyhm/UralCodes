package com.island.timus.ehundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1493_One_Step_from_Happiness {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		String value = reader.readLine();
		int va = Integer.parseInt(value);
		int pr = va + 1;
		int ne = va - 1;
		int flag = 1;

		value = pr + "";
		if (value.length() <= 3) {
			flag = 0;
		} else {
			String firstPart = value.substring(value.length() - 3, value.length());
			String secondPart = value.substring(0, value.length() - 3);
			int first = 0;
			int second = 0;
			for (int i = 0; i < 3; i++) {
				first = first + Integer.parseInt(firstPart.substring(i, i + 1));
			}

			for (int i = 0; i < secondPart.length(); i++) {
				second = second + Integer.parseInt(secondPart.substring(i, i + 1));
			}

			if (first == second) {
				flag = 1;
			} else {
				flag = 0;
			}
			if (flag == 1) {
				System.out.println("Yes");
				return;
			}
		}

		value = ne + "";
		if (value.length() <= 3) {
			flag = 0;
		} else {
			String firstPart = value.substring(value.length() - 3, value.length());
			String secondPart = value.substring(0, value.length() - 3);
			int first = 0;
			int second = 0;
			for (int i = 0; i < 3; i++) {
				first = first + Integer.parseInt(firstPart.substring(i, i + 1));
			}

			for (int i = 0; i < secondPart.length(); i++) {
				second = second + Integer.parseInt(secondPart.substring(i, i + 1));
			}

			if (first == second) {
				flag = 1;
			} else {
				flag = 0;
			}
		}

		if (flag == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
