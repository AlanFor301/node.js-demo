import java.lang.Math;

public class Multiplication{
  public static void main(String[] args) {
    int initial_digit = 10;
    //FIXME: dont use add sign to accomplish the requirement
    String stringfy_initial_digit = Integer.toBinaryString(initial_digit)+ "000";
    System.out.println("\nbinary string is: " + stringfy_initial_digit);
    int result = binaryToInteger(stringfy_initial_digit) - initial_digit;
    System.out.println("\nthe integer result is: " + result);


  }
  /**
   * convert a binary_string to a integer.
   **/
  public static int binaryToInteger(String binary_string){
    int result = 0;
    for (int i = 0; i < binary_string.length(); i++){
      if (String.valueOf(binary_string.charAt(binary_string.length()-1-i)).equals("1")){
        result += Math.pow(2, i);
      }
    }
    return result;
  }
}
