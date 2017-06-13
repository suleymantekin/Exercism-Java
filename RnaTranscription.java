public class RnaTranscription {
    public String transcribe(String dnaStrand) {
     /* `G` -> `C`
      * `C` -> `G`
      * `T` -> `A`
      * `A` -> `U`
      */

      StringBuilder newRna = new StringBuilder(dnaStrand);

      for(int i = 0; i < newRna.length(); i++){
          if(newRna.charAt(i) == 'G'){
            newRna.setCharAt(i, 'C');
          }
          else if (newRna.charAt(i) == 'C'){
            newRna.setCharAt(i, 'G');}

          else if (newRna.charAt(i) == 'T'){
            newRna.setCharAt(i, 'A');}

          else if (newRna.charAt(i) == 'A'){
            newRna.setCharAt(i, 'U');
          }
        }
        String rna = new String(newRna);
        return rna;
      }
}
