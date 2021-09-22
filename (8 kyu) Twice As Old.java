public class TwiceAsOld{

    public static int TwiceAsOld(int dadYears, int sonYears){
      //TODO: Add code here
      
      /* First attempt
      
      int sonYearsDouble = sonYears * 2;
      
      if (dadYears >= sonYearsDouble){
          return dadYears - sonYearsDouble;
          }
      else{
          return sonYearsDouble - dadYears;
          }
      */
            
      return (int)Math.abs(dadYears - sonYears * 2);
          
    }
  
  }