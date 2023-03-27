import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] strSplit = str.split(" ");
		if (strSplit.length > 0) {

			if (strSplit[0].equals("") && !strSplit[strSplit.length - 1].equals("")) {
				System.out.println(strSplit.length - 1);
			} else if (!strSplit[0].equals("") && strSplit[strSplit.length - 1].equals("")) {
				System.out.println(strSplit.length - 1);
			} else if (strSplit[0].equals("") && strSplit[strSplit.length - 1].equals("")) {
				System.out.println(strSplit.length - 2);
			} else {
				System.out.println(strSplit.length);
			}
		} else {
			System.out.println(0);
		}
	}
}