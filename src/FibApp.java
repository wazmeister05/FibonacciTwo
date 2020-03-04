public class FibApp {

    public static int fibRecursive(int n){
        if(n <= 1){
            return n;
        }
        return fibRecursive(n-1) + fibRecursive(n-2);
    }

    public static int fibDynamic(int n){
        int f[] = new int[n+2];     //store values already computed
        int i;

        f[0] = 0;
        f[1] = 1;

        for(i = 2; i <= n; i++){        //starting from 2 because we have 1 and 0 already
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {


        long start = System.nanoTime();

        System.out.println("DYNAMIC");
        System.out.println(fibDynamic(50));
        System.out.println("Time taken: " + (System.nanoTime() - start));
        System.out.println("----------------------");

        start = System.nanoTime();
        System.out.println("Recursive");
        System.out.println(fibRecursive(50));
        System.out.println("Time taken: " + (System.nanoTime() - start));

        //Dynamic is significantly faster.
    }

}
