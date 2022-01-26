public class Recursion{

  public static int factorial(int k){
    //base case
    if(k == 0){
      return 1;
    }
    //recursive case
    else{
      return k * factorial (k-1);
    }
  }

  public static boolean isEven(int k){
    //base case
    if (){
      return true;
    }
    else{

    }
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(factorial(10));
    System.out.println(factorial(0));
  }


}
