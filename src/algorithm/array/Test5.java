package algorithm.array;

/**
 * @author 浦希成
 * 2018/9/22 14:58
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }
    public static int Fibonacci(int n) {
        int a=0;
        int b=1;
        int i=2;
        while(i<=n){
            int temp=b;
            b=a+b;
            a=temp;
            i++;
        }
        return n==0?0:b;
    }
}
