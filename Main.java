public class Main {

    public static int multiply(int n, int m){
        int sum = 0;
        while(m != 0){
            int temp = sum;
            sum = sum + n;
            m--;
            multiply(n,m);
        }
        return sum;
    }

    public static int fibo(int n){
        int sum = 0;
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else {
            sum = fibo(n - 1) + fibo(n - 2);
            return sum;
        }
    }

    public static void main(String[] args){
        int sum = multiply(3,3);
        System.out.println(sum);

        int z = fibo(9);
        System.out.println(z);
    }
}