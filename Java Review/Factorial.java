public class Factorial{
  public static void main(String arg[]){
    int input = 10;
    System.out.println(input + "'s Factorial No. is "+ factorialNo(input));
  }
  public static int factorialNo(int input){
    int result = 1;
    while(input >= 2){
      result *= input;
      input -= 1;
      System.out.println("input is "+ input);
      System.out.println("result is "+ result+"\n");
    }
    return result;
  }
}
