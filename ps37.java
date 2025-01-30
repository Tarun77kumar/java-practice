public class ps37 {

    public static boolean isPerfectSquare(long x)
    {
        if (x >= 0) {
            Double sr = Math.sqrt(x);
            return (sr * sr == x);
        }
        return false;
    }

    public static void main(String[] args)
    {
        long x = 50;
        if (isPerfectSquare(x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

