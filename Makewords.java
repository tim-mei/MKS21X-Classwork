public class Makewords{

  public static void main(String[] args) {
    makeWords(4,"");
  }

  public static void makeWords(int size, String ans){
    if(size == 0){
      System.out.println(ans);
    }else{
      for(char c = 'a'; c<='z'; c++){
        makeWords(size - 1, ans + c);
      }
    }
  }
}
