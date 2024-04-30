class Test3{
    public static void main(String[] args) {
        int a = 433;
        int b = 433;
        int loop = 100000;

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

        long startTime = System.nanoTime(); // Measure time in nanoseconds for higher precision

        for (int i = 1; i < loop; i++) {
            if(a>b)
                product = a*a + b;
            if(a<b)
                product = a*a;
            if(a == b)
                product = a*a-b;
            
            System.out.println(product); 
        }

        long endTime = System.nanoTime();
        long elapsedTimeNano = endTime - startTime;
        long elapsedTimeMillis = elapsedTimeNano / 1_000_000; // Convert nanoseconds to milliseconds
        long elapsedTimeMicros = (elapsedTimeNano % 1_000_000) / 1_000; // Convert remaining nanoseconds to microseconds

        return new long[]{elapsedTimeMillis, elapsedTimeMicros, product};
    }
}
