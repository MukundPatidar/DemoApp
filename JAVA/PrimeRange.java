public class PrimeRange {
    static int count = 0;
    public static void main(String[] args) {
        for(int i = 2; i <= 1000; i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
    }
    
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0) return false;
        }
        count++;
        if(count % 20 == 0)System.out.println();
        return true;
    }
}