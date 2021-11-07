//Compute the sum of the prime numbers till 100

public class SumPrimeNumbers {
    public static void main(String[] args) {
        int sum=0;
        int limit=100;
        int nr=0;
        while(limit > 0){
            nr++;
            if(is_Prime(nr)){
                sum=sum+nr;
            }
            limit--;
        }
    }
    public static boolean is_Prime(int nr) {
        for (int indexI = 3; indexI * indexI <= nr; indexI+= 2) {
            if (nr % indexI == 0) {
                return false;
            }
        }
        return true;
    }
}
