public class temp {
    public static void main(String[] args) {
        Double nums1 = Double.valueOf("498828660196");
        Double nums2 = Double.valueOf("840477629533");
        String ans = Double.toString(nums1*nums2);
        StringBuffer str = new StringBuffer(ans);
        str.delete(str.length()-2, str.length());
        ans = str.toString();
        System.out.println(ans);
    }
}
