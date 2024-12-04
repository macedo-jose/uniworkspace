package lu.uni.programming1;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int i = 10;
        int j = i;
        int k = i;
        
        int a, b, c;

        a = i + 1;
        System.out.println("a = " + a + "   i = " + i + " (no increment)");
        
        b = ++j;
        System.out.println("b = " + b + "   j = " + j + " (pre-increment)");
        
        c = k++;
        System.out.println("c = " + c + "   k = " + k + " (post-increment)");
    }
}
