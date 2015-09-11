package com.island.timus.khundrend;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class T2033_Devices {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, CountPrice> map = new HashMap<String, CountPrice>();
		for (int i = 0; i < 6; i++) {
			String name = in.nextLine();
			String key = in.nextLine();
			int price = Integer.parseInt(in.nextLine());
			if (map.containsKey(key)) {
				if (map.get(key).getPrice() > price) {
					map.get(key).setCount(map.get(key).getCount() + 1);
					map.get(key).setPrice(price);
				} else {
					map.get(key).setCount(map.get(key).getCount() + 1);
				}
			} else {
				CountPrice countPrice = new CountPrice();
				countPrice.setCount(1);
				countPrice.setPrice(price);
				map.put(key, countPrice);
			}
		}
		String mobile = "";
		int maxNum = 0;
		int minPrice = Integer.MAX_VALUE;
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			CountPrice val = (CountPrice) entry.getValue();
			if (val.getCount() > maxNum) {
				mobile = key;
				maxNum = val.getCount();
				minPrice = val.getPrice();
			} else if (val.getCount() == maxNum) {
				if (val.getPrice() < minPrice) {
					mobile = key;
					maxNum = val.getCount();
					minPrice = val.getPrice();
				}
			}
		}
		System.out.println(mobile);
	}
}

class CountPrice {
	private int count;
	private int price;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
