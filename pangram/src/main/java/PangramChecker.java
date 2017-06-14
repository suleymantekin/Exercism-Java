public class PangramChecker {

    public boolean isPangram(String input) {
      StringBuilder letters = new StringBuilder("abcdefghijklmnoprstuxqwvyz");
      String inp = input.toLowerCase();

      for (int i = 0; i < inp.length(); i++){
          int ind = letters.indexOf(Character.toString(inp.charAt(i)));
          if (ind != -1){ letters.deleteCharAt(ind);}
      }

      return (letters.length() == 0) ? true : false;
    }
}
