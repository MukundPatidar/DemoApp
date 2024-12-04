package LeetCode;

public class ExcelSheetColumnTitle {
	public static String convertToTitle(int columnNumber) {
		StringBuilder str = new StringBuilder();

		while (columnNumber > 0) {
			if (columnNumber <= 26) {
				str.append((char) (columnNumber + 64));
				break;
			}
			
			int temp;
			if (columnNumber%26 == 0) {
				temp = 26;
				columnNumber /= 26;
				columnNumber--;
			} else {
				temp = columnNumber % 26;
				columnNumber /= 26;
			}
			str.append((char) (temp + 64));
		}

		str.reverse();
		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(convertToTitle(1));
		System.out.println(convertToTitle(28));
		System.out.println(convertToTitle(701));
		System.out.println(convertToTitle(52));
	}
}
