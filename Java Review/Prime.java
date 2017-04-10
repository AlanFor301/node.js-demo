public class Prime{
  public static void main(String arg[]){
    int initial_digit = 102;
    if (primeNo(initial_digit)){
      System.out.println(initial_digit + " is a prime number!");
    }else{
      System.out.println(initial_digit + " is NOT a prime number!");
    }

  }

  public static boolean primeNo(int a){
    boolean result = false;
    for(int i =1; i < a; i++){
      if (a%i == 0){
        result = true;
      }
    }
    return result;
  }
}
