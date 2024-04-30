class Test2 {
  public static void main(String[] args) {
      long startTime = System.nanoTime(); // Start time in nanoseconds
      long endTime;
      long elapsedTimeMicros;
    int a=12;
    int b=32;
    int c=32;

    c=a+b;

    System.out.println("c"+c);
    c=test(223,43,54);
    System.out.println("c"+c);

      endTime = System.nanoTime(); // End time for test method
      elapsedTimeMicros = (endTime - startTime) / 1000; // Convert nanoseconds to microseconds
      System.out.println("Time taken: " + elapsedTimeMicros + " microseconds");
  }

  static int test(int a, int b, int c){
      int x=a/b;
      if(c>1)
        return a/b;
      if(c<3)
        return a/b;
      if(c>5)
        return a/b;
      if(c>32)
        return a/b;
      
      return a/b;
  }
}