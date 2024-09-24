public class temp {
    public static int reverse(int x) {
        if(2147483647 < (x*10) || -2147483648 > (x*10)){
            return 0;
        }

        boolean s = true;
        int n = 0;
        if(x < 0){
            x *= -1;
            s = false;
        }
        System.out.println("x is "+x);
        while(x > 0){
            int temp = x % 10;
            System.out.println("temp is "+ temp);
            n *= 10;
            n += temp;
            System.out.println("n is "+ n);
            x /= 10;
        }

        if(s == false){
            n *= -1;
        }

        return n;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
