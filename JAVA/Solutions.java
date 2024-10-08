public class Solutions {
    public static int minLength(String s) {
        StringBuffer str = new StringBuffer(s);
        // boolean status1 = true;
        // boolean status2 = true;

        for (int j = 0; j < str.length(); j++) {
            // for AB
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'A' && str.charAt(i + 1) == 'B') {
                    str.deleteCharAt(i + 1);
                    str.deleteCharAt(i);
                }
            }

            // for CD
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'C' && str.charAt(i + 1) == 'D') {
                    str.deleteCharAt(i + 1);
                    str.deleteCharAt(i);
                }
            }
        }

        return str.length();
    }

    public static void main(String args[]) {
        System.out.println(minLength("ABFCACDB"));// 2
        System.out.println(minLength("ACBBD"));// 5
    }
}
