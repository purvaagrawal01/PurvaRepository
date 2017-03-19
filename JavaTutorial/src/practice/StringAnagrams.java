package practice;

public class StringAnagrams {

	public static boolean isStringAnagrams(String a, String b) {
		boolean result = false;int count = 0;
		if (a == null || b == null) {
			System.out.println("Strings are null");
		}

		else {
			int al = a.length();
			int bl = b.length();
			
			int[] k = new int[bl];
			
			if (al == bl) {
				for (int i = 0; i <= al-1 ; i++) {
					for (int j = 0; j <= bl-1 ; j++) {
						if (k[j] != 1) {
							if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)) {
								k[j] = 1;
								int c = count++;
								//System.out.println(j);

							}
						}

					}

				}
				if (count == al)
					result = true;

			} else
				result = false;
		}
		
	
		System.out.printf("a is:%10s;b is:%10s;count is:%10d;result is %10s",a,b,count,result);
		System.out.println("");
	//System.out.println(a+", "+b+": "+count+" "+result);
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isStringAnagrams("Purva", "Aprvu");
		isStringAnagrams("Mary", "Army");
		isStringAnagrams("mary", "army");
		isStringAnagrams("maay", "army");
	}
}
