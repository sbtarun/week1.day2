package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 1) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
	}
}
