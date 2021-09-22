public class Kata {
    public static int lastChair(int n) {
      // TODO ;)
      
      /* chairs goes from 1 to n
         find chair's number (last patient) */
      
      int[] chairs = new int[n];
    
      for (int i = 1; i < chairs.length; i++){
        chairs[i] = i; 
      }
      
      return chairs[chairs.length - 1];
      
    }
  }