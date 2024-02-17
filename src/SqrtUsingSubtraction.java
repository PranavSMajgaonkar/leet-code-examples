public class SqrtUsingSubtraction {
    public static void main(String[] args) {
        int sqrtNumber = 144, count = 0;
        int i = sqrtNumber>100?1:2;
        while (sqrtNumber>=0){
            if (isPrime(i)){
                sqrtNumber = sqrtNumber - i;
                count++;
            }
            i++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        //Run a loop from 2 to n-1
        for(int i=2; i<n; i++){
            // if the number is divisible by i, then n is not a prime number.
            if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
    }
}
