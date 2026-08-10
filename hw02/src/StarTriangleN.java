public class StarTriangleN {
   /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   public static void starTriangle(int N) {
      // TODO: Fill in this function
      int i = 1;
      while (i <= N){
         for (int j = 0; j < N - i; j++){
            IO.print(" ");
         }
         for (int k = 0; k < i; k++){
            IO.print("*");
         }
         IO.println();
         i++;
      }
   }
   
   public static void main(String[] args) {
      starTriangle(7);
   }
}