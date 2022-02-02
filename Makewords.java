public class Makewords{

  public static void main(String[] args) {
    makeWords(3,"");
    for(char c = 'a'; c<='c'; c++){
      System.out.print(c);
    }
    System.out.println();
  }

  public static void makeWords(int size, String ans){
    if(size == 0){
      System.out.println(ans);
    }else{
      makeWords(size - 1, ans + 'a');
    }
  }
}
