public class StarTriangle5 {
   /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   public static void starTriangle5() {
      // TODO: Fill in this function
      int i = 1;
      while (i <= 5){
         for (int j = 0; j < 5 - i; j++){
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
      starTriangle5();
   }
}