package com.lams1989.dynamicarray;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		int x = 0;
		int y = 0;
		int querytype = 0;
		List<Integer> resultList = new ArrayList<Integer>();

		List<List<Integer>> lista = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			lista.add(new ArrayList<Integer>());
		}
		int lastAnswer = 0;
		for (int i = 0; i < queries.size(); i++) {
			querytype = queries.get(i).get(0);
			x = queries.get(i).get(1);
			y = queries.get(i).get(2);
			int seq = ((x ^ lastAnswer) % 2);

			if (querytype == 1) {
				lista.get(seq).add(y);

			} else {
				int index = y % n;
				lastAnswer = lista.get(seq).get(index);
				resultList.add(lastAnswer);
			}

		}

		return resultList;

	}
}
