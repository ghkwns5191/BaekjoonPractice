import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String input = br.readLine();
		String str = input.toUpperCase();
		char[] charArr = str.toCharArray();
		String[] strArr = new String[charArr.length];
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = String.valueOf(charArr[i]);
		}
		
		Set<String> set = new HashSet<String>(Arrays.asList(strArr));
		
		
		String[] strSetData = set.toArray(new String[0]);
		
		int[] intArr = new int[strSetData.length];
		for (int i = 0; i < strSetData.length; i++) {
			intArr[i] = 0;
			for (int j = 0; j < strArr.length; j++) {
				if(strSetData[i].equals(strArr[j])) {
					intArr[i]++;
				}
			}
			
		}
		
		int max = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if(max < intArr[i]) {
				max = intArr[i];
				
			}
			
		}
		
		int count2 = 0;
		int index = -1;
		for (int i = 0; i < intArr.length; i++) {
			if(intArr[i] == max) {
				index = i;
				count2++;
			}
		}
		
		if(count2 == 1) {
			System.out.println(strSetData[index]);
		} else if(count2 > 1) {
			System.out.println("?");
		}
		
	}
}