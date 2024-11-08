package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class getAmazon {
    public static long numAmazon(long n){
        Set<Long> uniqueDays = new HashSet<>();

        // Iterate over possible values of k
        for (long k = 1; k <= n; k++) {
            long dependentDay = n / k; // This is equivalent to floor(n / k)

            // Stop if dependentDay is 0, as further k values will also result in 0
            if (dependentDay == 0) {
                break;
            }

            // Add the result to the set to keep only unique values
            uniqueDays.add(dependentDay);
        }

        // Sum all unique dependent days
        long sum = 0;
        for (long day : uniqueDays) {
            sum += day;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n=13;
        System.out.println(numAmazon(n));

    }
    
}