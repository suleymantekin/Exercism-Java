public class Hamming {

  String s1;
  String s2;
    Hamming(String leftStrand, String rightStrand) {

        s1 = leftStrand;
        s2 = rightStrand;
        if (s1.length() != s2.length()){
          throw new IllegalArgumentException();
        }
    }

    int getHammingDistance() {
        int counter = 0;
        if (s1.length() == s2.length()){
          for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
              counter++;
            }
          }
        }
        return counter;
    }
}
