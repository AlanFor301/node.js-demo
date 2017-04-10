public class FibNoRecursion{
  public static void main(String arg[]){
    int a = fibN(10);
    System.out.println("fib number is "+ a);
  }
  public static int fibN(int input){
    int base_0 = 0;
    int base_1 = 1;
    if(input == base_0) return 0;
    else if(input == base_1) return 1;
    else return fibN(input-1) + fibN(input-2);

    /* value reference does not work in switch case.
    switch(input){
      case base_0:
        return 0;
        break;
      case base_1:
        return 1;
        break;
      case input:
        return fibN(input -1) + fibN(input-2);
        */
    }
  }
