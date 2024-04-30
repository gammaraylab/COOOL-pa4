class Test4{
    public static void main(String[] args) {
        int a = 433;
        int b = 433;
        int loop = 400000;

        long totalTimeMillis = 0;
        long totalTimeMicros = 0;

        for (int i = 0; i < 20; i++) {
           
            long[] time = HeavyCalculation(a, b, loop);
           
            long elapsedTimeMillis = time[0];
            long elapsedTimeMicros = time[1];

            totalTimeMillis += elapsedTimeMillis;
            totalTimeMicros += elapsedTimeMicros;
        }

        long averageTimeMillis = totalTimeMillis / 20;
        long averageTimeMicros = totalTimeMicros / 20;

        System.out.println("Average for 20 loops: " + averageTimeMillis + "ms and " + averageTimeMicros + " us");
    }

    public static long[] HeavyCalculation(int a, int b, int loop) {
        int product=-1;
        int x=a*a;
        int y;
        int tmp1,tmp2,tmp3,tmp4,tmp5,tmp6,tmp7,tmp8,tmp9;
        long startTime = System.nanoTime(); // Measure time in nanoseconds for higher precision

        for (int i = 1; i < loop; i++) {
            y=x*i-b;
            if(a == b)
                product = y;
            
            tmp1= y;
            dummy1(tmp1);
            
            System.out.println(product); 
        }

        long endTime = System.nanoTime();
        long elapsedTimeNano = endTime - startTime;
        long elapsedTimeMillis = elapsedTimeNano / 1_000_000; // Convert nanoseconds to milliseconds
        long elapsedTimeMicros = (elapsedTimeNano % 1_000_000) / 1_000; // Convert remaining nanoseconds to microseconds

        return new long[]{elapsedTimeMillis, elapsedTimeMicros, product};
    }

    static int dummy1(int tmp){
       return tmp+1;
    }
    
}
