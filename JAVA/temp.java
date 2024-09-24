public class temp {
    public static int reverse(int x) {
        boolean s = true;
        long n = 0;
        if(x < 0){
            x *= -1;
            s = false;
        }
        
        while(x > 0){
            int temp = x % 10;
            if(n*10 > 2147483647){
                return 0;
            }
            n *= 10;
            n += temp;
            x /= 10;
        }


        if(s == false){
            n *= -1;
        }

        return (int)n;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        // if(reverse(reverse(-2147483412)) == -2147483412){
        //     System.out.println("Done");
        // }
    }
}
