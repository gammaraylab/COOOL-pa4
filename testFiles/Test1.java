class Test1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 32;
        int c = 32;

        long startTime = System.nanoTime(); // Start time in nanoseconds

        c = a + b;

        long endTime = System.nanoTime(); // End time in nanoseconds

        long elapsedTimeMicros = (endTime - startTime) / 1000; // Convert nanoseconds to microseconds

        System.out.println("c: " + c);
        System.out.println("Time taken for addition: " + elapsedTimeMicros + " microseconds");

        startTime = System.nanoTime(); // Start time for test method

        c = test(223, 43, 54);

        endTime = System.nanoTime(); // End time for test method

        elapsedTimeMicros = (endTime - startTime) / 1000; // Convert nanoseconds to microseconds

        System.out.println("c: " + c);
        System.out.println("Time taken for test method: " + elapsedTimeMicros + " microseconds");
    }

  static int test(int a, int b, int c){
      int x=a*b;
      if(c>x)
        return x;
      int k=a/b;
      if(c<x)
        return k;
      int m=a/b;
      return m;
  }
}