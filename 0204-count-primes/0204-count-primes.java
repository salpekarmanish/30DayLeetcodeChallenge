class Solution {

    public int countPrimes(int n) {

        if(n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        // Assume all are prime
        for(int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve
        for(int i = 2; i * i < n; i++) {

            if(isPrime[i]) {

                // Mark multiples as non-prime
                for(int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        // Count primes
        for(int i = 2; i < n; i++) {

            if(isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}