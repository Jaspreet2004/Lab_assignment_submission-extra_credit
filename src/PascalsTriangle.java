import java.math.BigInteger;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().run());
    }
    public String run() {
        BigInteger modulus = BigInteger.TEN.pow(10);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++)
            sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modulus));
        return sum.mod(modulus).toString();
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(n^2)