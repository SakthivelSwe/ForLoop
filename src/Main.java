public class Main {
    public static void main(String[] args) {

        int count = 0;
        for(int i=10;i<50;i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("lopping "+i+" is prime number");
                if(count == 3) {
                    System.out.println("Exiting Looping");
                    break;
                }

            }
        }
    }
    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }else {
            for(int i=2;i<=(long) Math.sqrt(n);i++) { // i<=n/i is also currect method
                if(n % i == 0){
                    System.out.println("looping "+i);
                    return false;
                }
            }
            return true;
        }
    }
}
