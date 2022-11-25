package structure;

/**
 * 소수
 */
public class PrimeNumber {

    public static boolean primeNumber(int num){
        if(num < 2) return false;
        else if(num == 2) return true;
        else {
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i == 0) return false;
            }
            return true;
        }
    }
}
