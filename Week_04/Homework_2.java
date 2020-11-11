package java0.conc0303;


public class Homework_2 {
    public static void main(String[] args) throws InterruptedException {
        long start=System.currentTimeMillis();

        Thread t= new Thread(() -> result=sum());
        t.start();
        t.join();
        
        System.out.println("异步计算结果为："+ result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
    }

    static int result;

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
