
public class StringInt{

  public static int stringToInt(String s){
        //return the value of Integer.parseInt(s) but do it yourself!
        //Do not use any built in parse methods.
    int value = 0;
    for(int k=0; k<s.length(); k++){
      //look for the minus sign, then multiply the next value by -1
      char in = s.charAt(k);
      if(in == '-'){
        value+=valueOfDigit(s.charAt(k+1))*-1;
        k+=1;
      }
      else{
        value+=valueOfDigit(in);
      }
    }
    return value;
  }

  public static int valueOfDigit(char c){
    int value = c;
    return c - 48;
  }

  public static void main(String[] args) {
    System.out.println("Should return 17: " + stringToInt("4"));
    System.out.println("Should return 17: " + stringToInt("041705"));
    System.out.println("Should return -8: " + stringToInt("-8"));
    System.out.println("Should return -5: " + stringToInt("0-41-705"));
    System.out.println("Should return 0: " + stringToInt("0"));
    System.out.println("What a blank returns: " + stringToInt(""));
  }
}
