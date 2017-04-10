public class FibNoRecursion{
  public static void main(String arg[]){
    int a = noRecursion(10);
    System.out.println("fib number is "+ a);
  }
  public static int fibN(int input){
    int base_0 = 0;
    int base_1 = 1;
    if(input == base_0) return 0;
    else if(input == base_1) return 1;
    else return fibN(input-1) + fibN(input-2);
    }
    public static int noRecursion(int input){
      int pre = 1;
      int current = 1;
      if(input == 0){
        current = 0;
      }else if(input == 1){
        current = 1;
      }else if(input >= 2){
        for(int i=2; i <= input; i++){
          int buffer = current;
          current = current + pre;
          pre = buffer;
          System.out.println("current fib No. is "+ current);
          }
        }
      return current;
    }

}
