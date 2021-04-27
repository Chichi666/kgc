package com.kgc.morning;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		String[] scores = { "b", "d", "a", "fa", "ezasd", "³Ô", "°¡" };
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		int bs = Arrays.binarySearch(scores, "a");
		System.out.println(bs);
	}

}
