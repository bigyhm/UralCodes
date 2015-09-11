package com.island.timus.ehundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class T1446_Sorting_Hat {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int number = Integer.parseInt(reader.readLine());
		Map<Integer, String> Slytherin = new HashMap<Integer, String>();
		Map<Integer, String> Hufflepuff = new HashMap<Integer, String>();
		Map<Integer, String> Gryffindor = new HashMap<Integer, String>();
		Map<Integer, String> Ravenclaw = new HashMap<Integer, String>();

		for (int i = 0; i < number; i++) {
			String name = reader.readLine();
			String school = reader.readLine().trim();
			if ("Slytherin".equals(school)) {
				Slytherin.put(Slytherin.size(), name);
			} else if ("Hufflepuff".equals(school)) {
				Hufflepuff.put(Hufflepuff.size(), name);
			} else if ("Gryffindor".equals(school)) {
				Gryffindor.put(Gryffindor.size(), name);
			} else {
				Ravenclaw.put(Ravenclaw.size() , name);
			}
		}

		System.out.println("Slytherin:");
		for (int i = 0; i < Slytherin.size(); i++) {
			System.out.println(Slytherin.get(i));
		}
		System.out.println("");

		System.out.println("Hufflepuff:");
		for (int i = 0; i < Hufflepuff.size(); i++) {
			System.out.println(Hufflepuff.get(i));
		}
		System.out.println("");

		System.out.println("Gryffindor:");
		for (int i = 0; i < Gryffindor.size(); i++) {
			System.out.println(Gryffindor.get(i));
		}
		System.out.println("");

		System.out.println("Ravenclaw:");
		for (int i = 0; i < Ravenclaw.size(); i++) {
			System.out.println(Ravenclaw.get(i));
		}

	}
}
