class Solution {
    public int countPrimes(int n) {

        if (n <= 1) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isComposite[i]) {
                continue;
            }

            for (int j = i * i; j < n; j = j + i) {
                isComposite[j] = true;
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count = count + 1;
            }
        }

        return count;
    }
}