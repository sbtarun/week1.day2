package week1.day2.assignments;

public class CharOccurence {

	public static void main(String[] args) {
		int count = 0;
		String str = "welcome to chennai";
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for (int i = 0; i < length; i++) {
			if (charArray[i] == 'n') {
				count = count + 1;
			}
		}
		System.out.println("Count is " + count);
	}

}
