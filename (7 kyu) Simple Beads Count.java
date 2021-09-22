public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      
      int redBeads;
      
      if (nBlue < 2) {
        return 0;
      }
      else {
        redBeads = (nBlue * 2) - 2;
      }
        return redBeads;
      
    }
}