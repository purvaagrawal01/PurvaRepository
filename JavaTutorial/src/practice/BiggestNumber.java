package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BiggestNumber {
	/* Array */
	public static int getBiggestNumber(int a[]) {
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (max > a[i])
				max = max;
			else
				max = a[i];

		}

		return max;
	}

	/* ArrayList */
	public static int getBiggestNumber(ArrayList<Integer> a) {
		int max = a.get(0);

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (max > (Integer) obj)
				max = max;
			else
				max = (Integer) obj;

		}

		return max;
	}

	/* Hashmap */
	public static int getBiggestNumber(HashSet<Integer> a) {
		int max = 0;
		Iterator it = a.iterator();
		if (it.hasNext())
			max = (Integer) it.next();
		while (it.hasNext()) {
			Object obj = it.next();
			if (max > (Integer) obj)
				max = max;
			else
				max = (Integer) obj;
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(46);
		a.add(5);
		a.add(9);
		System.out.println("Biggest no in ArrayList: " + getBiggestNumber(a));

		int[] n = { 1, 28, 3, 4 };
		System.out.println("Biggest no in Array: " + getBiggestNumber(n));

		HashSet<Integer> h = new HashSet<Integer>();
		h.add(56);
		h.add(697);
		h.add(5969);
		h.add(123);
		h.add(789);
		
		System.out.println("Biggest no in Hashmap: " + getBiggestNumber(h));
	}

}
