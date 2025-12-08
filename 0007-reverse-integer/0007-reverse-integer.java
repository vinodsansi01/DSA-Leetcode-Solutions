class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        int reverse = 0;

        while (x > 0) {
            int ld = x % 10;

            // Check overflow before multiplication
            if (reverse > (Integer.MAX_VALUE - ld) / 10) {
                return 0; // overflow
            }

            reverse = reverse * 10 + ld;
            x /= 10;
        }

        return reverse * sign;
    }
}
