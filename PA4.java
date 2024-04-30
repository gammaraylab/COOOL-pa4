import soot.*;
public class PA4 {
  public static void main(String[] args) {
    String classPath = ".";   // change to appropriate path to the test class
        String dir= "./unoptimizedClassFiles";
        //Set up arguments for Soot
        String[] sootArgs = {
            "-cp", classPath, "-pp", // sets the class path for Soot
            "-keep-line-number", // preserves line numbers in input Java files  
            "-main-class", "Test",  // specify the main class
            "-process-dir",dir
        };

    /* add a phase to transformer pack by call Pack.add */
    Pack jtp = PackManager.v().getPack("jtp");
    jtp.add(new Transform("jtp.AvailableExpressionAnalysis", new AnalysisTransformer()));
    soot.Main.main(sootArgs);
  }
}
