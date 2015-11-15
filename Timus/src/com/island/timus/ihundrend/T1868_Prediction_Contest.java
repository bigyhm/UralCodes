package com.island.timus.ihundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class T1868_Prediction_Contest {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		Map<String, String> rewardList = new HashMap<String, String>();

		for (int i = 0; i < 4; i++) {
			String universityName = reader.readLine();
			rewardList.put(universityName.trim(), "gold");
		}

		for (int i = 0; i < 4; i++) {
			String universityName = reader.readLine();
			rewardList.put(universityName.trim(), "silver");
		}

		for (int i = 0; i < 4; i++) {
			String universityName = reader.readLine();
			rewardList.put(universityName.trim(), "bronze");
		}
		int max = 0;
		int total = 0;
		int setNum = Integer.parseInt(reader.readLine());
		int[] result = new int[setNum];
		for (int i = 0; i < setNum; i++) {
			int totalCount = Integer.parseInt(reader.readLine());

			for (int j = 0; j < totalCount; j++) {
				String universityReward = reader.readLine();
				String[] universityRewardArr = universityReward.split(":");
				String university = universityRewardArr[0].trim();
				String reward = universityRewardArr[1].trim();
				if (rewardList.get(university) != null && rewardList.get(university).equals(reward)) {
					result[i]++;
				}
			}
		}

		for (int i = 0; i < setNum; i++) {
			if (result[i] > max) {
				max = result[i];
				total = 1;
			} else if (result[i] == max) {
				if (max != 0) {
					total++;
				}
			} else {
				// Do nothing.
			}
		}

		if (total == 0) {
			writer.print(setNum * 5);
			writer.flush();
		} else {
			writer.print(total * 5);
			writer.flush();
		}
	}

}
