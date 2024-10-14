package simpleQ;
class Patterns {

  public static void main(String args[]) {

    int n = 5;
    int i;
    int j;

    for(i=1; i<=n; i++) {

      for (j=1; j<=1+(n-i); j++) {
        System.out.print(i);
      }
      
      System.out.println();

    }
  }
}