
public class StringInt{

  public static int stringToInt(String s){
        //return the value of Integer.parseInt(s) but do it yourself!
        //Do not use any built in parse methods.
    int value = 0;
    for(int k=0; k<s.length(); k++){
      char in = s.charAt(k);
      value+=valueOfDigit(in);
    }
    return value;
  }

  public static int valueOfDigit(char c){
    int value = c;
    return c - 48;
  }

  public static void main(String[] args) {
    System.out.println('4');
    System.out.println("Should return 17: " + stringToInt("041705"));
  }
}
