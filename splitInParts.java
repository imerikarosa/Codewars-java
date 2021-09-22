public class InParts {
    public static String splitInParts(String s, int partLength) {
        // your code
        StringBuilder stringBuilder = new StringBuilder();
      
        char[] charArray = s.toCharArray();
        int x = 0;
      
        for (int i = 0; i < charArray.length; i++) {
          stringBuilder.append(charArray[i]);
          
          if (x == partLength - 1) {
            stringBuilder.append(" ");
            x = -1;
          }
          x++;
          
        }
      return stringBuilder.toString().trim();
      
    }
}